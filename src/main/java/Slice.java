import java.util.ArrayList;
import java.util.List;

public class Slice extends SubMatrix {

    public int number_T = 0;
    public int number_M = 0;
    public List<Cell> cells;
    public Pizza pizza;


    public Slice(int col1, int row1, int col2, int row2, int dimcol, int dimrow, int number_T, int number_M, Pizza pizza) {

        //TODO: cotruttore inizializza una riga e una colonna con T o M

        super(col1, row1, col2, row2, dimcol, dimrow);
        this.cells = new ArrayList<>();

        for(int i = row1; i<row2; i++){
            for(int j = col1; j<col2; j++){
                pizza.matrix[i][j]
                cells.add(pizza.matrix[i][j]);
            }
        }

        this.number_T = number_T;
        this.number_M = number_M;
        this.pizza = pizza;
    }
    //todo costruttore più base & funzione per calcolare col1, etc...

    public void addCell(Cell c){
       // Using the 4 numbers of the slice
       if(c.y < this.col1){
           // cell is on the left so we update the left column extending it to the left
           this.col1 = c.y;
       }else if(c.y > this.col2){
           // if it is on the right extend to the right
           this.col2 = c.y;
       } // otherwise no need to change it

       // we work on the rows now
       if(c.x < this.row1){
           // extend above
           this.row1 = c.x;
       }else if(c.x > this.row2){
           // extend to the bottom
           this.row2 = c.x;
       }
       // now we need to check the integrity of the newly created slice while adding the cell to the slice
       for(int i = row1; i<row2; i++){
            for(int j = col1; j<col2; j++){
                if(cells){

                }
            }
       }
    }
}
