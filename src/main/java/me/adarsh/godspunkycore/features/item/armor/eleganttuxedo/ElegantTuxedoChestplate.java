package me.adarsh.godspunkycore.features.item.armor.eleganttuxedo;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SpecificItemType;
import me.adarsh.godspunkycore.features.item.armor.LeatherArmorStatistics;

public class ElegantTuxedoChestplate implements LeatherArmorStatistics , MaterialFunction {
    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.CHESTPLATE;
    }

    @Override
    public double getBaseCritDamage() {
        return 100;
    }

    @Override
    public double getBaseIntelligence() {
        return 300;
    }

    @Override
    public String getDisplayName() {
        return "Elegant Tuxedo Chestplate";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public int getColor() {
        return 191919;
    }
}
