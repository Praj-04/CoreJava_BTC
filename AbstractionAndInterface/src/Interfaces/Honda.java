package Interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Honda starts");
	}

	@Override
	public void stop() {
		System.out.println("Honda stops");
	}

}
