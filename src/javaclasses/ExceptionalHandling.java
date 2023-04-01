package javaclasses;
import java.io.IOException;
public class ExceptionalHandling {
    public static void main(String[] args) throws IOException {
       /* try {
            throw new NullPointerException("Null");
        }
        catch (NullPointerException ae) {
            System.out.println("ArithmeticException Handled");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }*/

            method();

    }
    public static void method()throws IOException{


        throw new IOException("TestException");

    }
}
