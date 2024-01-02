import java.util.Scanner;
public class GreatestCommonDivisor{
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter A NUMBER: ");
int num1 = input.nextInt();
System.out.println("Enter the second number");
int num2 = input.nextInt();
System.out.println(gCD(num1,num2));

}
public static int gCD(int number, int number1){
int controller = Math.min(number, number1);
int gcd = 0;
for(int count = 1; count <= controller; count++){
if(number% count== 0 && number1 % count == 0){
gcd = count;}
	}
return gcd;
}
}