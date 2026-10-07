package Gravitational_pull_ProjectV2.Simulation;

import java.nio.ByteBuffer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;;

public class Main {

    static float circleY = 0.0f;    //vertical position for circle
    static float velocityY = 0.0f; //vertical velocity
    static float gravity = -9.80665f; // gravity

    public static void main(String[] args) {
        
        // This initialize  GLFW and if there is an error it will throw exception error message "Unable to initialize GLFW".
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

            drawCircle(0.05f,circleY);

            GLFW.glfwSwapBuffers(window);
            // Check for keyboard, mouse and window events
            GLFW.glfwPollEvents();
        }

        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
    }
    
    static void drawCircle(float radius, float yPosition){
        int segment = 100;

        // Fix the circle's shape based on the window's width and height
        float aspectRatio = 640.0f / 480.0f;

        GL11.glBegin(GL11.GL_TRIANGLE_FAN);

        // Start from the center of the circle
        GL11.glVertex2f(0.0f, yPosition);


        for (int i = 0; i <= segment; i++ ){

            double angle = 2*Math.PI*i/segment;

            float x = (float) (radius*Math.cos(angle));

            float y = (float) (radius*Math.sin(angle));

            // Adjust X so the circle doesn't look stretched (p.s: it looked like an egg before ;-))
            x /= aspectRatio;

            GL11.glVertex2f(x,y + yPosition);
        }

        GL11.glEnd();
    }
}
