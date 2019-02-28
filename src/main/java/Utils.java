import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.sqrt;

public class Utils {

    /*public static ArrayList<int[]> adjacent(SubMatrix m){
        //t o d o
        return null;
    }*/

    public static double distance(int x1, int x2, int y1, int y2){
        return sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static ArrayList<Slide> optimization(List<Slide> slideShow){
        ArrayList<Slide> result = new ArrayList<>();
        int partial = -1;
        Slide transition[] = new Slide[2];
        ArrayList<Slide> copy_slideShow = new ArrayList<>();
        for (Slide s : slideShow){
            copy_slideShow.add(s);
        }
        Slide s1 = slideShow.get(0);
        result.add(s1);
        int count;
        while (copy_slideShow.size() - 1 > 0){
            transition[0] = s1;
            copy_slideShow.remove(s1);
            int k = copy_slideShow.size()/4;
            count = 0;
            Slide s2 = copy_slideShow.get(0);
            while (count < k){
                s2 = copy_slideShow.get(count);
                int diff_a = Slide.diff(s1, s2);
                int inter = Slide.intersection(s1, s2);
                int diff_b = Slide.diff(s2, s1);
                int min = Slide.min(diff_a, inter, diff_b);
                if (min > partial){
                    partial = min;
                    transition[1] = s2;
                }
                count++;
                k = Math.min(k, copy_slideShow.size() - 1);

            }
            s1 = slideShow.get(slideShow.indexOf(transition[1]));
            result.add(transition[1]);
            System.out.println(result.size());

        }
        return result;
    }



}
