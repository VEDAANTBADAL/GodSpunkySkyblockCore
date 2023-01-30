package me.adarsh.godspunkycore.item.dragon.wise;

import me.adarsh.godspunkycore.item.GenericItemType;
import me.adarsh.godspunkycore.item.MaterialFunction;
import me.adarsh.godspunkycore.item.Rarity;
import me.adarsh.godspunkycore.item.SpecificItemType;
import me.adarsh.godspunkycore.item.armor.LeatherArmorStatistics;

public class WiseDragonBoots implements MaterialFunction, LeatherArmorStatistics
{
    @Override
    public double getBaseIntelligence()
    {
        return 75;
    }

    @Override
    public double getBaseHealth()
    {
        return 60;
    }

    @Override
    public double getBaseDefense()
    {
        return 90;
    }

    @Override
    public int getColor()
    {
        return 0x29F0E9;
    }

    @Override
    public String getDisplayName()
    {
        return "Wise Dragon Boots";
    }

    @Override
    public Rarity getRarity()
    {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType()
    {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType()
    {
        return SpecificItemType.BOOTS;
    }

    @Override
    public String getLore()
    {
        return null;
    }
}