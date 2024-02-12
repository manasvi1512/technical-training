import java.io.IOException;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        String name = scanner.nextLine();
    }
}
