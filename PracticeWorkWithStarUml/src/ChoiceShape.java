
import java.util.*;

public class ChoiceShape {
    Scanner scanner = new Scanner(System.in);
    public void choiceShape() {

        try {
            System.out.print("\nВыберите фигуру:\n1.Прямоугольный параллелепипед\n2.Пирамида\n3.Цилиндр\n4.Конус\nВаш выбор: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice){
                case 1 ->{
                    RectangularParallelepiped parallelepiped = new RectangularParallelepiped();
                    parallelepiped.volumeCalculation();
                }
                case 2 ->{
                    Pyramid pyramid = new Pyramid();
                    pyramid.volumeCalculation();
                }
                case 3 ->{
                    Cylinder cylinder = new Cylinder();
                    cylinder.volumeCalculation();
                }
                case 4 ->{
                    Cone cone = new Cone();
                    cone.volumeCalculation();
                }
                default -> choiceShape();
            }
        } catch (Exception InputMismatchException){
            ChoiceShape choiceShape = new ChoiceShape();
            choiceShape.choiceShape();
        }

    }

}