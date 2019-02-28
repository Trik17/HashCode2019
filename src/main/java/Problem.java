import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class Problem {

    public String path;
    public String input;
    public List<Photo> pictures;
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

    };


    public Problem(String pathInput){
        this.path = pathInput;

    }
}
