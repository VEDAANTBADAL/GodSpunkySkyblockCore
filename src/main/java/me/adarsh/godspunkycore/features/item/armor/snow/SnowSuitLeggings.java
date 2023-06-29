package me.adarsh.godspunkycore.features.item.armor.snow;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SpecificItemType;
import me.adarsh.godspunkycore.features.item.armor.LeatherArmorStatistics;

public class SnowSuitLeggings implements LeatherArmorStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Snow Suit Leggings";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public double getBaseDefense() {
        return 30;
    }

    @Override
    public double getBaseHealth() {
        return 75;
    }

    @Override
    public int getColor() {
        return 0xFFFFFF;
    }
}

