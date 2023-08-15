public  class Rectangle extends Shape {

    private int firstside;
    private int secondside;

    public Rectangle(String name, int firstside, int secondside) {
        super(name);
        this.firstside = firstside;
        this.secondside = secondside;
    }

    @Override
    public String getName() {
        return name;
    }
}

