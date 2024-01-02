public class PerfectNumbers{
public static void main(String abbey[]){
for(int count = 1; count<= 1000; count++){
if(isPerfect(count)== true)
System.out.println(count);
}

}
public static boolean isPerfect(int number){
int total = 0;
for(int counter = 1; counter < number; counter++){
if (number%counter== 0){
total +=  counter;}
}
if(total == number){return true;}
else{return false;}
}
}