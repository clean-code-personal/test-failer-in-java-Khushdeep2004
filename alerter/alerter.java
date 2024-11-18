public class Alerter {
    static int alertFailureCount = 0;
    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 200 for ok
        // Return 500 for not-ok
        // stub always succeeds and returns 200
       if (celcius <= 150) {
            return 200;
        } else {
            return 500; 
        }
    }
    static void alertInCelcius(float farenheit) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = networkAlertStub(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(400.5f);
        alertInCelcius(303.6f);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
         if (alertFailureCount != 1) {
            throw new AssertionError("Test failed: Expected 1 alert failure, but got " + alertFailureCount);
        }
        System.out.println("All is well (maybe!)\n");
       
    }
}
