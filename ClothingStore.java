import org.joml.Vector2f;

public class ClothingStore extends GameObject {
    Sprite sprite;

    public ClothingStore(Vector2f pos, Vector2f size) {
        super(pos, size);

        this.sprite = new Sprite("Graphics/Textures/clothingstore.png", super.data);
    }

    @Override
    public void draw(Vector2f pos) {
        sprite.draw(pos, super.Size);
    }
}