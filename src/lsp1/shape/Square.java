package lsp1.shape;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
