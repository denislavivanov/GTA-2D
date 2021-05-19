import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.FloatBuffer;

public class Mesh {
    private ArrayList<Float> data = new ArrayList<>();
    private int vertexCount = 0;

    public Mesh(String path) throws FileNotFoundException {
        File handle = new File(path);
        Scanner file = new Scanner(handle);

        ArrayList<Float> vertices = new ArrayList<>();
        ArrayList<Float> texCoords = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        ArrayList<Integer> texIndices = new ArrayList<>();

        while(file.hasNextLine()) {
            String line = file.nextLine();
            String[] arr = line.split(" ");
            
            if(arr[0].equals("v")) {
                vertices.add(Float.parseFloat(arr[1]));
                vertices.add(Float.parseFloat(arr[2]));
                vertices.add(Float.parseFloat(arr[3]));
            }

            if(arr[0].equals("vt")) {
                texCoords.add(Float.parseFloat(arr[1]));
                texCoords.add(Float.parseFloat(arr[2]));
            }

            if(arr[0].equals("f")) {
                String[] pair1 = arr[1].split("/");
                String[] pair2 = arr[2].split("/");
                String[] pair3 = arr[3].split("/");

                indices.add(Integer.parseInt(pair1[0]) - 1);
                indices.add(Integer.parseInt(pair2[0]) - 1);
                indices.add(Integer.parseInt(pair3[0]) - 1);

                texIndices.add(Integer.parseInt(pair1[1]) - 1);
                texIndices.add(Integer.parseInt(pair2[1]) - 1);
                texIndices.add(Integer.parseInt(pair3[1]) - 1);
            }
        }

        for(int i = 0; i < indices.size(); i++) {
            data.add(vertices.get(indices.get(i) * 3));
            data.add(vertices.get(indices.get(i) * 3 + 1));
            data.add(vertices.get(indices.get(i) * 3 + 2));

            data.add(texCoords.get(texIndices.get(i) * 2));
            data.add(texCoords.get(texIndices.get(i) * 2 + 1));

            vertexCount++;
        }
    }

    public float[] getData() {
        float[] temp = new float[data.size()];

        for(int i = 0; i < temp.length; i++) {
            temp[i] = data.get(i).floatValue();
        }

        return temp;
    }

    public int getVertexCount() {
        return this.vertexCount;
    }
}