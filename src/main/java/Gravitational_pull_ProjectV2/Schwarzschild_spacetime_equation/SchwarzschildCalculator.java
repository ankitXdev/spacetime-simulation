package Gravitational_pull_ProjectV2.Schwarzschild_spacetime_equation;

public class SchwarzschildCalculator {

    public double G = 6.67430e-11; // G = Gravitational content
    public double c = 299792458;   // c = Speed of light

    // Calculates the Schwarzschild metric function f(r) using the body's mass and radius.
    double calculateFr(Body body){

        double Mass = body.M;  
        double radius = body.r;

        double Fr = 1 - (2*G*Mass)/(radius*c*c);

        return Fr;
    }

    // Calculates the Schwarzschild metric tensor using f(r),
    // the body's radius, and the polar angle theta. 
    double[][] calculateMatricTensor(double Fr, Body body, double theta){

        double radius = body.r;

        double g_tt = -Fr; //System.out.print("g_tt: "+g_tt);
        double g_rr = 1/Fr; //System.out.print("g_rr: "+g_rr);
        double gThetaTheta = radius*radius; //System.out.print("gThetaTheta "+gThetaTheta);
        double gPhiPhi = (radius*radius)*Math.sin(theta)*Math.sin(theta);//System.out.print("gPhiPhi: "+gPhiPhi);

        double[][] metric = new double[4][4];

        metric[0][0] = g_tt;
        metric[1][1] = g_rr; 
        metric[2][2] = gThetaTheta;
        metric[3][3] = gPhiPhi;

        return metric;
    }

    // Calculates the Schwarzschild radius 
    double calculateSchwarzschildRadius(double G, Body body, double c){

        double Mass = body.M;

        double r_s = 2*(G*Mass)/(c*c);

        return r_s;
    }
    
}
