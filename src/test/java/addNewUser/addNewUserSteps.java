package addNewUser;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class addNewUserSteps {

    @Given("^user is on register form page$")
    public void userIsOnRegisterFormPage (){
        System.out.println("User is on register form page");

    }
    @When("^user enters correct data into form$")
    public void userEntersCorrectDataIntoForm (DataTable dataTable){
    Map<String,String> data = dataTable.asMap(String.class, String.class);
        System.out.println("Name: " + data.get("name"));
        System.out.println("Surname: " + data.get("surname"));
        System.out.println("City: " + data.get("city"));
        System.out.println("Street: " + data.get("street"));
    }

    @Then("^information is displayed that new user is added$")
    public void informationIsDisplayedThatNewUserIsAdded (){
        System.out.println("New user has been added");

    }


}
