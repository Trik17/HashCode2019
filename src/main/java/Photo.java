import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class Photo {

    public int id;
    public boolean isVertical;
    public HashSet<String > tags= new HashSet<>();

    public Photo(int id, boolean isVertical, HashSet<String> tags){
        this.id=id;
        this.isVertical=isVertical;
        this.tags=tags;
    }

    public static int union(Photo p1, Photo p2){
        // ritorna il numero  dei tag dell'unione delle 2 foto
        HashSet<String> res = new HashSet<>();
        res.addAll(p1.tags);
        res.addAll(p2.tags);
        return res.size();
    }

    public static int intersect(Photo p1, Photo p2){
        // ritorna il numero  dei tag dell'intersezione delle 2 foto
        HashSet<String> res = new HashSet<>();
        res.addAll(p1.tags);
        res.retainAll(p2.tags);
        return res.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.id == ((Photo) obj).id) {
            /*if (this.value != ((Photo) obj).value){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("There are two instances of a cell with different values!");
                    e.printStackTrace();
                }
            }*/
            return true;
        }
        return false;
    }
}
