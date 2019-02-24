import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Problem {

    public String path;
    public String input;

    public void read(){
        try
        {
            input  = new String(Files.readAllBytes(Paths.get(path)));
        }catch (IOException e){
            e.printStackTrace();
        }
        setupProblem();
    }

    public abstract void setupProblem();



    public Problem(String pathInput){
        this.path = pathInput;

    }



}
