package Abstract2;

public abstract class Parent {
	abstract void carrier();
	abstract void subject();
}


class Son1 extends Parent{

	@Override
	void carrier() {
		// TODO Auto-generated method stub
		System.out.println("Son can decide their carrier");
		
	}

	@Override
	void subject() {
		// TODO Auto-generated method stub
		System.out.println("Math Chemistry English");
		
	}
	
}

