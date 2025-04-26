/**
 * Programa: Información del Visitante
 * Autor: Romario Ramírez
 * Fecha: 26/04/2025
 * Descripción: Programa que almacena e imprime información sobre un visitante usando todos los tipos de datos primitivos en Java.
 */

public class Visitante {
    public static void main(String[] args) {
        // Declaración y asignación de variables
        String nombre = "Carlos Ramírez";        // Nombre del visitante
        int edad = 30;                           // Edad del visitante
        char genero = 'M';                       // Género del visitante (M para masculino, F para femenino)
        boolean tieneMascota = false;             // Si el visitante tiene mascota
        float altura = 1.82f;                    // Altura del visitante en metros
        double peso = 78.3;                      // Peso del visitante en kilogramos
        short numeroDepartamento = 204;          // Número del departamento que visita
        long telefono = 5526781234L;              // Número de teléfono del visitante
        byte cantidadVisitantes = 2;             // Cantidad de personas en la visita

        // Imprimir la información del visitante
        System.out.println("===================================");
        System.out.println("  Bienvenido al edificio 'Las Palmas'");
        System.out.println("  Programa realizado por Romario Ramírez");
        System.out.println("===================================");
        System.out.println("Información del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Género: " + genero);
        System.out.println("¿Tiene mascota?: " + tieneMascota);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cantidad de visitantes: " + cantidadVisitantes);
    }
}