package Gravitational_pull_ProjectV2.Simulation;

import org.lwjgl.opengl.GL11;

// this file is to make object in order for them to be simulated.
public class objects {

    static void drawCircle(float radius, float yPosition, float xPosition) {

        int segment = 100;

        // Fix the circle's shape based on the window's width and height
        float aspectRatio = 640.0f / 480.0f;

        GL11.glBegin(GL11.GL_TRIANGLE_FAN);

        // Start from the center of the circle
        GL11.glVertex2f(xPosition, yPosition);


        for (int i = 0; i <= segment; i++) {

            double angle = 2 * Math.PI * i / segment;

            float x = (float) (radius * Math.cos(angle));
            float y = (float) (radius * Math.sin(angle));

            // Adjust X so the circle doesn't look stretched
            x /= aspectRatio;

            GL11.glVertex2f(x + xPosition, y + yPosition);
        }

        GL11.glEnd();
    }
}