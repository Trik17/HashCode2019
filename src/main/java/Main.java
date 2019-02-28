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

        String currentInput = d;

        Problem prob = new Problem(".\\Input\\"+currentInput+".txt");
        List<Slide> ss = new ArrayList<Slide>();
        prob.read();
        //System.out.println("Hello");
        List<Photo> collection = prob.pictures;

        //SlideShow ss = new SlideShow();
        Photo verticalP = null;
        for(Photo picture : collection){

            if(!picture.isVertical){
                Slide s = new Slide(picture);
                ss.add(s);
            }
            else{
                if(verticalP == null){
                    verticalP = picture;
                }
                else {
                    Slide s = new Slide(verticalP, picture);
                    verticalP = null;
                    ss.add(s);
                }
            }
        }
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
}
