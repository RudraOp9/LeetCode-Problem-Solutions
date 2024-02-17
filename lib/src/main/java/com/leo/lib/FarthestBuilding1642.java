package com.leo.lib;

import java.util.ArrayList;
import java.util.Collections;

public class FarthestBuilding1642 {
    public static void main(String[] args) {

    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        if (heights.length == 1) return 0;
        int furthest = 0;
        ArrayList<Integer> help = new ArrayList<>();
        for(int a = 1 ; a<heights.length ; a++){
            if (heights[a] < heights[a-1]);{
                furthest++;
                continue;
            }
        }
        return 0;
    }
}
