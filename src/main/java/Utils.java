import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Utils {

    /*public static ArrayList<int[]> adjacent(SubMatrix m){
        //t o d o
        return null;
    }*/

    public static double distance(int x1, int x2, int y1, int y2){
        return sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }


}
