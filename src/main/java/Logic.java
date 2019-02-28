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
        Slice currentSlice = new Slice(currentCell);
        boolean check = false;
        while (currentSlice.number_M< Pizza.l && currentSlice.number_T< Pizza.l){
            if(currentSlice.number_M<Pizza.l){
                check = M(currentSlice);
                if (!check){
                    return null;
                }
            }
            if(currentSlice.number_T<Pizza.l){
                check = T(currentSlice);
                if (!check){
                    return null;
                }
            }
        }
        return currentSlice;
    }

    /*
    Q: In Java, gli oggetti vengono passati ai metodi per valore o per riferimento? E i valori dei tipi base?
A:
In Java, il passaggio degli argomenti avviene sempre per valore.
Tuttavia, in Java gli oggetti non vengono mai passati come argomento; invece, vengono sempre passati i loro reference.
Quindi, non ha senso chiedere come vengano passati gli oggetti, perché gli oggetti non vengono mai passati.
     */

    private boolean M(Slice currentS){
        currentS = takeNearestAcceptable(currentS,'M');
        if (currentS == null){
            currentCell.isVisited = true;
            return false;
        }
        return true;
    }

    private boolean T(Slice currentS){
        currentS = takeNearestAcceptable(currentS,'T');
        if (currentS == null){
            currentCell.isVisited = true;
            return false;
        }
        return true;
    }

    private Slice takeNearestAcceptable(Slice slice, char content){
        boolean notFound = true;
        while (notFound){
            //todo serve la loro mappa
        }
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
