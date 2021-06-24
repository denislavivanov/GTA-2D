import org.joml.Vector2f;

public class Mall extends GameObject {
    Sprite sprite;

    public Mall(Vector2f pos, Vector2f size) {
        super(pos, size);

        this.sprite = new Sprite("Graphics/Textures/mall.png", super.data);
    }

    @Override
    public void draw(Vector2f pos) {
        sprite.draw(pos, super.Size);
    }
}