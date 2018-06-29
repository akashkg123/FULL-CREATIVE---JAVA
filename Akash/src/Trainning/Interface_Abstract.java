package Trainning;

interface A_interface {
	static void methi1() {
		System.out.println("I am interface static method");

	}

	default void methi2() {
		System.out.println("I am default static method");

	}
	void b();

	void c();

	void d();

	void e();
}



abstract class A_abstract implements A_interface {
	public void c() {
		System.out.println("I am interface method in abstract class");
	}
	
	
	public void metha1() {
		System.out.println("I am normal method in abstract class");
	}
}

class A_class extends A_abstract implements A_interface {

	@Override
	public void b() {

		System.out.println("I am B interface method in normal class");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am D interface method in normal class");

	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("I am E interface method in normal class");

	}

}

// class B_normal extends A_abstract{
//
// @Override
// public void b() {
// // TODO Auto-generated method stub
//
// }
//
// @Override
// public void d() {
// // TODO Auto-generated method stub
//
// }
//
// @Override
// public void e() {
// // TODO Auto-generated method stub
//
// }
//
// }
public class Interface_Abstract {

	public static void main(String[] args) {
		A_interface ob=new A_class();
		ob.methi2();
		A_interface.methi1();
		
		A_abstract ob1=new A_class();
		ob1.metha1();
		
		
		// TODO Auto-generated method stub

	}

}
