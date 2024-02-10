import java.io.FileNotFoundException;
import java.io.PrintStream;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    static public  void main(String ...a) throws FileNotFoundException{
        main();
        PrintStream p = new PrintStream("");
        System.out.println("Hello Java");
 }
}