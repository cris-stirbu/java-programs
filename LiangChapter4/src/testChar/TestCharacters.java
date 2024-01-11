package testChar;

public class TestCharacters {

	public static void main(String[] args) {
		System.out.println((double)'A'+" "+(int)'1');
		System.out.println((char)40+" "+(char)59+" "+(char)79);
		System.out.println((char)0x40+" "+(char)0x5A);
		
		System.out.println();
		
		System.out.println('\t'+"this is a TAB character");
		
		System.out.println('\u345d');
		
		System.out.println();
		
		int i='1';
		int j='1'+'2'*('4'-'3')+'b'/'a';
		int k='a';
		char c=90;
		System.out.println(i+"; "+j+"; "+k+"; "+c);
		
		System.out.println();
		
		char x='a';
		char y='c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x-y);
		
		
		System.out.print("the code that generates a random lowercase letter:");
		System.out.println((char)(97+Math.random()*26));
		
	}

}
