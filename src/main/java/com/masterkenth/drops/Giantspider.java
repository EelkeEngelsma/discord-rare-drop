package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Giantspider implements BaseNPC {
    public List<ItemData> drops;

    public Giantspider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0005194805194805195f, "1", false));
        drops.add(new ItemData(21257, 0.0031645569620253164f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}