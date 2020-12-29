package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumbersTest {

        @Test
        public void addPositiveIntegers() {
            //Arrange
            Basic.AddNumbers a = new Basic.AddNumbers();


            //Act
            int result = a.addNum(2, 2);

            //Assert
            Assert.assertEquals(result, 4);


        }
    @Test
    public void addNegativeIntegers(){
        //Arrange
        AddNumbers a = new  AddNumbers();


        //Act
        int result= a.addNum(-2,-2);

        //Assert
        Assert.assertEquals(result,-4);

    }



    @Test
    public void addUnlikeIntegers(){
        //Arrange
        AddNumbers a = new  AddNumbers();


        //Act
        int result= a.addNum(-2,3);

        //Assert
        Assert.assertEquals(result,1);

    }
    }










