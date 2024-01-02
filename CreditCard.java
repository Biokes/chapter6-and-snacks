import java.util.Arrays;
import java.util.Scanner;
public class CreditCard{
	public static void main(String abbey[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Hello\nKindly Enter card details to verify: ") ;
	String details = input.nextLine();
getDetails(details);
	}
public static int cardNumberLength(String number){
int num = number.length();
return num;
}
public static String validCheck(String number){
int size= number.length();
int [] numberToIntArray = new int[size];
char helpingChar[] = number.toCharArray();
for(int count = 0 ; count < helpingChar.length; count++){
numberToIntArray[count] = Integer.valueOf(String.valueOf(helpingChar[count]));
}
int evenElements = 1;
for(int count = numberToIntArray.length -2; count <= 0; count-=2){
evenElements+=1;
}
int evens[] =new int[evenElements];
int evensTotal = 0;
int count1 = (numberToIntArray.length -2) ;
while( count1 >= 0){
	for(int counter = 0 ; counter < evens.length; counter++){
		evens[counter] = numberToIntArray[count1];
		if(evens[counter]*2 <= 9){
			evensTotal+= (evens[counter]*2) ;
		}
		else{
			evensTotal += ((evens[counter]*2)%10) + ((evens[counter]*2)/10)	;
		}
	}
count1-=2;}
int oddElements = 1;
for(int count = numberToIntArray.length -1 ; count <= 0; count-=2){
oddElements+=1;
}
int odds[] =new int[oddElements];
int oddTotal = 0;

for(int count = numberToIntArray.length -1; count >= 0; count-=2){
	for(int counter = 0 ; counter < odds.length; counter++){
		odds[counter] = numberToIntArray[count];
			oddTotal+= odds[counter] ;
	}
}
int plus = evensTotal + oddTotal;
String returnValue ;
if(plus%10 == 0){
	returnValue = "valid";
}else{
	returnValue = "Invalid";
	}
return returnValue;
}
public static String cardType(String number){
	String returnValue= "Invalid Card.";
		char cardNumber[] = new char[number.length()];
		cardNumber = number.toCharArray();
		String answer = "" + cardNumber[0];
		int variable = Integer.valueOf(answer);
		String ans = "" +cardNumber[1];
		int ariable = Integer.valueOf(ans);
		if(variable == (4)){
			returnValue = "Visa Cards.";}
		else if(variable==( 5)){
			returnValue = "Master Card.";}
		else if(variable == 6){
			returnValue = "Discover Cards";}
		else if(variable == 3 && ariable == 7){
			returnValue = "American Express Cards.";}
return returnValue; 
}
public static void getDetails(String number){
System.out.println("**************************************************\n**Credit Card Type: "+ cardType(number));
System.out.println("**Credit Card Number: "+ number);
System.out.println("**Credit Card Length: "+  cardNumberLength(number));
System.out.println("**Credit Card Validity status: "+ validCheck(number));
System.out.print("**************************************************");
}
}	