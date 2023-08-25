package com.contaterminal;
import java.util.Scanner;

import com.contaterminal.classes.Conta;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da conta");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o número da agência");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite seu nome");
        conta.setNomeCliente(scanner.next());

        System.out.println("Por favor, digite o saldo da conta");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá "+conta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+", conta "+conta.getNumero()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque.");

    }
}
