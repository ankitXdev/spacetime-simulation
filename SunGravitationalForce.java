package Gravitational_pull_Project;

public class SunGravitationalForce {

    public static double Sun_pull(
            double distance_obj,
            double r_obj,
            double Mass_Obj) {

        double G = 6.674 * Math.pow(10, -11);
        // Gravitational constant in N·m²/kg²

        double MassSun = 1.989 * Math.pow(10, 30);
        // Mass of Sun in kg

        double r_sun = 6.96 * Math.pow(10, 8);
        // Radius of Sun in meters

        double r = r_obj + r_sun + distance_obj;
        // Center-to-center distance between Sun and object in meters

        double Pull = G * (Mass_Obj * MassSun) / (r * r);
        // Newton's law of universal gravitation: F = G(M1 × M2) / r²
        
        return Pull;
    }

}