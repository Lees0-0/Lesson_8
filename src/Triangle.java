public class Triangle extends Shape {

    private int firstside;
    private int secondside;
    private int thirdside;


    public Triangle(String name, int firstside, int secondside, int thirdside) {
        super(name);
        this.firstside = firstside;
        this.secondside = secondside;
        this.thirdside = thirdside;
    }

    @Override
    public String getName() {
        return name;
    }
}
