# Gravitational Force Project

A Java project that calculates and analyzes the gravitational forces acting on an object due to the Earth and the Sun.

## Overview

This project uses Newton's Law of Universal Gravitation to calculate:

- Gravitational force exerted by Earth
- Gravitational force exerted by the Sun
- Net gravitational force
- Direction of the net gravitational force
- Acceleration of the object

## Physics

The gravitational force is calculated using Newton's Law of Universal Gravitation:

F = G × (M₁ × M₂) / r²

Where:

- F = Gravitational force in Newtons (N)
- G = Gravitational constant
- M₁ = Mass of the first body
- M₂ = Mass of the second body
- r = Center-to-center distance between the bodies

The acceleration of the object is calculated using Newton's Second Law:

a = F_net / m

Where:

- a = Acceleration in m/s²
- F_net = Net gravitational force in Newtons
- m = Mass of the object in kilograms

## Project Structure

```text
Gravitational_pull_Project/
│
├── EarthGravitationalForce.java
├── SunGravitationalForce.java
├── NetGravitational_Pull.java
└── README.md