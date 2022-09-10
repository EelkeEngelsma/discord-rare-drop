package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SkeletalMystic implements BaseNPC {
    public List<ItemData> drops;

    public SkeletalMystic() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(20906, 1f, "5-10", false));
        drops.add(new ItemData(20909, 1f, "5-10", false));
        drops.add(new ItemData(20903, 1f, "5-10", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}