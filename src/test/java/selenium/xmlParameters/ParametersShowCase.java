package selenium.xmlParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersShowCase {


    @Parameters({"firstName","lastName"})
    @Test
    public void  testParameters(String firstName,String lastname){
        System.out.println(firstName + " " + lastname);
    }

    @Parameters({"address","city"})
    @Test
    public void test2(String address, String city){
        System.out.println(address + " " + city);
    }
}
