package sas1.project.demo.model;

public class Cord implements Comparable<Cord>{

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

    @Override
    public int compareTo(Cord o) {
        if(this.x<o.x || this.y<o.y){
            return 1;
        }
        else if(this.x>o.x || this.y>o.y){
            return -1;
        }
        else return 0;
    }
}
