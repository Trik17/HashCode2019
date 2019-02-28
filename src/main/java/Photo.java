import javax.swing.*;
import java.util.HashSet;

public class Photo {

    public int id;
    public boolean isVertical;
    public HashSet<String > tags= new HashSet<>();

    public Photo(int id, boolean isVertical, HashSet<String > tags){
        this.id=id;
        this.isVertical=isVertical;
        this.tags=tags;
    }

    public static int union(Photo p1, Photo p2){
        //todo
        // ritorna il numeor degli elementi dei tag delle 2 foto
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        //todo
    }
}
