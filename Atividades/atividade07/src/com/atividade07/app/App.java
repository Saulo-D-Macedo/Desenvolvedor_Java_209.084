package com.atividade07.app;

import java.util.Scanner;
import com.atividade07.models.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        
        System.out.println("Bem - Vindo ao Roubank");
        System.out.println();
        
        System.out.println("Você deseja se cadastrar como:");
        System.out.println("1 - PESSOA FÍSICA");
        System.out.println("2 - PESSOA JURÍDICA");
        System.out.print("Opção: ");
        
        int tipoPessoa = sc.nextInt();
        sc.nextLine();
        
        if (tipoPessoa == 1) {
            System.out.println();
            System.out.println("--- CADASTRO PESSOA FÍSICA ---");
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            
            System.out.print("Número da Agência: ");
            String agencia = sc.nextLine();
            
            System.out.print("Número da Conta: ");
            String numConta = sc.nextLine();
            
            PessoaFisica pf = new PessoaFisica(nome, cpf, email);
            conta = new ContaPF(agencia, numConta, 0.0, pf);
            
            System.out.println();
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            
        } else if (tipoPessoa == 2) {
            System.out.println();
            System.out.println("--- CADASTRO PESSOA JURÍDICA ---");
            
            System.out.print("Razão Social: ");
            String razaoSocial = sc.nextLine();
            
            System.out.print("Nome Fantasia: ");
            String nomeFantasia = sc.nextLine();
            
            System.out.print("CNPJ: ");
            String cnpj = sc.nextLine();
            
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            
            System.out.print("Número da Agência: ");
            String agencia = sc.nextLine();
            
            System.out.print("Número da Conta: ");
            String numConta = sc.nextLine();
            
            PessoaJuridica pj = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj, email);
            conta = new ContaPJ(agencia, numConta, 0.0, pj);
            
            System.out.println();
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            
        } else {
            System.out.println("Opção inválida! Encerrando programa...");
            sc.close();
            return;
        }
        
        int opcao;
        do {
            System.out.println();
            System.out.println(" -----Opções do Roubank-------");
            System.out.println("1 - Consultar Dados");
            System.out.println("2 - Fazer Depósito");
            System.out.println("3 - Fazer Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    conta.exibirDados();
                    break;
                    
                case 2:
                    System.out.print("Valor para depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.fazerDeposito(valorDeposito);
                    System.out.println("Depósito realizado! Novo saldo: R$ " + String.format("%.2f", conta.getSaldo()));
                    break;
                    
                case 3:
                    System.out.print("Valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.fazerSaque(valorSaque);
                    break;
                    
                case 4:
                    System.out.println("Obrigado por usar o Banco Java! Até logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 4);
        
        sc.close();
    }
}