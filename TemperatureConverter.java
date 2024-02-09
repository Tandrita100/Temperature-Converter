package com.projects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String [] args) {

        boolean exit = false;

        while (!exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Kelvin to Fahrenheit");
            System.out.println("6. Fahrenheit to Kelvin");
            System.out.println("7. Exit");
            System.out.println("Choose an option");

            int choice = sc.nextInt();
            double temperature;

            switch (choice) {
                case 1:
                    System.out.println("Enter the temperature in celsius:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f celsius = %.2f fahrenheit\n", temperature, celsiusToFahrenheit(temperature));
                    //System.out.println(temperature + " celsius = " + celsiusToFahrenheit(temperature) + " fahrenheit");
                    break;
                case 2:
                    System.out.println("Enter the temperature fahrenheit:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f fahrenheit = %.2f celsius\n", temperature, fahrenheitToCelsius(temperature));
                    break;
                case 3:
                    System.out.println("Enter the temperature in celsius:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f celsius = %.2f kelvin\n", temperature, celsiusToKelvin(temperature));
                    break;
                case 4:
                    System.out.println("Enter the temperature in kelvin:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f kelvin = %.2f celsius", temperature, kelvinToCelsius(temperature));
                    break;
                case 5:
                    System.out.println("Enter the temperature in kelvin:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f kelvin = %.2f fahrenheit\n", temperature, KelvinToFahrenheit(temperature));
                    break;
                case 6:
                    System.out.println("Enter the temperature in fahrenheit:");
                    temperature = sc.nextDouble();
                    System.out.printf("%.2f fahrenheit = %.2f kelvin\n", temperature, fahrenheitToKelvin(temperature));
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("INVALID!");
            }
        }
    }

    //methods for conversion
    public static double celsiusToFahrenheit(double celsius) {
        return (9/5.0 * celsius) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32 ) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double KelvinToFahrenheit(double kelvin) {
        return 1.8 * (kelvin - 273) + 32;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

}
