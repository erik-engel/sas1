package sas1.project.demo.model;

public class Cord
{

    int x; //horizontal
    int y; //vertical

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "koordinat{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
