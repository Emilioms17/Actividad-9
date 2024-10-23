import java.util.Scanner;

public class Paciente {
    // Atributos
    private String nombre;
    private double peso;
    private String sexo;
    private double altura;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.print("Ingrese el nombre: ");
        paciente.setNombre(scanner.nextLine());

        System.out.print("Ingrese el sexo: ");
        paciente.setSexo(scanner.nextLine());

        System.out.print("Ingrese el peso en kg: ");
        paciente.setPeso(scanner.nextDouble());

        System.out.print("Ingrese la altura en m: ");
        paciente.setAltura(scanner.nextDouble());

        double imc = calcularIMC(paciente.getPeso(), paciente.getAltura());
        String diagnostico = obtenerDiagnostico(imc);

        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Peso: " + paciente.getPeso() + " kg");
        System.out.println("Altura: " + paciente.getAltura() + " m");
        System.out.println("El IMC es: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);
    }

    // IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

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