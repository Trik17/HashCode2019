import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {



    public static void main (String args[]){

        String a ="a_example";
        String b ="b_lovely_landscapes";
        String c ="c_memorable_moments";
        String d ="d_pet_pictures";
        String e ="e_shiny_selfies";

        String currentInput = e;// TODO usare questo per selezionare l'input

        Problem prob = new Problem(".\\Input\\"+currentInput+".txt");

        int max=-1;
        Photo best=null;
        List<Slide> ss = new ArrayList<Slide>();

        prob.read();
        //System.out.println("Hello");
        List<Photo> collection = prob.pictures;
        List<Photo> vertcollection = new ArrayList<>();
        List<Photo> horcollection = new ArrayList<>();


        for(Photo p : collection){
            if(p.isVertical){
                vertcollection.add(p);
            }else{
                horcollection.add(p);
            }
        }
        int k = vertcollection.size()/8;
        while(vertcollection.size() >1){
            System.out.println(vertcollection.size());
            Photo p = vertcollection.get(0);
            vertcollection.remove(p);
            max = -1;
            int count = 0;
            k = Math.min(k, vertcollection.size());
            while(count < k){
                Photo p1 = vertcollection.get(count);
                int h = selectH(p,p1,0);
                if(h > max){
                    max = h;
                    best = p1;
                }
                count++;

            }
            Slide sb = new Slide(p,best);
            vertcollection.remove(best);
            ss.add(sb);
        }
        System.out.println("oh");

        //SlideShow ss = new SlideShow();

        Photo verticalP = null;
        for(Photo picture : horcollection){
            if(!picture.isVertical){
                Slide s = new Slide(picture);
                ss.add(s);
            }
        }
        ss = Utils.optimization(ss);
        String submissionString;
        submissionString = ss.size() + "\n";
        for(Slide slide : ss){
            if(!slide.isVertical) {
                submissionString += slide.pic1.id + "\n";
            }
            else{
                submissionString += slide.pic1.id + " " + slide.pic2.id + "\n";
            }

        }
        System.out.println(submissionString);
        File f = new File(".\\Submission\\submission"+currentInput+".txt");
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(submissionString);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    private static int selectH(Photo p, Photo p1, int i) {
        switch(i){
            case 0: return Photo.union(p,p1);
            case 1: return Photo.intersect(p,p1);
            default: return 0;
        }
    }
}
