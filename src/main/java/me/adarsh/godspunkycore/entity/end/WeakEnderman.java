package me.adarsh.godspunkycore.entity.end;

import me.adarsh.godspunkycore.entity.EntityFunction;

public class WeakEnderman implements EndermanStatistics, EntityFunction
{
    @Override
    public String getEntityName()
    {
        return "Enderman";
    }

    @Override
    public double getEntityMaxHealth()
    {
        return 4500.0;
    }

    @Override
    public double getDamageDealt()
    {
        return 500.0;
    }

    @Override
    public double getXPDropped()
    {
        return 28.0;
    }
}