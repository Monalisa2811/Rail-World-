package Interface;

interface Printable{
	void print();
}

interface Showable{
	void print();
}

class Printer implements Printable,Showable{
	public void print() {
		System.out.println("Printing");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p=new Printer();
		p.print();

	}

}
