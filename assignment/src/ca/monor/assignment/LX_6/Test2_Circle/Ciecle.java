package ca.monor.assignment.LX_6.Test2_Circle;

public class Ciecle {
    private double r;

    public Ciecle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void showArea() {
        System.out.println("R = " + r + " Surface = " + Math.PI * Math.pow(r, 2));
    }

    public void showPerimeter() {
        System.out.println("R = " + r + " Perimeter = " + 2 * Math.PI * r);
    }
}
