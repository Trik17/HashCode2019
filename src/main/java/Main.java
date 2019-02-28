import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main (String args[]){
        //Problem prob = new Problem();
        List<Slide> ss = new ArrayList<Slide>();
        Photo p1 = new Photo(1,false,new HashSet<String>());
        Photo p2 = new Photo(2,true,new HashSet<String>());
        Photo p3 = new Photo(3,false,new HashSet<String>());
        Photo p4 = new Photo(4,true,new HashSet<String>());
        Slide s1 = new Slide(p1);
        Slide s2 = new Slide(p2,p4);
        Slide s3 = new Slide(p3);
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        /*prob.read();
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
                    ss.add(s);
                }
            }
        }*/
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
        File f = new File(".\\Submission\\submission.txt");
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(submissionString);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
