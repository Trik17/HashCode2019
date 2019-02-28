public class Cell {

    public int x; //row
    public int y; //col
    private char value; //it s
    public boolean isVisited = false;

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
        if (value!='M' && value!='T'){
            throw new IllegalArgumentException("Only Char, M or T.");
        }
        this.value = value;
    }
}
