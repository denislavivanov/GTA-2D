import org.joml.Vector2f;

public class Exit extends GameObject {
    Sprite sprite;

    public Exit(Vector2f pos, Vector2f size) {
        super(pos, size);

        this.sprite = new Sprite("Graphics/Textures/exit.png", super.data);
    }

    @Override
    public void draw(Vector2f pos) {
        sprite.draw(pos, super.Size);
    }
}