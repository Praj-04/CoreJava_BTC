package comi.abstraction.practice;

public class HPNotebook extends HP {

	@Override
	public void click() {
		System.out.println("HPNotebook click");

	}

	public static void main(String[] args) {
HPNotebook h = new HPNotebook();
h.click();
h.scroll();
	}

}
