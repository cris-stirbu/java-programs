package formatOutput;

public class FormattingOutput {

	public static void main(String[] args) {
		System.out.printf("amount is %f %e\n",32.32, 32.32);
		System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
		System.out.printf("%6b\n", (1>2));
		System.out.printf("%6s\n", "Java");
		System.out.printf("%05d %06.1f", 32, 32.32);

	}

}
