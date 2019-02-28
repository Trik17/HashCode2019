import PizzaProblem.Cell;
import PizzaProblem.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;


public class Map {




    public Map() {
    }


    public static void main (String args[]){
        Pizza prova = new Pizza(".\\HashCode19_prep\\d_big.in");
        prova.read();
        Cell[][] matrix = prova.matrix;
        System.out.println(prova.h);
        HashMap<Cell, TreeMap<Double, ArrayList<Cell>>> cells_map = new HashMap<>(matrix[0].length * matrix.length);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                Cell cell = matrix[row][col];
                TreeMap<Double, ArrayList<Cell>> dist_map = new TreeMap<>();
                int k = row - prova.h;
                if (k < 0){
                    k+= Math.abs(row - prova.h);
                }
                int l = col - prova.h;
                if (l < 0){
                    l+= Math.abs(col - prova.h);
                }
                for (int h_row = k; h_row < matrix.length && h_row < row + prova.h ; h_row++) {
                    for (int h_col = l; h_col < matrix[0].length && h_col < col + prova.h; h_col++) {
                        if(!(h_row == row && h_col == col)){
                            Cell h_cell =  matrix[h_row][h_col];
                            double distance = Cell.cellDistance(cell, h_cell);
                            if (distance <= prova.h){
                                if(dist_map.containsKey(distance)){
                                    dist_map.get(distance).add(h_cell);
                                }
                                else {
                                    ArrayList<Cell> cell_array = new ArrayList<>();
                                    cell_array.add(h_cell);
                                    dist_map.put(distance, cell_array);
                                }
                            }


                        }

                    }
                }
                cells_map.put(cell, dist_map);

            }
            
        }
        System.out.println("finish");
    }
}
