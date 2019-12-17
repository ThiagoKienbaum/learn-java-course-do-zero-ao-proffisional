package arrays;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = { 8.8, 7.7, 6.6, 5.5 };
		
		for(double nota:notas) {
			System.out.print("[" + nota + "]");
		}
	}
}
