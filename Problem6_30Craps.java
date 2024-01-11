package programmingExercises;

public class Problem6_30Craps {

	public static void main(String[] args) {
		int dices=sumOfDices();
		boolean result=false;
		if(dices==7||dices==11) result=true;
		else if(dices==2||dices==3||dices==12) result=false;
		else {
			int point=dices;
			System.out.println("point is "+point);
			int value=sumOfDices();
			System.out.println("new value="+value);
			while(value!=7 && value!=point) {
				value=sumOfDices();
			   System.out.println("new value="+value);					
			}
			if(value==point) result = true;
			else result=false;
		}
		if(result) System.out.println("You win!");
		else System.out.println("you lose...");
		

	}

	public static int rollDice() {
		return (int)(1+Math.random()*6);
	}
	public static int sumOfDices() {
		int dice1=rollDice();
		int dice2=rollDice();
		System.out.println(dice1+"+"+dice2);
		int sum=dice1+dice2;
		return sum;
	}
}
