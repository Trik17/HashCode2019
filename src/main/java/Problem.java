import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Problem {


    public String path;
    public String input;
    public List<Photo> pictures = new ArrayList<>();
    //String path= ".\\Input\\a_example.txt";

    public void read(){
        try
        {
            input = readFile(path);
            //input  = new String(Files.readAllBytes(Paths.get(path)));
        }catch (IOException e){
            e.printStackTrace();
        }
        setupProblem();
    }

    private String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    private void setupProblem(){
        //todo
        String delims = "[\n]";
        //tokens sono le varie righe
        String[] inputLines = this.input.split(delims);
        int numPics = Integer.parseInt(inputLines[0]);

        for (int i = 1; i < numPics+1; i++) {

        }
        delims = "[ ]";
        String[] t2 = inputLines[0].split(delims);
        dim_rows = Integer.parseInt(t2[0]);
        dim_columns = Integer.parseInt(t2[1]);
        l = Integer.parseInt(t2[2]);
        h = Integer.parseInt(t2[3]);



        charMatrix = new char[dim_rows][dim_columns];
        matrix = new Cell[dim_rows][dim_columns];

        char[] charArray;

        for (int i = 0; i < dim_rows; i++) {
            charArray = inputLines[i+1].toCharArray();
            for (int j = 0; j < dim_columns; j++) {
                charMatrix[i][j] = charArray[j];
                matrix[i][j] = new Cell(i,j,charArray[j]);
            }
        }
        System.out.println("Problem setted");
    };

    public Problem(){
        this.path = ".\\Input\\a_example.txt";
    }


    public Problem(String pathInput){
        this.path = pathInput;

    }
}
