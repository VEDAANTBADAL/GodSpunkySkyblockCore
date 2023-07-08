package me.adarsh.godspunkycore.features.Dungeon;

import me.adarsh.godspunkycore.Skyblock;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class DungeonDoorAnimation extends BukkitRunnable {
    private final List<Location> doorPositions;
    private final int animationTicks;
    private int currentTick;

    public DungeonDoorAnimation(List<Location> doorPositions, int animationTicks) {
        this.doorPositions = doorPositions;
        this.animationTicks = animationTicks;
        this.currentTick = 0;
    }

    @Override
    public void run() {
        if (currentTick >= animationTicks) {
            // Animation complete, stop the task
            this.cancel();
            return;
        }

        double progress = (double) currentTick / animationTicks;

        for (Location doorPos : doorPositions) {
            double deltaY = progress * doorPos.getBlockY();
            int currentY = doorPos.getBlockY() - (int) Math.round(deltaY);

            Location currentPos = doorPos.clone();
            currentPos.setY(currentY);

            currentPos.getBlock().setType(Material.MOSSY_COBBLESTONE); //todo set the real material
        }

        currentTick++;
    }

    public void startAnimation() {
        this.runTaskTimer(Skyblock.getPlugin(), 0, 1);
    }
}

