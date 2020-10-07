package atmTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class atmTestSteps {

    @Before(order = 0)
    public void setUp1() {
        System.out.println("This method runs prior test scenario 1");
    }

    @Before(order = 1)
    public void setUp2() {
        System.out.println("This method runs prior test scenario 2");
    }

    @Given("Account balance of 200 eur")
    public void accountBalance() {

        System.out.println("Account with balance \n");
    }

    @When("User tries to withdraw 300 eur")
    public void userWithdrawsAmountMoney() {

        System.out.println("User withdraws amount from account \n");
    }

    @Then("Account balance remains the same and equals 200 eur")
    public void verifyBalanceAccount() {

        System.out.println("Verifying account balance \n");
    }

    @After(order = 1)
    public void teatDown2() {
        System.out.println("This method runs after test scenario 2");
    }

    @After(order = 0)
    public void teatDown1() {
        System.out.println("This method runs after test scenario 1");
    }

}
