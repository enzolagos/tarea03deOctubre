package testingResults;

import java.util.HashMap;
import java.util.Map;

public class TestCaseGetStatus extends TestCase{
    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nombreTest) {

    }

    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nombreTest){
        if(testResults.get(nombreTest)){
            System.out.println("This test status is: OK");
        }else {
        System.out.println("This test status is: NOT OK");}
        return false;
    }
}
