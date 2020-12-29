package Basic;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("This is Beforesuite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("This is BeforeTest");
    }
    @BeforeClass
    public void beforeclass(){

        System.out.println("This is BeforeClass");
    }
    @Test
    public void testone()
    {
        System.out.println("This is Testone ");
    }
    @Test
    public void testtwo(){

        System.out.println("This is Testtwo ");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is AfterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is AfterClass");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("This is AfterTest");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("This is AfterSuite");
    }

}
