package PRATICA_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Main calculadora = new Main();

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("A soma dos dois numeros é: " + calculadora.somar(numero1, numero2));
        System.out.println("A subtracao dos dois numeros é: " + calculadora.subtrair(numero1, numero2));
        System.out.println("A divisao dos dois numeros é: " + calculadora.dividir(numero1, numero2));
        System.out.println("A multiplicação dos dois numeros é: " + calculadora.multiplicar(numero1, numero2));
    }

    public double somar(double num1, double num2){
        return num1 + num2;
    }

    public double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public double dividir(double num1, double num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}
