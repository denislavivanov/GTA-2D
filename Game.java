import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL33C.*;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GL;
import org.joml.Vector2f;
import org.joml.Matrix4f;

public class Game {
    private Graphics renderer;
    private Player player;
    private Map map;
    private boolean gameover = false;
    private Matrix4f projection;
    private KeyboardInput keyboard_input;
    private CollisionDetection collision_detector;

    private void init() {
        renderer = new Graphics(1200, 800, "GTA II(kind of)", false);
        player = new Player(new Vector2f(1.0f, 1.0f), new Vector2f(32.0f, 32.0f), 10.0f);
        map = new Map(11, 11);
        collision_detector = new CollisionDetection();
        projection = new Matrix4f().ortho(0.0f, 11.0f, 11.0f, 0.0f, -1.0f, 1.0f, false);
        keyboard_input = new KeyboardInput(player, collision_detector);

        renderer.setKeyCallback(keyboard_input);
    }

    public void run() {
        init();

        while(!gameover) {
            render();            
            update();

            if(glfwWindowShouldClose(renderer.window))
                gameover = true;
        }
    }

    private void update() {
        glfwPollEvents();
    
        if(collision_detector.check(player, map.getExitBlock())) {
            gameover = true;
            System.out.println("Game over!");
        }
    }

    private void render() {
        glClear(GL_COLOR_BUFFER_BIT);

        renderer.setMatrix4f("projection", projection);
        map.draw(player);
        player.draw(new Vector2f(5.0f, 5.0f));

        glfwSwapBuffers(renderer.window);
    }
}