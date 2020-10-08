package sas1.project.demo.model;

import java.util.List;

public class Ammunition {
    public enum Range{
        shortRange,
        averageRange,
        longRange
    }
    int id;
    String name;
    String target;
    List<Integer> critEffect;
    Range range;

    public Ammunition() {
    }

    public Ammunition(int id, String name, String target, List<Integer> critEffect, Range range) {
        this.id = id;
        this.name = name;
        this.target = target;
        this.critEffect = critEffect;
        this.range = range;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<Integer> getCritEffect() {
        return critEffect;
    }

    public void setCritEffect(List<Integer> critEffect) {
        this.critEffect = critEffect;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }


}


