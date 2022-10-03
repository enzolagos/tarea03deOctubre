package testingResults;

import java.util.HashMap;
import java.util.Map;

public class TestsStatus {

    public void getTestResultsStatus(HashMap <String, Boolean> testResults){
        for (Map.Entry<String,Boolean> dato: testResults.entrySet()) {
            if(!dato.getValue()){
                System.out.println("Test fail!, name: " + dato.getKey());
            }
            System.out.println("Test OK, name: " + dato.getKey());

        }
    }
}
