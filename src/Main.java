import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Height: ");
            int height = scanner.nextInt();
            System.out.print("Length: ");
            int length = scanner.nextInt();
            System.out.print("Wight: ");
            int wight = scanner.nextInt();
            Parallelepiped parallelepiped = new Parallelepiped(height, length, wight);
            System.out.println(parallelepiped);
            System.out.println("Figure area: " + parallelepiped.area());
            System.out.println("Figure size: " + parallelepiped.volume());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Only digit!");
        } catch (Exception e) {
            System.out.println("No cannot negative number!");
        }
    }
}