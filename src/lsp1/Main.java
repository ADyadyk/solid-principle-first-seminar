package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(5, 4);
        Rectangle rectangle = (Rectangle)shape;
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
/*
* Был нарушен "Принцип подстановки Лисков". Для исправления ошибки был создан интерфейс Shape,
* который имплементировали Rectangle и Square
* */