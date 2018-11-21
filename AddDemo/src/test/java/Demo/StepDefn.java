package Demo;

import static org.testng.Assert.assertEquals;

import com.cg.model.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	
	private Calculator calculator;
	int res;
	
	@Given("^User creates object of calculator$")
	public void user_creates_object_of_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calculator=new Calculator();
	    //throw new PendingException();
	}

	

	
	@When("^user pass (\\d+) and (\\d+) as input also (\\d+) as expected$")
	public void user_pass_and_as_input_also_as_expected(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   // throw new PendingException();
		res=calculator.add(arg1, arg2);
		assertEquals(res,arg3);
		
	}

	@Then("^Display sum of two numbers$")
	public void display_sum_of_two_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Result is:"+res);
	}



}
