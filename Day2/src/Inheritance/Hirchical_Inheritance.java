package Inheritance;

class Parent1{
	void punishment() {
		System.out.println("Parent can punish");
	}
}

class Girl1 extends Parent1{
	void g1() {
		System.out.println("Simple girl ");
	}
}

class Boy extends Parent1{
	void b1() {
		System.out.println("Dangerious");
	}
}
public class Hirchical_Inheritance {

	public static void main(String[] args) {
		Boy b=new Boy();
		b.b1();
		b.punishment();

	}

}
