package zajecia2;

public class Geometria {
    public static void main(String[] args) {}
}

class Punkt {
    private double x;
    private double y;

    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Punkt() {
        this(0.0, 0.0);
    }

    Punkt(Punkt punkt) {
        this(punkt.getX(), punkt.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shift(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double distance(Punkt punkt) {
        double x = this.x = punkt.getX();
        double y = this.y = punkt.getY();

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

class Odcinek {
    public Punkt punkt1;
    public Punkt punkt2;

    Odcinek() {}
    Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }
    Odcinek(double x1, double y1, double x2, double y2) {
        this.punkt1 = new Punkt(x1, y1);
        this.punkt2 = new Punkt(x2, y2);
    }
    Odcinek(double x1, double y1, Punkt punkt2) {
        this.punkt1 = new Punkt(x1, y1);
        this.punkt2 = punkt2;
    }
    Odcinek(Punkt punkt1, double x2, double y2) {
        this.punkt1 = punkt1;
        this.punkt2 = new Punkt(x2, y2);
    }

    public void shift(double x, double y) {
        this.punkt1.shift(x, y);
        this.punkt2.shift(x, y);
    }

    public double pointDistance(Punkt punkt) {
        return (this.punkt2.getX() - this.punkt1.getX()) *
                (punkt.getX() - this.punkt1.getX()) +
                (this.punkt2.getY() - this.punkt1.getY()) *
                (punkt.getY() - this.punkt1.getY()) /
                Math.pow(this.punkt2.getX() - this.punkt1.getX(), 2) +
                Math.pow(this.punkt2.getY() - this.punkt1.getY(), 2);
    }

}

