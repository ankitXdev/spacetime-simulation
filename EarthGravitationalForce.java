package Gravitational_pull_Project;

public class EarthGravitationalForce {
    public static double Earth_pull(
        double distance_obj,
        double r_obj,
        double Mass_Obj){

        double G = 6.674 * Math.pow(10, -11); 
        // Gravitational constant in N·m²/kg²

        double MassEarth = 5.972 * Math.pow(10, 24); 
        // Mass of Earth in kg

        double r_earth = 6.371 * Math.pow(10, 6); 
        // Radius of Earth in meters

        double r = r_obj + r_earth + distance_obj; 
        // Center-to-center distance between Earth and the object in meters

        double Pull = G * (Mass_Obj * MassEarth) / (r * r); 
        // Newton's law of universal gravitation: F = G(M1 × M2) / r²

        return Pull;
        }

}