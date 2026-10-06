package Gravitational_pull_ProjectV2.Schwarzschild_spacetime_equation;

import java.util.Arrays;

// this file create the object
// also i can see result here 

public class Main {

    public static void main(String[] args) {

        double theta = Math.PI / 2;
        double G = 6.67430e-11; // G = Gravitational content
        double c = 299792458;

        Body sun = new Body(
            1.989e30,
            6.957e8
        );

            SchwarzschildCalculator calculator = new SchwarzschildCalculator();
            
            // this is f(r) 
            double fr = calculator.calculateFr(sun);

            // this is metric tensor and it is denoted by g_μν.
            double[][] MetricTensor = calculator.calculateMatricTensor(fr, sun, theta);

            // this is Schwarzschild Radius and it is denoted by rs.
            double SchwarzschildRadius = calculator.calculateSchwarzschildRadius(G, sun, c);

    }
}
