import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;


public class Map {

    public Pizza prova = new Pizza(".\\HashCode19_prep\\a_example.in");

    public Cell[][] matrix = prova.matrix;

    public HashMap<Cell, SortedMap<Float, ArrayList<Cell>>> cells_map = new HashMap<>(matrix[0].length * matrix.length);

    public Map() {
    }
    
    
    public void create_map(){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                Cell cell = matrix[row][col];
                for (int k = row - prova.h; k < 1 + prova.h; k++) {
                    for (int l = col - prova.h; l < col + prova.h; l++) {
                        if (k < 0){
                            k+= Math.abs(row - prova.h);
                        }
                        if (l < 0){
                            l+= Math.abs(row - prova.h);
                        }

                        if(k != row && l != col){
                            Cell.d
                        }
                    }
                }
            }
            
        }
    }
}
