package Trail;

interface A_Inter {
	void name();
}

interface B_Inter {
	void name();
}

class Ab implements A_Inter, B_Inter {

	@Override
	public void name() {
		System.out.println("I am I implemented Interface");

	}

}

public class Interface_Check {

}
