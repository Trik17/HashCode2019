import javax.swing.*;
import java.util.HashSet;

public class Photo {

    public int id;
    public boolean isVertical;
    public HashSet<String > tags; //= new HashSet<>();

    public Photo(int id, boolean isVertical, HashSet<String > tags){
        this.id=id;
        this.isVertical=isVertical;
        this.tags=tags;
    }

}
