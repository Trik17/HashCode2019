import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
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
        String delims = "[\n]";
        //tokens sono le varie righe
        String[] inputLines = this.input.split(delims);
        int numPics = Integer.parseInt(inputLines[0]);

        delims = "[ ]";
        boolean picIsV;
        HashSet<String > picTags=new HashSet<>();
        String[] l;
        char p;
        int numTags;
        for (int i = 1; i < numPics+1; i++) {
            //Photo(int id, boolean isVertical, HashSet<String > tags)
            //id = i-1
            l = inputLines[i].split((delims));
            p = l[0].charAt(0);
            if(p=='H'){
                picIsV=false;
            }else {
                picIsV=true;
            }
            numTags = Integer.parseInt(l[1]);

            for (int j = 0; j < numTags; j++) {
                //System.out.println(l[j]);
                //System.out.println(l[j+2]);
                boolean a = picTags.add(l[j+2]);
                if (!a){
                    System.out.println("ERROREEEEEEEEEEE");
                }
            }


            pictures.add(new Photo(i-1,picIsV,picTags));
            picTags = new HashSet<>();
        }


        System.out.println("Problem setted");
    };

    public Problem(){
        this.path = ".\\Input\\a_example.txt";
    }

    public void printInput(){
        for (int i = 0; i < pictures.size(); i++) {
            //System.out.println("\n");
            String print = Integer.toString(pictures.get(i).id);
            if (pictures.get(i).isVertical){
                print = print+" V ";
            }else {
                print = print+" H ";
            }
            print = print + Integer.toString(pictures.get(i).tags.size());
            for (String s : pictures.get(i).tags) {
                print = print + " ";
                print = print + s;
            }
            System.out.println(print);
        }
    }


    public Problem(String pathInput){
        this.path = pathInput;

    }

    public static void main (String args[]){
        Problem p = new Problem(".\\Input\\b_lovely_landscapes.txt");
        p.read();
        p.printInput();
        //System.out.println("ZZZZZZZZZZZZZZZZZ");

        //System.out.println(p.pictures.size());
        //System.out.println(p.pictures.get(0).tags.size());

    }
}
