package PizzaProblem;

public class Cell {

    public int x; //row
    public int y; //col
    private char value; //it s
    public boolean isVisited = false;
    public boolean isOccupied = false;

    public Cell(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Cell(int x,int y, char v){
        this.x=x;
        this.y=y;
        this.value=v;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        value = Character.toUpperCase(value);
        if (value!='M' && value!='T'){
            throw new IllegalArgumentException("Only Char, M or T.");
        }
        this.value = value;
    }

    public static double cellDistance(Cell c1, Cell c2){
        return Utils.distance(c1.x,c2.x,c1.y,c2.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.x == ((Cell) obj).x && this.y == ((Cell) obj).y) {
            if (this.value != ((Cell) obj).value){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("There are two instances of a cell with different values!");
                    e.printStackTrace();
                }
            }
            return true;
        }
        return false;
    }
}
