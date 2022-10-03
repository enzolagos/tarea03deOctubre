package testingResults;

import java.util.HashMap;
import java.util.Map;

public class TestCaseJira extends TestCase{

    @Override
    public void pushTest(HashMap<String, Boolean> testResults, String nombreTest) {
        System.out.println("This test will be pushed to jira: "+ nombreTest +" with status: "+testResults.get(nombreTest));

    }
}
