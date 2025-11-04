import java.util.*;
public class HackathonApp{
	public static void main(String []args){
		int highest=0;
		String winnerUnivesity="";
		String [] universities={"TUT","NMU","UP","UL","WSU","VUT","UJ"};
		int [] judgeScores={75,65,60,55,60,70,77};
		int [] onlineScores=new int[universities.length];
		int [] totalScores=new int[universities.length];
		
		Random rd=new Random();
		for(int i = 0; i < universities.length; i++){
			onlineScores[i]=rd.nextInt(96)+5;
		}
		for(int y=0 ; y < universities.length; y++){
			totalScores[y]=onlineScores[y] + judgeScores[y];
			if(totalScores[y] > highest){
				highest=totalScores[y];
				winnerUnivesity=universities[y];
			}
		}
		System.out.println("Univesities\tjudge score\tOnline score\tTotal score");
		for(int i=0; i <universities.length; i++){
			System.out.println(universities[i]+"\t\t"+judgeScores[i]+"\t\t"+onlineScores[i]+"\t\t"+totalScores[i]);
		}
		System.out.println("The hackarthon winners is "+winnerUnivesity+"\t"+"total score: "+highest);
	}
}