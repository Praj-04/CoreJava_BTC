package comi.abstraction.practice;

public class DellNotebook extends Dell {

	@Override
	public void click() {
		System.out.println("dellnotebook click");

	}

	public static void main(String[] args) {
		DellNotebook d = new DellNotebook();
	d.scroll();
	d.click();
	
	}

}
