package testingResults;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        HashMap<String, Boolean> testResults = new HashMap<String, Boolean>();
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

        System.out.println("***** PRIMERA ITERACION *****");
        TestsStatus prueba = new TestsStatus();
        prueba.getTestResultsStatus(testResults);

        System.out.println("***** SEGUNDA ITERACION *****");
        TestCaseJira prueba2 = new TestCaseJira();
        prueba2.pushTest(testResults,"TC5");

        System.out.println("***** TERCERA ITERACION *****");
        TestCaseGetStatus prueba3 = new TestCaseGetStatus();
        prueba3.getTestStatus(testResults,"TC3");
    }


}
