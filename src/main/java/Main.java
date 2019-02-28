import java.util.List;

public class Main {

    public static void main (String args[]){
        Problem prob = new Problem();

        prob.read();
        System.out.println("Hello");
        List<Photo> collection = prob.pictures;
        List<Slide> slideShow;
        for(Photo picture : collection){
            Photo verticalP;
            if(!picture.isVertical())
        }



    }
}
