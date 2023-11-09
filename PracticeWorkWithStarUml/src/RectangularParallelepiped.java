
import java.util.*;

public class RectangularParallelepiped {
    Scanner scanner = new Scanner(System.in);
    private int length;
    private int width;
    private int height;

    public void volumeCalculation() {
        System.out.print("Введите длину: ");
        length = scanner.nextInt();
        System.out.print("Введите ширину: ");
        width = scanner.nextInt();
        System.out.print("Введите высоту: ");
        height = scanner.nextInt();

        System.out.println("Объём: " + length * width * height);
    }
}