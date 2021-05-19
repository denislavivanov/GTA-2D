import static org.lwjgl.stb.STBImage.*;
import java.nio.ByteBuffer;

public class Texture {
    private int ID;
    private int[] width = new int[1];
    private int[] height = new int[1];
    private int[] nrChannels = new int[1];
    private ByteBuffer data;

    public Texture(String path) {
        stbi_set_flip_vertically_on_load(true);
        this.data = stbi_load(path, width, height, nrChannels, 0);
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getWidth() {
        return this.width[0];
    }

    public int getHeight() {
        return this.height[0];
    }
}