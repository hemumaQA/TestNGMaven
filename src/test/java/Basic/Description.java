package Basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Description {
    @BeforeMethod
    public void beforemethod(Method testmethod) {

    String desc = testmethod.getAnnotation(Test.class).description();
        System.out.println(desc);
}
    @Test
    public void testone(){
        System.out.println("This is Testone ");
    }

    @Test (description = "This my test2")
    public void testtwo(){
        System.out.println("This is Testtwo ");
    }
}
