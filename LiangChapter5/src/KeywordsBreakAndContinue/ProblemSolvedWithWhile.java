package KeywordsBreakAndContinue;
//this way of solving produces an infinite loop
//for avoiding the infinite loop, break should be used instead of continue
public class ProblemSolvedWithWhile {

	public static void main(String[] args) {
		int i=0,sum=0;
		while(i<4) {
			if(i%3==0) continue;
			sum +=i;
			i++;
		}

		System.out.println(sum);	}

}
