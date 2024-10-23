import java.util.Scanner;

public class Persona {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();


        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese el sexo: ");
        persona.setSexo(scanner.nextLine());

        System.out.print("Ingrese el peso en kg: ");
        persona.setPeso(scanner.nextDouble());

        System.out.print("Ingrese la altura en metros: ");
        persona.setAltura(scanner.nextDouble());

        double imc = calcularIMC(persona.getPeso(), persona.getAltura());
        String diagnostico = obtenerDiagnostico(imc);

        // Mostrar resultados
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Peso: " + persona.getPeso() + " kg");
        System.out.println("Altura: " + persona.getAltura() + " m");
        System.out.println("El IMC es: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);
    }
}
