package testme;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

    @Before
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    public void testme() {
        Assert.assertEquals("Hello", "Hello");
    }

    @After
    public void afterTest() {
        System.out.println("Test Completed");
    }
}
