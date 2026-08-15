public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    // Addition
    public Point add(Point obj) {
        return new Point(this.x + obj.x, this.y + obj.y);
    }

    // Subtraction
   public Point subtract(Point obj) {
    return new Point(this.x - obj.x, this.y - obj.y);
}

    // toString()
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}