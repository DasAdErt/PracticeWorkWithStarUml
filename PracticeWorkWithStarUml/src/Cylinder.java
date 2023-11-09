
import java.util.*;

public class Cylinder {
    Scanner scanner = new Scanner(System.in);
    private int radius;
    private int height;

    public void volumeCalculation() {
        System.out.print("Введите радиус: ");
        radius = scanner.nextInt();

        System.out.println("Введите высоту: ");
        height = scanner.nextInt();

        double volume = Math.PI * Math.pow(radius,2) * height;

        System.out.println("Объём " + volume);
    }
}