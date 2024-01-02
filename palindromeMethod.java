import java.util.Scanner;
public class PalindromeMethod{
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
if(isPalindrome(num) == true){
System.out.println(num +" is a palindrome.");
}else{
System.out.println(num + " is not  a palindrome(" + makePalindrome(num)+ ")." );
}
}
public static boolean isPalindrome(int number){
String num = "";
num += number;
int lengthOfNum = num.length();
String returnValue= "";
for(int count = lengthOfNum-1; count>= 0; count--){
returnValue+= num.charAt(count);
}
if(number == Integer.decode(returnValue))
return true;
else{return false;}
}
public static int makePalindrome(int number){
String num = String.valueOf(number);
int lengthOfNum = num.length();
String returnValue= "";
for(int count = lengthOfNum-1; count>= 0; count--){
returnValue+= num.charAt(count);
}
int returnValue1 =Integer.decode(returnValue);
return returnValue1;
}
}