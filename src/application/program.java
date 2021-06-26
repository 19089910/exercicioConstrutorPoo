package application;

import Account.conta;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        /**chamada para a conta exintem 3,
         * a conta conta; que simples mente instancia os publicos
         * conta = new conta(numero, titular, deposito) que e um construtor especifico para capiturar os valores das variaveis temporarias passadas pelo parametro
         * conta = new conta(numero, titular) que e um contrutor especifico para capiturar os valores das variaves temporarias passadas pelo parametro
         * */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta conta;

        System.out.print("Insira o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Existe um depósito inicial (s/n)? ");
        char resp = sc.next().charAt(0);
        if (resp == 's'){
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInical = sc.nextDouble();
            conta = new conta(numero, titular, depositoInical);
        }
        else {
            conta = new conta(numero, titular);
        }

        System.out.println("\nDados da conta:");
        System.out.println(conta);

        System.out.print("Insira um valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depodito(valorDeposito);

        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);

        System.out.print("\nInsira um valor de retirada: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println(conta);


    }
}
