package one;

import one.Single;

public class MultiLevel extends Single {
	private void name() {

		System.out.println("name");
	}

	public static void main(String[] args) {
		MultiLevel a = new MultiLevel();
		a.gm();
		a.bye();
		a.name();
		a.hello();
	}
}
