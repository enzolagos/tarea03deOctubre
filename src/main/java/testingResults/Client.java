package testingResults;

import java.util.*;

public class TestData {
    public HashMap<String, Boolean> testResults = new HashMap<String, Boolean>();

    public void setTestResults(Map<String, Boolean> testResults) {
        // Format (NombreTest, EstadoTest)
        testResults.put("TC1",true);
        testResults.put("TC2",true);
        testResults.put("TC3",true);
        testResults.put("TC4",false);
        testResults.put("TC5",true);
        testResults.put("TC6",true);
        testResults.put("TC7",false);
        testResults.put("TC8",true);
        testResults.put("TC9",false);
        testResults.put("TC10",true);
        testResults.put("TC11",false);
        testResults.put("TC12",true);
    }

    public Map<String, Boolean> getTestResults() {
        return testResults;
    }
}
