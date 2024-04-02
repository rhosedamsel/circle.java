public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle c) {
        if (radius < c.radius)
            return -1;
        else if (radius > c.radius)
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return c.radius == radius;
        }
        return false;
    }
}
