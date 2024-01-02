import java.util.Scanner;
public class Hypotenus{
public static double hypotenus(double adjascent, double opposite){
double answer = Math.pow(adjascent,2) +  Math.pow(opposite,2);
answer = Math.sqrt(answer);
return answer;
}
	public static void main(String abbey[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the adjascent: ");
		double adjascent = input.nextDouble();
		System.out.println("Enter the length of the opposite: ");
		double opposite = input.nextDouble();
		System.out.printf("%nHypotenus = %.2f",Hypotenus.hypotenus(adjascent, opposite) );

		


	}
}