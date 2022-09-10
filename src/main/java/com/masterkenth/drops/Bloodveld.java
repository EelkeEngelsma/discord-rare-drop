package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Bloodveld implements BaseNPC {
    public List<ItemData> drops;

    public Bloodveld() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0078125f, "1", false));
        drops.add(new ItemData(1621, 0.00390625f, "1", false));
        drops.add(new ItemData(1619, 0.001953125f, "1", false));
        drops.add(new ItemData(1452, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1462, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1617, 0.00048828125f, "1", false));
        drops.add(new ItemData(830, 0.000244140625f, "5", false));
        drops.add(new ItemData(987, 0.000244140625f, "1", false));
        drops.add(new ItemData(985, 0.000244140625f, "1", false));
        drops.add(new ItemData(1247, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(2366, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(1249, 0.000005721598898523552f, "1", false));
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(565, 0.0234375f, "3", false));
        drops.add(new ItemData(565, 0.0390625f, "10", false));
        drops.add(new ItemData(565, 0.0078125f, "30", false));
        drops.add(new ItemData(199, 0.001953125f, "1", false));
        drops.add(new ItemData(201, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(203, 0.001098659635245001f, "1", false));
        drops.add(new ItemData(205, 0.000854481756814492f, "1", false));
        drops.add(new ItemData(207, 0.000671366230278617f, "1", false));
        drops.add(new ItemData(209, 0.00048828125f, "1", false));
        drops.add(new ItemData(211, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(1353, 0.03125f, "1", false));
        drops.add(new ItemData(213, 0.00030517578125f, "1", false));
        drops.add(new ItemData(215, 0.000244140625f, "1", false));
        drops.add(new ItemData(2485, 0.00018310658634391078f, "1", false));
        drops.add(new ItemData(217, 0.00018310658634391078f, "1", false));
        drops.add(new ItemData(995, 0.0546875f, "10", false));
        drops.add(new ItemData(995, 0.2265625f, "40", false));
        drops.add(new ItemData(995, 0.234375f, "120", false));
        drops.add(new ItemData(995, 0.078125f, "200", false));
        drops.add(new ItemData(995, 0.0078125f, "450", false));
        drops.add(new ItemData(526, 0.078125f, "1", false));
        drops.add(new ItemData(1157, 0.03125f, "1", false));
        drops.add(new ItemData(532, 0.0546875f, "1", false));
        drops.add(new ItemData(532, 0.0234375f, "3", false));
        drops.add(new ItemData(444, 0.015625f, "1", false));
        drops.add(new ItemData(2293, 0.0234375f, "1", false));
        drops.add(new ItemData(1325, 0.015625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13495, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(23083, 0.005813953488372093f, "1", false));
        drops.add(new ItemData(4125, 0.0078125f, "1", false));
        drops.add(new ItemData(2722, 0.00390625f, "1", false));
        drops.add(new ItemData(1181, 0.0078125f, "1", false));
        drops.add(new ItemData(1109, 0.0078125f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0625f, "60", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}