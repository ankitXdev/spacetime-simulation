package Gravitational_pull_ProjectV2.Simulation;

import java.nio.ByteBuffer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;;

public class Main {

    static float circleY = 0.0f;        //vertical position for object
    static float circleX = 0.0f;        // horizontal position of object

    static float velocityY = 0.0f;      //vertical velocity
    static float velocityX = 0.0f;      //horizontal velocity

    static float gravity = -9.80665f;   // gravity

    // variable for boundary collision
    static float top = 1.0f;
    static float left = -1.0f;
    static float right = 1.0f;
    static float bottom = -1.0f;

    static float radius = 0.05f;        // Radius of the circle in OpenGL coordinate units

    public static void main(String[] args) {

        // This initialize GLFW and if there is an error it will
        // throw exception error message "Unable to initialize GLFW".
        if (!GLFW.glfwInit()){

            throw new
            IllegalStateException("Unable to initialize GLFW");

        }

        // create window
        ByteBuffer title = org.lwjgl.system.MemoryUtil.memUTF8("Simulation");

        // GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 2);
        // GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 1);

        long window = GLFW.glfwCreateWindow(640, 480, title, 0L, 0L);

        if (window==0L){

            throw new
            IllegalStateException("Failed to create window");

        }

        GLFW.glfwMakeContextCurrent(window);

        // Get OpenGL ready so we can start using it.
        GL.createCapabilities();

        // background
        GL11.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);

        double lastTime = GLFW.glfwGetTime();

        while (!GLFW.glfwWindowShouldClose(window)){
            
            // Render something here
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

            // Show the rendered frame

            double currentTime = GLFW.glfwGetTime(); // current time
            float deltaTime = (float) (currentTime - lastTime); // change in time
            lastTime = currentTime; // updating lastime to be current time

            // Apply gravity
            velocityY += gravity * deltaTime;

            // Move the circle
            circleY += velocityY * deltaTime;
            circleX += velocityX * deltaTime;


            // Bottom collision
            if (circleY - radius <= bottom) {
                circleY = bottom + radius;
                velocityY = -velocityY;
            }


            // Top collision
            if (circleY + radius >= top) {
                circleY = top - radius;
                velocityY = -velocityY;
            }


            // Left collision
            if (circleX - radius <= left) {
                circleX = left + radius;
                velocityX = -velocityX;
            }


            // Right collision
            if (circleX + radius >= right) {
                circleX = right - radius;
                velocityX = -velocityX;
            }


            objects.drawCircle(radius, circleY, circleX);

            GLFW.glfwSwapBuffers(window);

            // Check for keyboard, mouse and window events
            GLFW.glfwPollEvents();
        }

        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
    }
}