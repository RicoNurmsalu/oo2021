public class Kodutoo {

    public static void main(String[] args) {
        int tableSize = 9;
        printkorrutustabel(tableSize);
    }

    public static void printkorrutustabel(int tableSize) {
        // first print the top header row
        System.out.format("      ");
        for (int i = 1; i <= tableSize; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i = 1; i <= tableSize; i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}