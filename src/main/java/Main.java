import java.util.List;

public class Main {

    public static void main (String args[]){
        Problem prob = new Problem();

        prob.read();
        System.out.println("Hello");
        List<Photo> collection = prob.pictures;
        SlideShow ss = new SlideShow();
        Photo verticalP = null;
        for(Photo picture : collection){
            if(!picture.isVertical){
                Slide s = new Slide(picture);
                ss.slides.add(s);
            }
            else{
                if(verticalP == null){
                    verticalP = picture;
                }
                else {
                    Slide s = new Slide(verticalP, picture);
                    ss.slides.add(s);
                }
            }
        }



    }
}
