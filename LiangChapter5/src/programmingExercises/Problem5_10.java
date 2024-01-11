package programmingExercises;

public class Problem5_10 {

	public static void main(String[] args) {
		int count=0;
		for(int n=100; n<=1000; n++) {
			if(n%3==0 && n%4==0) {
				count++;
				System.out.print(n+" ");
				if(count%10==0) System.out.println();
			}
		}

	}

}
