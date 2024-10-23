import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String diagnostico = obtenerDiagnostico(imc);

        System.out.println("El IMC es: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);
    }

    // calcular IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Diagnostico
    public static String obtenerDiagnostico(double imc) {
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        } else if (imc >= 25 && imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc >= 30 && imc <= 34.9) {
            return "OBESIDAD TIPO 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}
