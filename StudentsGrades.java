import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class StudentsGrades{
	private static Scanner input = new Scanner(System.in);

	public static void grades(){
		System.out.print("How many Students do have? ");
		int numStudents = input.nextInt();
		System.out.print("How many subjects do you offer? ");
		int numSubjects = input.nextInt();
		int grade[][] = new int[numStudents][numSubjects];
		System.out.println("\nSaving...................................\nSaved Successfully.\n\n");
		int totalScoreForStudent[] = new int[numStudents];
		int total = 0;
		double average =0.0;
		ArrayList<Double> averageScoresForStudents = new ArrayList<Double>();
		double averageScore[] = new double[numStudents];
		
		for(int students = 0; students < numStudents ; students++){
			System.out.println("\nEntering score for student" + (students+1)+ ":");
			total = 0;
			for(int subjects = 0; subjects < numSubjects ; subjects++){
				do{System.out.print("Enter Score for subject"+(subjects+1)+": ");
				grade[students][subjects] = input.nextInt();}while(grade[students][subjects]<1 || grade[students][subjects]>100);
				total += grade[students][subjects];
			}
			totalScoreForStudent[students]= total;
			averageScore[students] = total/numSubjects;
			averageScoresForStudents.add(averageScore[students]);
			System.out.println("\nSaving...................................\nSaved Successfully.\n");
		}
		Collections.sort(averageScoresForStudents);
		System.out.println(thickLines());
		System.out.printf("%s","students");
		for(int loop = 1 ; loop <= numSubjects; loop++){
		System.out.printf("   Sub%d",loop);
		}
		System.out.printf("%8s%10s%5s%n","Total","Average","POS");
		System.out.println(thickLines());
		for(int loop1 = 0; loop1< numStudents; loop1++ ){
			System.out.printf("Student%d",(loop1+1));
			for(int loop2 = 0; loop2 < numSubjects; loop2++){
				System.out.printf("%7d",grade[loop1][loop2]);
			}
		System.out.printf("%,8d%,10.2f",totalScoreForStudent[loop1],averageScore[loop1]); 
		for(int counter = 0; counter < numStudents ; counter++){
			if(averageScore[loop1]== averageScoresForStudents.get(counter)){
				System.out.printf("%5d%n",(numStudents)-(averageScoresForStudents.indexOf(averageScore[loop1])) );
				break;}
			}
	}
	System.out.println(thickLines());
	System.out.println(thickLines());
	System.out.println("\n\n");
	int hardest = -1;
	int easiest =-1;
	System.out.println("Subject Summary.");
	for(int counter = 0 ; counter <numSubjects ; counter++){
		System.out.println("\n\nSubject " + (counter+1) + ": ");
		int high = 0;
		int low =100;
		int count = 0;
		int highestScorer =0;
		int lowestScorer = 0;
		int passes = 0;
		int fails = 0;
		
		int totalScoreForSub =0; 
		double averageSubScore = 0.0;
				for(int loop2 = 0; loop2 < numStudents; loop2++){
					if(grade[loop2][counter] >= high){
						high = grade[loop2][counter];
						highestScorer = loop2+1;
						}
					if(grade[loop2][counter] >= 50){passes +=1;}
					else{fails+=1;}
					if(grade[loop2][counter] < low){low = grade[loop2][counter];
						lowestScorer = loop2+1;}
					totalScoreForSub+=grade[loop2][counter];
				}			
		
		System.out.println("The Highest Scoring Student is Student"+ (highestScorer) +" Scoring "+ high +".");
		System.out.println("The Lowest Scoring Student is Student"+ (lowestScorer) +" Scoring "+ low +".");
		System.out.println("The total Score is "+ totalScoreForSub);
		averageSubScore = total/(passes+fails);
		System.out.println("Average score is " + averageSubScore);
		System.out.println("Number of passes : "+ passes);
		System.out.println("Number of fails : " + fails);
		count+=1;
		int failed = 0;
		int passed = 0;
		int SubjectFailed = 0;
		int Subjectfails = 0;
		int previousPassed = 0;
		int previousFailed =0;
		int subjectPasses =0;
		if(counter+1 == numSubjects){
			for(int course = 0; course < numSubjects ; course++){
				failed =0;
				passed = 0;
				for(int player = 0 ; player < numStudents ; player++){
					if(grade[player][course] < 50 ){
						failed +=1;}else{passed +=1;
					}	
				}
				if(failed >previousFailed){
					previousFailed = failed;
					hardest = course;}
				if(passed >previousPassed){
					previousPassed =passed;
					easiest = course;}
				
			}
			int overallBestScore = grade[0][0];
			int bestScoredSub =0;
			int bestOwner = 0;
			int overallPoorScore= grade[0][0];
			int poorScoreSub = 0;
			int poorOwner =0;
			if(hardest >-1){
				System.out.println("\n\nThe hardest Subject is subject "+ (hardest+1)+ " with " + previousFailed + " failures.");
			}else{System.out.println("\n\nThere is no hard subject.");}
			if(easiest >-1){
				System.out.println("The easiest Subject is subject "+ (easiest+1) + " with "+ previousPassed + " passes.\n\n");
			}else{System.out.println("\n\nThere is no easy subject.");}
			for(int player = 0; player < numStudents; player++){
				for(int course = 0; course < numSubjects; course++){
					if(grade[player][course]> overallBestScore){overallBestScore = grade[player][course];
						bestScoredSub = course;
						bestOwner = player;}
					if(grade[player][course]< overallPoorScore){overallPoorScore = grade[player][course];
						poorScoreSub = course;
						poorOwner = player;}
					}
			}
			System.out.println("The overall Highest Score is scored by Student "+ (bestOwner+1) + " in subject "+ (bestScoredSub+1) +" Scoring "+ overallBestScore+ ".");
			System.out.println("The overall Lowest Score is scored by Student "+ (poorOwner+1) + " in subject "+ (poorScoreSub+1) +" Scoring "+ overallPoorScore+ ".");
			System.out.println("\n\n"+thickLines() + "\nCLASS SUMMARY\n"+ thickLines());
			String classBest = "Student ";
			String classDullest = "Student ";
			int bestScore =0;
			int worstScore =Integer.MAX_VALUE;
			total = 0;
			for(int loop = 0; loop<totalScoreForStudent.length; loop++ ){
				total +=totalScoreForStudent[loop];
				if( totalScoreForStudent[loop ] >= bestScore){
					if( totalScoreForStudent[loop ] == bestScore){
						classBest+=String.valueOf(loop+1)+", ";
						bestScore = totalScoreForStudent[loop];}
					else if(totalScoreForStudent[loop] > bestScore ){
						classBest = "Student "+String.valueOf(loop+1);
						bestScore = totalScoreForStudent[loop];}
					}
				if( totalScoreForStudent[loop ] <= worstScore){
					if( totalScoreForStudent[loop ] == worstScore){
						classDullest+=  String.valueOf(loop+1) +", ";
						worstScore = totalScoreForStudent[loop];}
					else if(totalScoreForStudent[loop] < worstScore ){
						classDullest = "Student "+ String.valueOf(loop+1);
						worstScore = totalScoreForStudent[loop];}
					}
	
			}
			System.out.println("The Best graduating student is  "+ classBest + " scoring " + bestScore);
			System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\nThe worst graduating student is  "+ classDullest + " scoring " + worstScore+"\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" + thickLines());
			System.out.println("\nClass Total Score is : " + total);
			System.out.println("Class Average Score is : " + (total/numStudents) + "\n" + thickLines());


		}
	}
}

	public static String thickLines(){
		String lines = "================================================================";
		return lines;
	}
	public static String thinLines(){
		String lines = "----------------------------------------------------------------";
		return lines;
	}

			
		
}