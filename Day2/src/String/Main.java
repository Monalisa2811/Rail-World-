package String;

public class Main {

	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		String c="ab";
		c="ef";
		
		String str1= new String();
		String str2= new String();
		String str3= new String("ab");
		
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println(c);
		
		System.out.println(str1==str2);
		System.out.println(str3.equals(c));

	}

}
