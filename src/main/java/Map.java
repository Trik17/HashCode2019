import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;


public class Map {
    public Cell[][] matrix = Pizza.matrix;

    public HashMap<Cell, SortedMap<Float, ArrayList<Cell>>> cells_map = new HashMap<>(matrix[0].length * matrix.length);

    public Map() {
    }
    
    
    public void create_map(){
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Cell cell = matrix[i][j];
                
            }
            
        }
    }
}
