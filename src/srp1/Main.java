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
/*
* Был нарушен "Принцип единственной ответственности" - класс Square имел несколько зон ответственности.
* Метод draw() был вынесен в отдельный класс, который назавается SquarePainter.
*
* Был нарушен так же "Принцип инверсии зависимостей" (наследование от абстракции)
* и принцип "Принцип открытости-закрытости" (метод draw() в классе SquarePainter реализует интерфейс Paintable.
* Таким образом можно создать другой класс, который например будет рисовать треугольник или квадрат. При этом не
* придётся менять уже существующие классы, а только добавится новый класс, который реализует Paintable согласно
* специфике фигуры, которую от будет рисовать.
* */