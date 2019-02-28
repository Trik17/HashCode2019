import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    //todo: Slice.java

    int countM, countT, countVisited = 0;
    Pizza pizza;
    Cell currentCell;


    public void algorithm(String path){
        this.pizza = new Pizza(path);
        pizza.read(); //setup problem is already called inside this

        Cell initialPosition = getInitialPos();
        //int x =initialPosition.x;
        //int y = initialPosition.y;
        currentCell = initialPosition;
        List<Slice> sol = new ArrayList<>();
        while(countVisited<(pizza.dim_columns*pizza.dim_rows)){
            countVisited++;
            if(!currentCell.isVisited) {
                Slice newSlice = generateCorrectSlice(currentCell);
                if (newSlice != null) {
                    sol.add(newSlice);
                }
            }else {
                continue;
            }
            currentCell = nextCell(currentCell);
        }

    }

    private Cell nextCell(Cell currentCell){
        return null;//todo
    }
    private Slice generateCorrectSlice(Cell currentCell){
        return null;//todo
    }

    private Cell getInitialPos() {
        return new Cell(0,0);
    }

    public static void main (String args[]){
        System.out.println("Started");
        Pizza prova = new Pizza(".\\HashCode19_prep\\d_big.in");
        prova.read();

        for (int i = 0; i < prova.dim_rows; i++) {
            for (int j = 0; j < prova.dim_columns; j++) {
                System.out.println(prova.charMatrix[i][j]);

            }
        }


        File currentDirFile = new File(".");
        String helper = currentDirFile.getAbsolutePath();
        System.out.println(helper);

        if (true){
            return;
        }

        Logic l = new Logic();
        l.algorithm(".\\HashCode19_prep\\a_example.in");
    }

}
