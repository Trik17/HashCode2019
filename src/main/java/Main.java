import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String args[]){
        //Problem prob = new Problem();
        List<Slide> ss = new ArrayList<Slide>();
        Photo p1 = new Photo();
        Slide s1 = new Slide(p1);
        ss.add(s1);
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
            System.out.println(submissionString);

        }



    }
}
