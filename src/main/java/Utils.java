import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Utils {

    public static ArrayList<int[]> adjacent(SubMatrix m){
        //todo
        return null;
    }

    public static double distance(int x1, int x2, int y1, int y2){
        return sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }


    public void optimization(List<Slide> slideShow){
        int partial;
        Slide transition[] = new Slide[2];
        int count = 0;
        ArrayList<Slide> copy_slideShow = new ArrayList<>();
        for (Slide s : slideShow){
            copy_slideShow.add(s);
        }
        Slide s1 = slideShow.get(0);
        while (copy_slideShow.size() > 0){
            transition[0] = s1;
            copy_slideShow.remove(s1);
            int k = 0;
            while (count < k){
                Slide s2 = copy_slideShow.get(k);
                int diff_a = diff();
                int inter = intersection();
                int diff_b = diff();
                


            }
        }
    }


}
