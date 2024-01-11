package programmingExercises;

public class Problem5_11 {

	public static void main(String[] args) {
		int count =10;
		for(int n=100;n<=200;n++)
			if(((n%3==0)||(n%4==0))&&!(n%3==0 && n%4==0)) {
				count++;
				System.out.print(n+" ");
				if(count %10==0) System.out.println();
			}

	}

}
