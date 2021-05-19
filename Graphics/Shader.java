import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Shader {
    private String src = "";
    private int ID;

    public Shader(String path) throws FileNotFoundException {
        File handle = new File(path);
        Scanner file = new Scanner(handle); 

        while(file.hasNextLine()) {
            String line = file.nextLine() + "\n";
            src += line;
        }

        file.close();
    }

    public String getSrc() {
        return this.src;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}