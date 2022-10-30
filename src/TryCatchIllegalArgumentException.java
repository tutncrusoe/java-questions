import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchIllegalArgumentException {

    public void TryCatch() {
        /**
         * Let’s look at a simple try-catch block code.
         */
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }

        /**
         *From Java 7 onwards, We can also catch multiple exceptions in a single catch block.
         * It’s useful when we have the same code in all the catch blocks.
         */
        try {
            IllegalArgumentException(10);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    public void IllegalArgumentException(int x) throws IllegalArgumentException, NullPointerException{
        System.out.println("IllegalArgumentException");
    }
}
