package Trail;

interface Instance {

}

class A_Instanceof implements Instance {
	public void meth() {
		System.out.println("Hi I am FIRST Class FIRST Method");
	}
}

class B_Instanceof implements Instance {
	public void meth() {
		System.out.println("Hi I am SECOND Class FIRST Method");
	}
}

class C_Instanceof {
	public void meth(Instance oo) {
		System.out.println("Hi I am THIRD Class FIRST Method");

		if (oo instanceof A_Instanceof) {
			A_Instanceof ob = (A_Instanceof) oo;
			ob.meth();

		} else if (oo instanceof B_Instanceof) {
			B_Instanceof ob = (B_Instanceof) oo;
			ob.meth();

		}
	}
}

public class Instanceof {

	public static void main(String[] args) {
		Instance oo = new B_Instanceof();
		C_Instanceof ob2 = new C_Instanceof();
		ob2.meth(oo);
	}

}
