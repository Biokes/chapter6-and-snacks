import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class MBTI{
	
	public static void main(String codes[]){
		String answerGotten[] = new String[20];
		String personality  = personalityTypes();
		System.out.println(personality);
		personalityNote(personality);
	}
	private static Scanner input = new Scanner(System.in);
	public static String getName(){
		System.out.print("What is your name: ");
		String name = input.next();
		return name;
		}

		public static String[] questions(int num){
		String returnValue[][] = new String[20][2];
		returnValue[0][0] = "A. Expend Energy , Enjoy Groups.";
		returnValue[0][1]= "B. Conserve Energy, Enjoy one-on-one,";
		returnValue[1][0] = "A. Interpret Literally";
		returnValue[1][1]= "B. Look for meaning and possibilities.";
		returnValue[2][0] = "A. Logical,Thinking,Questioning .";
		returnValue[2][1]=  "B. Emphatic,Feeling,Acccomodating.";
		returnValue[3][0] = "A.. Organized,Orderly .";
		returnValue[3][1] = "B. Flexible,Adaptable.";	
		returnValue[4][0] = "A.. More Outgoing, Think Out Loud.";
		returnValue[4][1]= "B. More Reserved, Think to Yourself.";
		returnValue[5][0] = "A..Practical,Realistic ,Experimental.";
		returnValue[5][1] = "B. Imaginative, Innovative, Theoretical";
		returnValue[6][0] = "A..Candid , Straight Forward, Frank .";
		returnValue[6][1] ="B. Tactful , kind , Encouraing.";
		returnValue[7][0] = "A..Plan , Schedule.";
		returnValue[7][1] ="B. Unplanned , Spontaneous.";
		returnValue[8][0] = "A.. Seek many Tasks,Public Activities,Interaaction With Others.";
		returnValue[8][1] = "B. Seek pPrivate, Solitary Activities With Quiet to concentrate.";
		returnValue[9][0] = "A..Stsndard , Usual, Conventional.";
		returnValue[9][1] = "B.Different, Novel, Unique.";
		returnValue[10][0] = "A..  Firm, Tend to Criticize, Hold the line.";
		returnValue[10][1] = "B.  Gentle , Tend to Appreciate,Conciliate. ";
		returnValue[11][0] = "A.. Regulated,  Structured.";
		returnValue[11][1] = "B, EasyGoing, Live and Let live.";
		returnValue[12][0] = "A.External , Communicative, Express Yourself " ;
		returnValue[12][1] = " B. Internal, Reticent , Keep to yourself.";
		returnValue[13][0]= "A.. Focus On Here-and-now";
		returnValue[13][1]="B. Look to the future, Global perspective, Big picture.";
		returnValue[14][0]=  "A..Tough minded, Just.";
		returnValue[14][1]= "B. Tender-Hearted, Merciful.";
		returnValue[15][0] = "A.. Preparation, Plan Ahead." ;
		returnValue[15][1]="B. Go With the Flow, Adapt as you Go.";
		returnValue[16][0] = "A.. Active, Initiate.";
		returnValue[16][1]="B. Reflective,Deliberate.";
		returnValue[17][0]  = "A.. Facts, Things,What is.";
		returnValue[17][1]=" B. Ideas, Dreams,  what could be , Philosophical.";
		returnValue[18][0] = "A.. Matter of Fact, Issue-Oriented.";
		returnValue[18][1]="B. Sensitive, People-Oriented, Compassionate.";
		returnValue[19][0] = "A.. Control, Govern.";
		returnValue[19][1] = "B.Latitude, Freedom .";
		return returnValue[num];
		}
	private static String[]  getAnswer(String []variable){
		String reply[]= new String[2];
		String choice = "";			
				do{
					System.out.printf("%n%s	%s: ",variable[0],variable[1]);
					choice = input.next().toUpperCase();
					if( !(choice.equalsIgnoreCase("A") ||  choice.equalsIgnoreCase("B")) ){
						System.out.println("Expected 'A' or 'B' as Response\nI know this is an Error, pls try again. ");
					}
				}while( !(choice.equalsIgnoreCase("A") ||  choice.equalsIgnoreCase("B")) );
				
	
			reply[0] = choice;
			if(choice.equals("A")){reply[1] = variable[0];}else{reply[1] = variable[1];}
		return reply;
	}
	private static String personalityTypes(){
		String personalityType = "";
		String [][] personality = new String[20][2];
		String username = getName();
		System.out.println();
		for(int count = 0; count < 20;count++){
			String [] question = questions(count);
			personality[count] = getAnswer(question);
		}
		int introvert= 0;
		int extrovert =0;
		System.out.println("\n\nHello "+ username + ", you selected : ");
		for(int count = 0;count < 20; count+=4){
			if(personality[count][0].equalsIgnoreCase("A")){extrovert+=1;}else{introvert+=1;}
			System.out.println(personality[count][1]);
		}
		System.out.println("Number of A's selected is "+ extrovert);
		System.out.println("Number of B's selected is "+ introvert);
		System.out.println();
		if(introvert > extrovert){personalityType += "I";}else{personalityType +="E";}
		int sensing= 0;
		int intuitive =0;
		for(int count = 1;count < 20; count+=4){
			if(personality[count][0].equalsIgnoreCase("A")){sensing +=1;}else{intuitive+=1;}
			System.out.println(personality[count][1]);
		}
		System.out.println("Number of A's selected is "+ sensing);
		System.out.println("Number of B's selected is "+ intuitive);
		System.out.println();
		if(sensing > intuitive){personalityType += "S";}else{personalityType +="N";}
		int thinking= 0;
		int feeling =0;
		for(int count = 2;count < 20; count+=4){
			if(personality[count][0].equalsIgnoreCase("A")){extrovert+=1;}else{introvert+=1;}
			System.out.println(personality[count][1]);
		}
		System.out.println("Number of A's selected is "+ thinking);
		System.out.println("Number of B's selected is "+ feeling);
		System.out.println();
		if(thinking > feeling){personalityType += "T";}else{personalityType +="F";}
		int judging= 0;
		int perspective =0;
		for(int count = 3;count < 20; count+=4){
			if(personality[count][0].equalsIgnoreCase("A")){judging+=1;}else{perspective+=1;}
			System.out.println(personality[count][1]);
		}
		System.out.println("Number of A's selected is "+ judging);
		System.out.println("Number of B's selected is "+ perspective);
		if(judging > perspective){personalityType += "J";}else{personalityType +="P";}
		System.out.println();
		return personalityType;
	}
	public static void personalityNote(String num){
		if(num.equals("INFP")){
			System.out.println("\nINFP\nThe Healer\nINFPs are imaginative idealists, guided by their own core values and beliefs.\n To a Healer, possibilities are paramount; the reality of the moment is only of passing concern.\n They see potential for a better future, and pursue truth and meaning with their own flair.");}
		if(num.equals("INTJ")){
			System.out.println("\nINTJ\nThe Mastermind\nINTJs are analytical problem-solvers, eager to improve systems and processes with their innovative ideas.\nThey have a talent for seeing possibilities for improvement, whether at work, at home, or in themselves.");}
		if(num.equals("INFJ")){
			System.out.println("\nINFJ\nThe Counselor\nINFJs are creative nurturers with a strong sense of personal integrity and a drive to help others realize their potential.\nCreative and dedicated, they have a talent for helping others with original solutions to their personal challenges.");}
		if(num.equals("INTP")){
			System.out.println("\nINTP\nThe Architect\nINTPs are philosophical innovators, fascinated by logical analysis, systems, and design.\nThey are preoccupied with theory, and search for the universal law behind everything they see.\nThey want to understand the unifying themes of life, in all their complexity.");}
		if(num.equals("ENFP")){
			System.out.println("\nENFP\nThe Champion\nENFPs are people-centered creators with a focus on possibilities and a contagious enthusiasm for new ideas, people and activities.\nEnergetic, warm, and passionate, ENFPs love to help other people explore their creative potential.");}
		if(num.equals("ENTJ")){
			System.out.println("\nENTJ\nThe Commander\nENTJs are strategic leaders, motivated to organize change.\nThey are quick to see inefficiency and conceptualize new solutions,\nand enjoy developing long-range plans to accomplish their vision.\nThey excel at logical reasoning and are usually articulate and quick-witted.");}
		if(num.equals("ENTP")){
			System.out.println("\nENTP\nThe Visionary\nENTPs are inspired innovators, motivated to find new solutions to intellectually challenging problems.\nThey are curious and clever, and seek to comprehend the people, systems, and principles that surround them.");}
		if(num.equals("ENFJ")){
			System.out.println("\nENFJ\nThe Teacher\nENFJs are idealist organizers, driven to implement their vision of what is best for humanity.\nThey often act as catalysts for human growth because of their ability to see potential in other people and their charisma in persuading others to their ideas.");}
		if(num.equals("ISFJ")){
			System.out.println("\nISFJ\nThe Protector\nISFJs are industrious caretakers, loyal to traditions and organizations.\nThey are practical, compassionate, and caring, and are motivated to provide for others and protect them from the perils of life.");}
		if(num.equals("ISFP")){
			System.out.println("\nISFP\nThe Composer\nISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with cheerful, low-key enthusiasm.\ney are flexible and spontaneous, and like to go with the flow to enjoy what life has to offer.");}
		if(num.equals("ISTJ")){
			System.out.println("\nISTJ\nThe Inspector\nISTJs are responsible organizers, driven to create and enforce order within systems and institutions.\nThey are neat and orderly, inside and out, and tend to have a procedure for everything they do.");}
		if(num.equals("ISTP")){
			System.out.println("\nISTPT\nThe Craftsperson\nISTPs are observant artisans with an understanding of mechanics and an interest in troubleshooting.\nThey approach their environments with a flexible logic, looking for practical solutions to the problems at hand.");}
		if(num.equals("ESFJ")){
			System.out.println("\nESFJ\nThe Provider\nESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to their responsibilities.\nThey are highly attuned to their emotional environment and attentive to both the feelings of others and the perception others have of them.");}
		if(num.equals("ESFP")){
			System.out.println("\nESFP\nThe Performer\nESFPs are vivacious entertainers who charm and engage those around them.\nThey are spontaneous, energetic, and fun-loving, and take pleasure in the things around them:\nfood, clothes, nature, animals, and especially people.");}
		if(num.equals("ESTJ")){
			System.out.println("\nESTJ\nThe Supervisor\nESTJs are hardworking traditionalists, eager to take charge in organizing projects and people.\nOrderly, rule-abiding, and conscientious, ESTJs like to get things done,\n and tend to go about projects in a systematic, methodical way.");}
		if(num.equals("ESTP")){
			System.out.println("\nESTP\nThe Dynamo\nESTPs are energetic thrillseekers who are at their best when putting out fires, whether literal or metaphorical.\nThey bring a sense of dynamic energy to their interactions with others and the world around them.");}
	}
}