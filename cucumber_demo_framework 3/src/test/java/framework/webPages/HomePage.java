package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.SharedSD;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("u_0_e");
	private By lastNameTextField = By.id("u_0_g");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	private By messengerLink = By.xpath("//a[contains(text(),'Messenger')]");
	private By signupButton = By.id("u_0_y");
	private By redButton = By.xpath("//div[@id='u_0_i']//i[@class='_5dbc img sp_iIvgq58YJ3n_2x sx_b687c7']");
	private By emailErrorMessage = By.xpath("//div[@id='js_135']");
	private By signUpPassword = By.name("reg_passwd__");
	private By signUpEmail = By.name("reg_email__");
	private By darkSkyAPIButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
	private By darkSkyLoginButton = By.xpath("//a[contains(text(),'Log In')]");


	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}

	public void enterSignUpEmail(String enteremail){setValue(signUpEmail, enteremail);}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}

	public boolean isSignupButtonEnable() {
		return isElementEnabled(signupButton);
	}

	public void clickOnPasswordField(){clickOn(signUpPassword);}

	public void clickOnRedButton(){clickOn(redButton);}

	public String  getInvalidEmailMessage(){return getTextFromElement(emailErrorMessage);}

	public void clickOnApiButton(){clickOn(darkSkyAPIButton);}

	public void clickOnLoginPage(){clickOn(darkSkyLoginButton);}





}
