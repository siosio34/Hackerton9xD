package com.gunghi.tgwing.hackerton9xd.util;

/**
 * Created by joyeongje on 2017. 9. 9..
 */


import android.location.Location;

/**
 * Created by young on 2017-06-01.
 */

public class LocationTracker {

    private static Location curLoc;

    public static Location getCurLoc() {
        return curLoc;
    }

    public static void setCurLoc(Location curLoc) {
        LocationTracker.curLoc = curLoc;
    }
}