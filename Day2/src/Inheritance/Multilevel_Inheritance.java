package Inheritance;

class GrandParent{
	void property() {
		System.out.println("It Grandparent's property");
	}
}

class Parent extends GrandParent{
	void land() {
		System.out.println("It Parent's property");
	}
}

class Child extends Parent{
	void ownProperty() {
		System.out.println("It child's property");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.ownProperty();
		c1.land();
		c1.property();

	}

}
