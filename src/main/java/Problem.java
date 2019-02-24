public abstract class Problem {

    public String path;
    public String input;

    public void read(){

    }

    public abstract void setupProblem();



    public Problem(String pathInput){
        this.path = pathInput;

    }



}
