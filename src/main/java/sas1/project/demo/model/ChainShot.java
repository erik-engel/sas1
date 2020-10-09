package sas1.project.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ChainShot extends Ammunition {

        ArrayList<Integer> crit = new ArrayList<>();
        int id = 2;
        String name = "ChainS";
        String target = "";
        List<Integer> critEffect;
        Range range;

        public ChainShot() {
            this.crit.add(0, 0);
            this.crit.add(1,0);
        }

        public ChainShot(int id, String name, String target, List<Integer> critEffect, Range range) {
            super(id, name, target, critEffect, range);
        }
    }

