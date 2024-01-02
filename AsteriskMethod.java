import java.util.Scanner;
public class AsteriskMethod{
public void asterisk(int number, char variable){
for(int count = 1 ; count <= number; count++){
for(int counter =1 ; counter <= number; counter++){
System.out.print(variable);}
System.out.println();
}
}
public static void main(String abbey[]){
Scanner scanner = new Scanner(System.in);
AsteriskMethod input = new AsteriskMethod();
System.out.print("Enter a NUMBER: ");
int num = scanner.nextInt();
System.out.println("Enter a word: ");
char give = scanner.next().charAt(0);
input.asterisk(num, give);

}
}