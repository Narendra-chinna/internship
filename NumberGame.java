import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=7;
		int finals=0;
		boolean playAgain=true;
		System.out.println("Welcome My Friend");
		System.out.println("Hey Friend you have "+chances+" Chances to win the game");
		
		while(playAgain)
		{
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0; i<chances; i++)
			{
				System.out.println("chance "+(i+1)+" guess the number");
				int user=sc.nextInt();
			    if(user==rand)
			    {
			    	guess=true;
			    	finals+=1;
			    	System.out.println("Congrats My Friend You Won The Game.");
			    	break;
			    }
			    else if(user>rand)
			    {
			    	System.out.println("Too High");
			    }
			    else
			    {
			    	System.out.println("Too Low");
			    }
			}
			if(guess==false)
			{
				System.out.println("you lost the game.The number is "+rand);
			}
			System.out.println("Do you want to play Again(yes/no)");
			String pa=sc.next();
			playAgain = pa.equalsIgnoreCase("YES");
		}
		System.out.println("that's it friend , hope u enjoyed it");
		System.out.println("here is u r score "+finals);
	}
		public static int getrandN(int min, int max)
		{
			return (int)(Math.random()*(max-min+1)+min);
		}

    
}
