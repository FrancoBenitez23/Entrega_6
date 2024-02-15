package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float numeroA, numeroB;
        char operacion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero a: ");
        numeroA = scanner.nextFloat();
        System.out.println("Ingrese un numero b: ");
        numeroB = scanner.nextFloat();

        System.out.println("Ingrese la operacion que desea realizar [+, -, *, /, %]: ");
        operacion = scanner.next().charAt(0);
        while(operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != '%'){
            System.out.println("Ingrese la operacion que desea realizar [+, -, *, /, %]: ");
            operacion = scanner.next().charAt(0);
        }

        realizarOperacion(numeroA, numeroB, operacion);

    }

    public static void realizarOperacion(float a, float b, char operacion) {
        switch (operacion) {
            case '+':
                System.out.println(a + "+" + b + "=" + sumar(a, b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + restar(a, b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + multiplicar(a, b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + dividir(a, b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + resto(a, b));
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float restar(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }

    public static float resto(float a, float b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("No se puede obtener el resto al dividir por cero.");
            return 0;
        }
    }
}


