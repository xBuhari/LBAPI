package com.LullBukkitAPI.xBuhari.Server;

public class TPS implements Runnable {

    private static int TICK_COUNT= 0;
    private static long[] TICKS= new long[600];

    protected static double getTPS()
    {
        return getTPS(100);
    }

    private static double getTPS(int ticks)
    {
        if (TICK_COUNT< ticks) {
            return 20.0D;
        }
        int target = (TICK_COUNT- 1 - ticks) % TICKS.length;
        long elapsed = System.currentTimeMillis() - TICKS[target];

        return ticks / (elapsed / 1000.0D);
    }

    public void run()
    {
        TICKS[(TICK_COUNT% TICKS.length)] = System.currentTimeMillis();
        TICK_COUNT+= 1;
    }
}
