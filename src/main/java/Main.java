import java.util.List;

public class Main {

    public static void main (String args[]){
        Problem prob = new Problem();

        prob.read();
        System.out.println("Hello");
        List<Photo> collection = prob.pictures;
        SlideShow ss = new SlideShow();
        for(Photo picture : collection){
            Photo verticalP;
            if(!picture.isVertical){
                Slide s = new Slide(picture);
                ss.add(s);
            }
        }



    }
}
