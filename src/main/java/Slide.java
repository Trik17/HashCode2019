import java.util.HashSet;

public class Slide {

    public Photo pic1;
    public Photo pic2;
    public boolean isVertical;
    public HashSet<String> tags;



    public Slide(Photo pic1, Photo pic2){
        this.pic1 = pic1;
        this.pic2 = pic2;
        isVertical = true;
        //todo check that they are vertical?
        //todo union of tags
    }

    public Slide(Photo pic){
        pic1=pic;
        isVertical = false;
        pic2=null;
        tags=pic.tags;
    }
}
