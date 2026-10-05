package Gravitational_pull_Project;

public class NetGravitational_Pull {

    public static void main(String[] args) {

        // Calculate the gravitational force exerted by Earth on the object.
        // distance_obj = surface-to-surface distance
        // r_obj = radius of the object
        // Mass_Obj = mass of the object
        double EarthPull = EarthGravitationalForce.Earth_pull(
                7.8335015 * Math.pow(10, 10),
                3.3895 * Math.pow(10, 6),
                6.4169 * Math.pow(10, 23)
        );

        // Calculate the gravitational force exerted by the Sun on the object.
        double SunPull = SunGravitationalForce.Sun_pull(
                7.8335015 * Math.pow(10, 10),
                3.3895 * Math.pow(10, 6),
                6.4169 * Math.pow(10, 23)
        );

        // Calculate the net gravitational force.
        // Positive value indicates a greater force toward the Sun.
        // Negative value indicates a greater force toward Earth.
        double NetGrav_Pull = SunPull - EarthPull;

        System.out.println("Net gravitational force: " + NetGrav_Pull + " N");

        // Store the index representing the direction of the net force.
        // 0 = Sun, 1 = Earth, 2 = Stationary
        int Moving_Toward;

        // Mass of the object in kilograms.
        double MassObj = 6.4169 * Math.pow(10, 23);

        // Determine the direction of the net gravitational force.
        if (NetGrav_Pull > 0) {
            Moving_Toward = 0;
        } else if (NetGrav_Pull < 0) {
            Moving_Toward = 1;
        } else {
            Moving_Toward = 2;
        }

        // Array containing the possible directions of motion.
        String[] Body = {"Sun", "Earth", "Stationary"};

        // Convert the direction index into its corresponding name.
        String Direction = Body[Moving_Toward];

        // Calculate the object's acceleration using Newton's second law:
        // a = F_net / m
        double Acceleration = NetGrav_Pull / MassObj;

        // Display the resulting acceleration and its direction.
        System.out.println(
                "Object acceleration: " + Acceleration
                        + " m/s², directed toward " + Direction
        );
    }
}