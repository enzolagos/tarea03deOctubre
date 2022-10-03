package testingResults;

import java.util.HashMap;
import java.util.Map;

public abstract class TestCase {
    public abstract void pushTest(HashMap<String, Boolean> testResults, String nombreTest);

    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nombreTest) {
        if(testResults.containsKey(nombreTest)){
            return testResults.get(nombreTest);
        }
        System.out.println("El test ingresado no existe.");
        return false;
    }

}

