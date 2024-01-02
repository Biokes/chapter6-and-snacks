import java.util.Scanner;
public class BeautifyingStrings{
	public static String beautifyString(String given){
		String returnValue = "";
		boolean answer = isCapitalized(given);
		boolean fullStop= isFullStop(given);
		if(answer== true && fullStop== true){return given;}
		if(answer== true && fullStop== false){
		returnValue = given +  ".";
		return returnValue;}
		if(answer == false && fullStop==true){
		returnValue = "";
		for(int count = 0 ; count <given.length() ; count++){
			returnValue+=String.valueOf(given.charAt(count));
			if(count == 0)returnValue = returnValue.toUpperCase();
					}
		return returnValue;
			}
		if(!(answer== true && fullStop== true)){
			 returnValue = "";
		for(int count = 0 ; count <given.length() ; count++){
			returnValue+=String.valueOf(given.charAt(count));
			if(count == 0){returnValue = returnValue.toUpperCase();}
		}
		returnValue+=".";
			}
		return returnValue;
		}
	public static boolean isCapitalized(String name){
	String name2 = String.valueOf(name.charAt(0)).toUpperCase();
	if(name2.equals(name.charAt(0))){
	return true;}
	else{ return false;}
	}
	public static boolean isFullStop(String name){
	int reply = name.length();
	String name2 = ".";
	if(name2.equals(name.charAt(reply-1))){
	return true;}
	else{ return false;}
	}

public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = input.nextLine();
System.out.println(beautifyString(word));
}
}