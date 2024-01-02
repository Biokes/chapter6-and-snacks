import java.util.Scanner;
public class Multiples{
public static boolean isMultiples(int num, int number){
int answer = num %number;
if(answer == 0){
	return true;
}
else{
return false;
}
}
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
	System.out.println("How many time do you want to go");
	int run = input.nextInt();
	for(int count = 1; count <= run; count++){
	System.out.println("Enter a pair of numbers to check if the second number is a multiple of the first one: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	System.out.println("checking if " +number1 +" is a multiple of "+ number2 + ":"+ isMultiples(number1,number2));
	}

}
}