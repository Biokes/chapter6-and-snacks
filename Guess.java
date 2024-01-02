import java.security.SecureRandom;
import java.util.Scanner;
public class Guess{
private final static SecureRandom random = new SecureRandom();
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
String ans;
do{
System.out.println("Guess the number: ");
int number =  input.nextInt();
int guess = getNum();
while(!(number == guess) ){
System.out.println("Try again: ");
if(number > guess ){System.out.println("Too high!!!");}
else{System.out.println("Too Low!!!");}

number =  input.nextInt();
if(number > guess ){System.out.println("Too high!!!");}
else{System.out.println("Too Low!!!");}
}
if(number == guess){System.out.println("Congratulations!!!");}
System.out.println("Do you still want to continue yes/no: ");
ans =  input.next();
while(!(ans.equalsIgnoreCase("yes")|| ans.equalsIgnoreCase("no"))){
System.out.println("Do you still want to continue yes/no: ");
ans =  input.next();
}
 guess = getNum();}while(ans.equalsIgnoreCase("yes"));

}
public static int getNum(){
int returnValue =1 +  random.nextInt(1001);
return returnValue;
}
}