import java.security.SecureRandom;
import java.util.Scanner;
public class CoinToss{
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
Coin coinsStatus;
System.out.print("Enter 'Toss Coin' to toss the coin: ");
String answer = input.nextLine();
int head = 0;
int tail = 0;
while(answer.equalsIgnoreCase("Toss Coin")){
int coinsFliped = flip();
if(coinsFliped  == HEAD){head +=1;}
else{tail+=1;}
System.out.print("Enter 'Toss Coin to' toss the coin again: ");
answer = input.nextLine();
System.out.println("coin Tossed");
}
System.out.println("The total toss is "+ (head+ tail));
System.out.println("The tail toss is "+ tail);
System.out.println("The head toss is "+ head);

}
private enum Coin {HEADS,TAILS};
private static final SecureRandom random = new SecureRandom();
private final static int HEAD = 1;	
private final static int TAIL = 2;
public static int flip(){
int num = 1 + random.nextInt(2);
return num;
}
}