import java.time.LocalDate;
import java.util.TimeZone;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class CheckOut{
	public static void main(String abbey[]){
Scanner input = new Scanner(System.in);
System.out.print("What is the customers name: ");
String name = input.nextLine();
ArrayList<String> goods = new ArrayList<String>();
ArrayList<Integer> units = new ArrayList<Integer>();
ArrayList<Double> price = new ArrayList<Double>();
ArrayList<Double> totalPrice = new ArrayList<Double>();
String option;
int total;
do{
System.out.print("what did the customer buy: ");
String item = input.next();
goods.add(item);
System.out.print("how many pieces: ");
int pieces = input.nextInt();
units.add(pieces);
System.out.print("How much per unit: ");
double unitPrice = input.nextDouble();
price.add(unitPrice);
totalPrice.add(unitPrice* pieces);
System.out.print("Add more items(yes to continue and any other to stop)? ");
option = input.next();
}while(option.equalsIgnoreCase("yes"));
System.out.println("What is your name: ");
String cashier = input.next();
System.out.print("How much discount will " + name + " get in percent: ");
double discount = input.nextDouble();
System.out.println("\n\n\nBIOKES SUPERSTORES.");
System.out.println("MAIN BRANCH\n1,ABBEY CRESCENT, YABA, LAGOS.\n TEL: 41274919.");
System.out.println("Date:" + getDateAndTime());
System.out.print("\n");
System.out.println("Cashier's name: "+ cashier);
System.out.println("Customer's name: "+ name);
System.out.println(getLine());
System.out.printf("%n%15s%8s%15s%15s%n","Item","QTY","Price($)","Total($)");
System.out.println(getTiny());
for(int count = 0; count < goods.size();count++){
System.out.printf("%n%15s%8d%,15.2f%,15.2f\n",goods.get(count),units.get(count),price.get(count),totalPrice.get(count));}
System.out.println(getTiny());
double gross= 0.0;
for(int count = 0; count < totalPrice.size(); count++){
gross+=totalPrice.get(count);
}
System.out.printf("%33s%,20.2f%n","Sub Total:", gross);
System.out.printf("%33s%,20.2f%n","Discount:",(discount*gross/100));
System.out.printf("%33s%,20.2f%n","17%VAT",(17*gross/100));
System.out.println(getLine());
double netPrice = gross+(17*gross/100)-(discount*gross/100);
System.out.printf("%33s%,20.2f%n","Bill Total:",netPrice);
System.out.println(getLine());
System.out.printf("THIS IS NOT A RECIEPT KINDLY PAY $%.2f%n",netPrice);
System.out.println(getLine()+"\n\n\n\n");
System.out.print("How much did the customer give to you: ");
double cash = input.nextDouble();
while(cash<netPrice ){
System.out.print("Insuffient balance for the goods ask for more!!!!!!!!!!!\nHow much did the customer give to you: ");
cash = input.nextDouble();}
System.out.print("""





""");
System.out.println("\n\n\nBIOKES SUPERSTORES.");
System.out.println("MAIN BRANCH\n1,ABBEY CRESCENT, YABA, LAGOS.\n TEL: 41274919.");

System.out.println("Date:" +getDateAndTime());
System.out.print("\n");
System.out.println("Cashier's name: "+ cashier);
System.out.println("Customer's name: "+ name);
System.out.println(getLine());
System.out.printf("%n%15s%8s%15s%15s%n","Item","QTY","Price($)","Total($)");
System.out.println(getTiny());
for(int count = 0; count < goods.size();count++){
System.out.printf("%n%15s%8d%,15.2f%,15.2f\n",goods.get(count),units.get(count),price.get(count),totalPrice.get(count));}
System.out.println(getTiny());
for(int count = 0; count < totalPrice.size(); count++){
gross+=totalPrice.get(count);
}

System.out.printf("%33s%,20.2f%n","Sub Total:", gross);
System.out.printf("%33s%,20.2f%n","Discount:",(discount*gross/100));
System.out.printf("%33s%,20.2f%n","17%VAT",(17*gross/100));
System.out.println(getLine());
double bills = cash - netPrice;
System.out.printf("%33s%,20.2f%n","Bill Total:",netPrice);
System.out.printf("%33s%,20.2f%n%33s%,20.2f%n","Amount paid:",cash,"Balance:",bills);
System.out.println(getLine());
System.out.printf("%15s%s."," ","THANKS FOR THE PATRONAGE");
System.out.println("\n" + getLine());
	}
public static String getLine(){
String output = "=====================================================";
return output;
}
public static String getTiny(){
String tiny = "-----------------------------------------------------";
return tiny;
}
public static String getDateAndTime(){
LocalDate date = LocalDate.now();
long secondsTotal = System.currentTimeMillis();
long seconds = (secondsTotal/1000)%60;
long minutesTotal = ((secondsTotal/1000)/60);
long minutes  = minutesTotal %60;
long hoursTotal = minutesTotal /60;
int hours = (int)(hoursTotal %24);
hours +=1;
String dates = "" + date;
String returnValue = dates+ "   " +  hours  +":" +minutes+ ":" + seconds;
return returnValue;
}
}