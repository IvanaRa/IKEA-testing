package pages;

public class Ikea {

	private HomePage homePage;
	private LogInPage logInPage;
	private ChairPage chairPage;

	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;

	}

	public LogInPage getLogInPage() {
		if (logInPage == null) {
			logInPage = new LogInPage();
		}
		return logInPage;

	}

	public ChairPage getChairPage() {
		if (chairPage == null) {
			chairPage = new ChairPage();
		}
	
		return chairPage;

	}
}
