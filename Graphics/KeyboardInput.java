import org.lwjgl.glfw.GLFWKeyCallback;
import org.joml.Vector2f;
import static org.lwjgl.glfw.GLFW.*;

public class KeyboardInput extends GLFWKeyCallback {
    private Player player;
    private CollisionDetection collision_detector;

    public KeyboardInput(Player player, CollisionDetection collision_detector) {
        this.player = player;
        this.collision_detector = collision_detector;
    }
    
    @Override
    public void invoke(long window, int key, int scancode, int action, int mods) {
        if(action == GLFW_PRESS) {
            if(key == GLFW_KEY_W) {
                player.move(new Vector2f(0.0f, -player.getSpeed()));

                if(collision_detector.check_map(player)) {
                    player.move(new Vector2f(0.0f, player.getSpeed()));
                }
            }
            if(key == GLFW_KEY_A) {
                player.move(new Vector2f(-player.getSpeed(), 0.0f));

                if(collision_detector.check_map(player)) {
                    player.move(new Vector2f(player.getSpeed(), 0.0f));
                }
            }
            if(key == GLFW_KEY_S) {
                player.move(new Vector2f(0.0f, player.getSpeed()));

                if(collision_detector.check_map(player)) {
                    player.move(new Vector2f(0.0f, -player.getSpeed()));
                }
            }
            if(key == GLFW_KEY_D) {
                player.move(new Vector2f(player.getSpeed(), 0.0f));

                if(collision_detector.check_map(player)) {
                    player.move(new Vector2f(-player.getSpeed(), 0.0f));
                }
            }
        }
    }
}