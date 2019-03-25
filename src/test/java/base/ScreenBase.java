package base;


public class ScreenBase extends TestBase {


	public ScreenBase() {


	}

	public void hideKeyboard() {
		System.out.println("hiding keyboard....");
		driver.hideKeyboard();
	}

}
