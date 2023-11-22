import java.util.Random;
import  java.util.*;
public class NumberGame {
	
	static int randomno(){
		Random random_number = new Random(100);
		int x= random_number  .nextInt(100);
		
		return x ;
		
	}
	public static void main(String args[]){
		
		System.out.println("WelCome to Number Guessing Game ");
		System.out.println();
		System.out.println("rules for the game \n -> You will get total 5 chance  to Guess the number  \n -> After it you will lose the game \n ->At the time you can Enter one number  \n -> The number is in between 0 to 100 \n-> only Integers are allowed ");
		System.out.println();
		System.out.println("let the Random no will be x \n Now Guess the number ");

		
		int random = (int) (Math.random()*(100-0))+0;
		try{
		for(int i =0 ;i<5;i++){
			
			System.out.println(" \n =========================================================== ");
		System.out.print(" Guess for the generated number = ");
		 Scanner sc= new Scanner(System.in);
		 int guess =sc.nextInt();
		 if(guess == random){
			 
			 System.out.println("\n congratulations You hauve successfully  Guess the number "+"\n Winnner ");
			 break;
			 
			
			 
		 }
		 else if(guess<random &i <4){
			 System.out.println(" \nGuess number is less than actual no "+"\n Try again ");

		 }
		 else if(guess > random && i<4){
			 System.out.println("\n Guess number is Greater  than actual no  "+"\n Try again ");
		
		 }
		 else if(i==4 && guess!=random ){
			 System.out.println("\n \n =============================xxx============================ ");
			 System.out.println("\n Sorry  You hauve Lost the game  ");
		 }
		
		}
		}
		catch(Exception e){
			System.out.print("Error occured \n try again ");
		}
		System.out.print(random);
		
	}

}
