import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);

        System.out.println("Su IMC es: " + imc);

        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc >= 17 && imc < 18.8) {
            System.out.println("Delgadez leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad leve");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad moderada");
        } else if (imc >= 40) {
            System.out.println("Obesidad severa");
        }
      
    }
}

