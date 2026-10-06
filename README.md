# Gravitational Pull Project

A Java-based physics simulation project exploring **gravity, spacetime curvature, and the Schwarzschild metric** from General Relativity.

The project is being developed as an experimental simulation to understand how the mathematical description of curved spacetime can be translated into software.

## Overview

In classical Newtonian physics, gravitational force is described using:

\[
F = \frac{GMm}{r^2}
\]

General Relativity provides a different interpretation. Instead of treating gravity simply as a force, massive objects cause **spacetime to curve**, and objects move through this curved spacetime.

This project explores that idea computationally, beginning with the **Schwarzschild solution** for the spacetime surrounding a non-rotating, spherically symmetric mass.

## Current Features

- Java implementation of Schwarzschild spacetime calculations
- Representation of physical bodies using Java classes
- Calculation of Schwarzschild metric components
- Initial spacetime fabric simulation
- Maven-based project structure
- Separation of physics calculations and simulation logic

## Project Structure

```text
Gravitational_pull_Project/
│
├── pom.xml
│
├── src/
│   └── main/
│       └── java/
│           └── Gravitational_pull_ProjectV2/
│               │
│               ├── Schwarzschild_spacetime_equation/
│               │   ├── Body.java
│               │   ├── Main.java
│               │   └── SchwarzschildCalculator.java
│               │
│               └── Simulation/
│                   ├── SimulationMain.java
│                   └── SpaceTimeFabric.java
│
└── target/
    └── ...
```

### Main Components

#### `Body`

Represents a physical object used in the simulation.

It contains properties such as the object's physical characteristics that are required for gravitational and spacetime calculations.

#### `SchwarzschildCalculator`

Contains calculations related to the **Schwarzschild metric**.

The Schwarzschild metric describes spacetime around a non-rotating, spherically symmetric mass.

The metric is commonly expressed as:

\[
ds^2 =
-\left(1-\frac{2GM}{rc^2}\right)c^2dt^2
+
\left(1-\frac{2GM}{rc^2}\right)^{-1}dr^2
+
r^2d\theta^2
+
r^2\sin^2(\theta)d\phi^2
\]

The project currently focuses on calculating the individual metric components from this equation.

#### `SpaceTimeFabric`

Responsible for representing the spacetime grid/fabric used by the simulation.

The current implementation is an early stage of the eventual visualization and simulation system.

#### `SimulationMain`

Entry point for the simulation-related code.

This will eventually become the main driver for the spacetime simulation.

## Technologies

- **Java**
- **Maven**
- **JavaFX** - planned/used for visualization
- **Git/GitHub**

## Requirements

To run the project, you will need:

- Java JDK
- Maven
- Git (optional, for cloning the repository)

Check your installations:

```bash
java -version
mvn -version
```

## Running the Project

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project:

```bash
cd Gravitational_pull_Project
```

Compile the project:

```bash
mvn clean compile
```

Run the appropriate Java main class from your IDE or using your configured Maven/JavaFX setup.

## Development Approach

The project is being developed incrementally.

### Phase 1 - Physics

- [x] Create physical body representation
- [x] Implement Schwarzschild calculations
- [x] Calculate metric components
- [ ] Implement additional spacetime quantities
- [ ] Validate calculations against known physical examples

### Phase 2 - Spacetime Representation

- [x] Create spacetime fabric representation
- [ ] Generate a larger spacetime grid
- [ ] Calculate curvature across the grid
- [ ] Represent the effect of different masses

### Phase 3 - Visualization

- [ ] Create 2D visualization
- [ ] Create 3D spacetime visualization
- [ ] Add interactive camera controls
- [ ] Display bodies inside the simulated spacetime
- [ ] Visualize changes in spacetime curvature

### Phase 4 - Advanced Simulation

- [ ] Simulate multiple massive objects
- [ ] Calculate gravitational effects dynamically
- [ ] Simulate particle trajectories
- [ ] Explore geodesic motion
- [ ] Experiment with different spacetime metrics

## Physics

The primary mathematical model currently being explored is the **Schwarzschild metric**.

The Schwarzschild radius is:

$$
r_s = \frac{2GM}{c^2}
$$

where:

- \(G\) = gravitational constant
- \(M\) = mass of the object
- \(c\) = speed of light
- \(r_s\) = Schwarzschild radius

The metric components describe how coordinates such as time and radial distance behave in the curved spacetime surrounding the mass.

## Project Goal

The long-term goal of this project is to build a visual and computational environment where a user can:

1. Create a massive object such as a star or black hole.
2. Define its physical properties.
3. Calculate the resulting spacetime geometry.
4. Visualize the curvature of spacetime.
5. Place particles or other objects within that spacetime.
6. Simulate their motion through the curved geometry.

The project is primarily intended as a **learning and experimentation project** combining:

**Physics + Mathematics + Java + Simulation + Visualization**

## Status

**Early Development**

The project is currently focused on implementing the mathematical foundation before building the complete visualization and simulation system.

## Disclaimer

This project is an educational and experimental simulation. It is not intended to provide a complete numerical solution to Einstein's field equations or reproduce all effects of General Relativity with physical accuracy.

## Author

**Ankit Sen**

B.Voc (AI & Robotics)

Dayalbagh Educational Institute