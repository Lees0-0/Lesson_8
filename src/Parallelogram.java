public class Parallelogram extends Shape {
    private int firstSide;
    private int secondSide;

    public Parallelogram(String name, int firstSide, int secondSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getName() {
        return name;
    }
}