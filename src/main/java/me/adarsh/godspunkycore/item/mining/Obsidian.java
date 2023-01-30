package me.adarsh.godspunkycore.item.mining;

import me.adarsh.godspunkycore.item.ExperienceRewardStatistics;
import me.adarsh.godspunkycore.item.GenericItemType;
import me.adarsh.godspunkycore.item.MaterialFunction;
import me.adarsh.godspunkycore.item.Rarity;
import me.adarsh.godspunkycore.skill.MiningSkill;
import me.adarsh.godspunkycore.skill.Skill;

public class Obsidian implements ExperienceRewardStatistics, MaterialFunction
{
    @Override
    public double getRewardXP()
    {
        return 20.0;
    }

    @Override
    public Skill getRewardedSkill()
    {
        return MiningSkill.INSTANCE;
    }

    @Override
    public String getDisplayName()
    {
        return "Obsidian";
    }

    @Override
    public Rarity getRarity()
    {
        return Rarity.COMMON;
    }

    @Override
    public GenericItemType getType()
    {
        return GenericItemType.ITEM;
    }
}