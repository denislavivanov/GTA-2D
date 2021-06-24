import org.joml.Vector2f;

public class FoodStore extends GameObject {
    Sprite sprite;

    public FoodStore(Vector2f pos, Vector2f size) {
        super(pos, size);

        this.sprite = new Sprite("Graphics/Textures/mall.png", super.data);
    }

    @Override
    public void draw(Vector2f pos) {
        sprite.draw(pos, super.Size);
    }
}