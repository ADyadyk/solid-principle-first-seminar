package srp1;

import srp1.figure.SquarePainter;
import srp1.figure.Point;
import srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        // Создадим экземпляр класса Square:
        Square square = new Square(new Point(1,1), 5);
        // Высчитаем площадь созданного экземпляра:
        System.out.printf("Square area: %d \n", square.getArea());
        // Создадим экземпляр класса Painter:
        SquarePainter painter = new SquarePainter();
        // Вызовем метод draw():
        painter.draw(square);
    }
}
