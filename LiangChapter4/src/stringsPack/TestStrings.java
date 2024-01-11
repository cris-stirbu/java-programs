package stringsPack;

public class TestStrings {

	public static void main(String[] args) {
		String s1="Welcome to Java";
		String s2="Programming is fun";
		String s3="Welcome to Java";
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println();
		
		System.out.println("We test == and equals() method via the ternary comparison operator");
		System.out.println((s1==s3?"true":"false")+"--> s1==s3");
		System.out.println((s1.equals(s3)?"true":"false")+"--> s1.equals(s3)");
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		
		System.out.println(s1.startsWith("Wel"));
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,11));
		
		System.out.println('1'+1+1);
		System.out.println('1'+1);
		System.out.println("1"+(1+1));
		
		System.out.println(1+"Welcome"+'a'+1);
		System.out.println(1+"Welcome "+('\u0001'+1));
		
	}

}
