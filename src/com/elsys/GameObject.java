import org.joml.Vector2f;

public abstract class GameObject {
    Vector2f Position;
    Vector2f Size;

    public GameObject(Vector2f pos, Vector2f size) {
        this.Position = pos;
        this.Size = size;
    }
}
