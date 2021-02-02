public class Funktsioonid{
	public static double taksosõit(double km){
		return 3+km*0.8;
	}
	public static String temperatuuriHinnang(int t){
		if(t<18){return "külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		System.out.println(taksosõit(Double.parseDouble(arg[1])));
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
	}
}