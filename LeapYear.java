import java.util.Scanner;
public class LeapYear{
public boolean isLeapYear(int year){
int answer = year %4;
if(answer == 0 && (year != 1700)&& (year != 1800)&& (year != 1900) &&(year != 2300)&& (year != 2100)&& (year != 2200))
return true;
else{return false;}
}
public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter a year : ");
int year = input.nextInt();
LeapYear leap = new LeapYear();	
System.out.println(leap.isLeapYear(year));


	}
}