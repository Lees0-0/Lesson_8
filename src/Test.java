public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 8, 6);
        Triangle triangle = new Triangle("Triangle", 4, 7, 9);
        Parallelogram parallelogram = new Parallelogram("Square", 5, 2);
        Quad quad = new Quad("Quad", 5);

        ConsoleShapePrinter shapePrinter = new ConsoleShapePrinter();

        Shape[] shapes = {circle, rectangle, triangle, parallelogram, quad};

        ConsoleShapePrinter.printName(circle);
        ConsoleShapePrinter.printName(quad);
        ConsoleShapePrinter.printName(rectangle);
        ConsoleShapePrinter.printName(triangle);
        ConsoleShapePrinter.printName(parallelogram);

        shapePrinter.printColour(ShapeColour.RED);
        shapePrinter.printColour(ShapeColour.ORANGE);
        shapePrinter.printColour(ShapeColour.BLACK);
        shapePrinter.printColour(ShapeColour.WHITE);
        shapePrinter.printColour(ShapeColour.BLUE);
    }
}
