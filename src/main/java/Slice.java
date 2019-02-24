public class Slice extends SubMatrix {

    public int number_T = 0;
    public int number_M = 0;





    public Slice(int col, int row, int dimcol, int dimrow, int number_T, int number_M) {

        //TODO: cotruttore inizializza una riga e una colonna con T o M

        super(col, row, col, row, dimcol, dimrow);
        this.number_T = number_T;
        this.number_M = number_M;
    }
}
