package Basic;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test
    public void test1()
    {
        System.out.println("This is Testone ");
    }
    @Test(expectedExceptions= ArithmeticException.class,expectedExceptionsMessageRegExp ="/ by zero")

    public void test2(){
        int i=1/0;

        System.out.println("This is Testtwo ");
    }
    @Test
    public void test3(){

        System.out.println("This is Testtwo ");
    }
}
