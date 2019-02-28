

public class Pizza extends Problem {

    public static int dim_rows, dim_columns, l, h;
    public char[][] charMatrix;
    public static Cell[][] matrix;

    public Pizza(String pathInput){
        super(pathInput);
    }


    public  void setupProblem() {
        String delims = "[\n]";
        String[] tokens = this.input.split(delims);

        delims = "[ ]";
        String[] t2 = tokens[0].split(delims);
        //System.out.println(t2[3].length());
        dim_rows = Integer.parseInt(t2[0]);
        dim_columns = Integer.parseInt(t2[1]);
        l = Integer.parseInt(t2[2]);
        h = Integer.parseInt(Character.toString(t2[3].charAt(0)));

        charMatrix = new char[dim_rows][dim_columns];
        matrix = new Cell[dim_rows][dim_columns];

        char[] charArray;

        for (int i = 0; i < dim_rows; i++) {
            charArray = tokens[i+1].toCharArray();
            for (int j = 0; j < dim_columns; j++) {
                charMatrix[i][j] = charArray[j];
                matrix[i][j] = new Cell(i,j,charArray[j]);
            }
        }
    }

}
