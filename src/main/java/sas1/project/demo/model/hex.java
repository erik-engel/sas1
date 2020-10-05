package sas1.project.demo.model;

public class hex {

    cords x;
    hex n;
    hex nw;
    hex sw;
    hex s;
    hex se;
    hex ne;

    public hex(cords x, hex n, hex nw, hex sw, hex s, hex se, hex ne) {
        this.x = x;
        this.n = n;
        this.nw = nw;
        this.sw = sw;
        this.s = s;
        this.se = se;
        this.ne = ne;
    }

    public cords getX() {
        return x;
    }

    public void setX(cords x) {
        this.x = x;
    }

    public hex getN() {
        return n;
    }

    public void setN(hex n) {
        this.n = n;
    }

    public hex getNw() {
        return nw;
    }

    public void setNw(hex nw) {
        this.nw = nw;
    }

    public hex getSw() {
        return sw;
    }

    public void setSw(hex sw) {
        this.sw = sw;
    }

    public hex getS() {
        return s;
    }

    public void setS(hex s) {
        this.s = s;
    }

    public hex getSe() {
        return se;
    }

    public void setSe(hex se) {
        this.se = se;
    }

    public hex getNe() {
        return ne;
    }

    public void setNe(hex ne) {
        this.ne = ne;
    }
}
