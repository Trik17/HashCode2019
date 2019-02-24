public class Slice extends SubMatrix {

    public int number_T = 0;
    public int number_M = 0;





    public Slice(int col1, int row1, int col2, int row2, int dimcol, int dimrow, int number_T, int number_M) {

        //TODO: cotruttore inizializza una riga e una colonna con T o M

        super(col1, row1, col2, row2, dimcol, dimrow);
        this.number_T = number_T;
        this.number_M = number_M;
    }



}
