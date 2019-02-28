import java.util.HashSet;

public class Slide {

    public Photo pic1;
    public Photo pic2;
    public boolean isVertical;
    public HashSet<String> tags = new HashSet<>();



    public Slide(Photo pic1, Photo pic2){

        if (!pic1.isVertical || !pic2.isVertical){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("You are adding 2 pictures to a Slide, and one of them (at leas) is not vertical");
                e.printStackTrace();
            }
        }

        this.pic1 = pic1;
        this.pic2 = pic2;
        isVertical = true;
        tags.addAll(pic1.tags);
        tags.addAll(pic2.tags);
    }

    public Slide(Photo pic){
        pic1=pic;
        isVertical = false;
        pic2=null;
        tags=pic.tags;
    }

    public static int intersection(Slide s1, Slide s2){
        //return the number of tags common between s1 and s2


        // Retains only the elements in this set that are contained in the specified collection (optional operation).
        // In other words, removes from this set all of its elements that
        // are not contained in the specified collection.
        // If the specified collection is also a set,
        // this operation effectively modifies this set so that its value is the intersection of the two sets.
        HashSet<String> res =new HashSet<>();
        res.addAll(s1.tags);
        res.retainAll(s2.tags);
        return res.size();
    }

    public static int diff(Slide s1, Slide s2){
        //numero di tag in S1 che non sono in s2

        //Removes from this set all of its elements that are contained in the specified collection (optional operation).
        // If the specified collection is also a set, this operation effectively modifies this set
        // so that its value is the asymmetric set difference of the two sets.

        HashSet<String> res =new HashSet<>();
        res.addAll(s1.tags);
        res.removeAll(s2.tags);
        return res.size();
    }



    public static int min(int n1, int n2, int n3){
        int smallest = Math.min(n1, Math.min(n2, n3));
        return smallest;
    }

}
