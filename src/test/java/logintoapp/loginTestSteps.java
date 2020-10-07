package logintoapp;


import cucumber.api.java.en.*;
import org.junit.Assert;

public class loginTestSteps {

    private userLogsIn userlogsin;
    private String username;
    private String password;


    @Given("^user is on the login page$")
    public void userIsOnTheLogInPage() {

        userlogsin = new userLogsIn();
    }

    @And("^user clicks login button$")
    public void userClicksLoginButton() {

        System.out.println("user clicks login button");
    }

    @And("^user with username (.*) and password (.*) is listed in database$")
    public void userIsListedInDatabase(String name, String pass) {

        userlogsin.SetUserInDataBase(name, pass);
    }

    @When("^user enters username (.*) and password (.*)$")
    public void userEntersUserNameAndPassword$(String name, String pass) {
        System.out.println("user enters username: "+ name + " and password: " + pass);
        this.username = name;
        this.password = pass;
        userlogsin.logIn(name, pass);
    }

    @Then("^user logs in to home page$")
    public void userLogsInToHomePage() {
        Assert.assertTrue(userlogsin.isLoggedOn());
    }

    @And("^user sees successful log in message$")
    public void userSeesSuccessfulLogInMessage() {

        Assert.assertTrue(userlogsin.getMessage().equals("user is logged in"));
    }

    @But("^log in data is incorrect$")
    public void logInDataIsIncorrect() {
        String databaseUsername = userlogsin.getCurrentUsername();
        String databasePassword = userlogsin.getCurrentPassword();
        Assert.assertFalse(username.equals(databaseUsername) && password.equals(databasePassword));
    }

    @Then("^user is not forwarded to home page$")
    public void userIsNotForwardedToHomePage() {
        Assert.assertFalse(userlogsin.isLoggedOn());

    }

    @And("^user sees unsuccessful log in message$")
    public void userSeesUnsuccessfulLogInMessage() {
        Assert.assertTrue(userlogsin.getMessage().equals("user is not logged in"));

    }

}
