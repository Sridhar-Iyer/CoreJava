package org.jbehave.test.JbehaveTest;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;



public class RunMathStory {

	private int x;

	@Given("a variable x with value $value")
	public void givenXValue(@Named("value") int value) {
		x = value;
	}

	@When("multiply x by $value")
	public void whenMultiplied(@Named("value") int value) {
		x = x * value;
	}

	@Then("x should equal $value")
	public void thenValueShouldbe(@Named("value") int value) {
		if (value != x) {
			throw new RuntimeException("x is " + x + ", but should be " + value);
		}
	}
}
