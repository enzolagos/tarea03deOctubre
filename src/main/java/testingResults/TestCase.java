package testingResults;

import java.util.HashMap;
import java.util.Map;

public abstract class TestCase {
    public abstract void pushTest(HashMap<String, Boolean> testResults, String nombreTest);

    public boolean getTestStatus(HashMap<String, Boolean> testResults, String nombreTest) {
        for (Map.Entry<String, Boolean> dato : testResults.entrySet()) {
            return nombreTest == dato.getKey() ? dato.getValue() : false;
        }
        System.out.println("El test ingresado no existe.");
        return false;
    }

}

