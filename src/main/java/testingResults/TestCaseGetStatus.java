package testingResults;

import java.util.HashMap;
import java.util.Map;

public class TestCaseGetStatus extends TestCase{
    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nombreTest) {

    }

    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nombreTest){
        for (Map.Entry<String,Boolean> dato: testResults.entrySet()) {
            if (nombreTest == dato.getKey() && dato.getValue()){
                System.out.println("This test status is: OK");
            } else if (nombreTest == dato.getKey() && !dato.getValue()){
                System.out.println("This test status is: NOT OK");
            }
        }
        return false;
    }
}
