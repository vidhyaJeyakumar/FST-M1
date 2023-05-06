package activities;

public class Activity8 {
    public static void main(String[]args){
        try {
            Activity8.exceptionTest("Catch in console");
            //Activity8.exceptionTest(null);
        }catch (CustomException ce){
            System.out.println(ce.getMessage());
        }

    }

    private static void exceptionTest(String s) throws CustomException {
        if(s==null)
            throw new CustomException("String is null");
        else
            System.out.println("Message:"+s);

    }
}
