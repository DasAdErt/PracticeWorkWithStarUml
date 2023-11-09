
import java.util.*;

public class Pyramid {
    Scanner scanner = new Scanner(System.in);
    private double height;
    private double baseArea;

    public void volumeCalculation() {

        System.out.print("Введите высоту: ");
        height = scanner.nextInt();

        System.out.print("Введите площадь основания: ");
        baseArea = scanner.nextInt();

        double volume = (baseArea * height) / 3;

        System.out.println("Объём: " + volume);
    }

}