package sas1.project.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CanonBall extends Ammunition {
    ArrayList<Integer> crit = new ArrayList<>();
    int id = 1;
    String name = "canonB";
    String target = "";
    List<Integer> critEffect;
    Range range;

    public CanonBall() {
        this.crit.add(0, 0);
        this.crit.add(1,0);
    }

    public CanonBall(int id, String name, String target, List<Integer> critEffect, Range range) {
        super(id, name, target, critEffect, range);
    }
}
