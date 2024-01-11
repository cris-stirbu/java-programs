package stringsPack;

public class StringsMethods {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";
		
		
		boolean isEqual = s1.equals(s2);
		System.out.println("s1.equals(s2)="+isEqual);
		
		isEqual=s1.equalsIgnoreCase(s2);
		System.out.println("s1.equalsIgnoreCase(s2)="+isEqual);
		
		int x=s1.compareTo(s2);
		System.out.println(x);
		
		x=s1.compareToIgnoreCase(s2);
		System.out.println(x);
		
		
		boolean b = s1.startsWith("AAA");
		System.out.println(b);
		
		b = s1.endsWith("AAA");
		System.out.println(b);
		
		x=s1.length();
		System.out.println(s1.length());
		
		char c = s1.charAt(0);
		System.out.println(c);
		
		
		String s = s1.substring(1);
		System.out.println(s);
		s=s1.substring(1,4);
		System.out.println(s);
		
		x = s1.indexOf('e');
		System.out.println(x);
		x=s1.lastIndexOf('e');
		System.out.println(x);
		x=s1.lastIndexOf("abc");
		System.out.println(x);
		
		
		int i=12345;
		double d=12345.67;
		System.out.println((i+"").length());
		System.out.println((((int)d)+"").length()+((d-(int)d)+"").length()-1);
		
		System.out.println((int)d);
		System.out.println(d-(int)d);
		
		
	}

}
