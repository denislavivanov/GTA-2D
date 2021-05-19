

public class Model {
    Mesh mesh;
    Texture tex;

    public Model(String mesh_path, String texture_path) {
        try {
            this.mesh = new Mesh(mesh_path);
        }catch(Exception e) {
            System.out.println(e);
        }
        
        this.tex = new Texture(texture_path);
    }
}