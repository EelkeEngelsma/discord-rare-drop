package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AgrithNaar implements BaseNPC {
    public List<ItemData> drops;

    public AgrithNaar() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}