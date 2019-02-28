import java.util.HashSet;

public class Slide {

    public Photo pic1;
    public Photo pic2;
    public boolean isVertical;
    public HashSet<String> tags = new HashSet<>();



    public Slide(Photo pic1, Photo pic2){
        this.pic1 = pic1;
        this.pic2 = pic2;
        isVertical = true;
        tags.addAll(pic1.tags);
        tags.addAll(pic2.tags);
        //todo check that they are vertical?
    }

    public Slide(Photo pic){
        pic1=pic;
        isVertical = false;
        pic2=null;
        tags=pic.tags;
    }

    public static int intersection(Slide s1, Slide s2){
        //todo
        
        return 0;
    }

}
