package Training;

import java.util.Scanner;

import Training.Login.Login_class;

interface Login {

	class Login_class {

		private String user;
		private String pass;

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}
	}

	// public default void akash() {
	//
	// System.out.println("I am default method");
	//
	// }

	public Login_class details(Login_class ob);
}

class Set implements Login {

	@Override
	public Login_class details(Login_class ob) {
		Scanner sc = new Scanner(System.in);
		String a, b;

		System.out.println("Create an UserName: ");
		a = sc.nextLine();

		System.out.println("Create a Password: ");
		b = sc.nextLine();

		ob.setUser(a);
		ob.setPass(b);

		sc.close();

		return ob;

	}

}

class Display implements Login {

	@Override
	public Login_class details(Login_class ob) {

		System.out.println(ob.getUser());
		System.out.println(ob.getPass());

		

		return ob;
	}


}

class Trail implements Login {

	@Override
	public Login_class details(Login_class ob) {
		// TODO Auto-generated method stub
		return null;
	}

	public void akash() {
		System.out.println("I am Overrided Default method");

	}

}

class Trail1 implements Login {

	@Override
	public Login_class details(Login_class ob) {
		// TODO Auto-generated method stub
		return null;
	}

	public void meth() {
		System.out.println("I am Trail2 Normal method!!");
	}

}

public class Interface_class {
	public static void main(String[] args) {

		Login.Login_class ob = new Login_class();

		Set ob1 = new Set();
		ob1.details(ob);

		Display ob2 = new Display();
		ob2.details(ob);

		// Login ob1 = new Trail();
		// ob1.akash();
		//
		// Login ob2 = new Trail1();
		// ob2.details(ob);
		// int a;
		// System.out.println();

		for (String a : args) {
			System.out.println(a);
		}

	}
}
