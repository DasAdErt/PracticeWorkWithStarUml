
import java.util.*;

public class Cone {
    Scanner scanner = new Scanner(System.in);
    private int height;
    private int radius;

    public void volumeCalculation() {
        System.out.print("Введите радиус: ");
        radius = scanner.nextInt();

        System.out.println("Введите высоту: ");
        height = scanner.nextInt();

        double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;

        System.out.println("Объём: " + volume);
    }

}