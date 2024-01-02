import java.util.Scanner;
public class ChargesRate{
	public static double currentCharges1(double time){
		double charges = 0;
		if(time > 3){
		charges = (time - 3)*0.5;
		}
		if(time <= 3)
			charges = 2.0;
		return charges;
	}
	public static double calculateCharges(){
		double totalCharge = ChargesRate.currentCharges1(double time) * 2;
		return totalCharge;
		}
	public static void main(String abbey[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter parking space numbers available yesterday: ");
		int space = input.nextInt();
		double total = 0.0;
		String names[] =new String[space];
		double charges[] =new double[space];
		for(int count = 0 ; count < space; count++){
		System.out.println("Enter customers name: ");
		String name = input.nextLine();
		names[count]= name;
		System.out.println("Enter customers parking duration: ");
		double time = input.nextDouble();
		total +=currentCharges1(time);
		charges[count]= currentCharges1(time);

		}
		System.out.println("""
===============
names               total  
===============
""");
		for(int count = 0; count < space; count++){
		System.out.printf("%7s%16.2f%n",names[count],charges[count]);
		}
System.out.println("====================\n");
System.out.printf("total =%16.2f",total);
System.out.println("====================");
	}
}