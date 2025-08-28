package ESTRUTURA_CONTROLE;

import java.util.Scanner;

public class ExemplosControle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If e Else
        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Você foi Aprovado");
        } else if (nota >= 5) {
            System.out.println("Você está de Recuperação");
        } else {
            System.out.println("Você foi Reprovado");
        }

        // Switch
        System.out.println("Digite o dia da semana (ex: Segunda, Terça ...): ");
        String diaSemana = sc.next().toLowerCase();

        switch (diaSemana) {
            case "segunda":
                System.out.println("Hoje é segunda-feira dia de Futebol");
                break;
            case "terça":
                System.out.println("Hoje é terça-feira dia de Basquete");
                break;
            case "quarta":
                System.out.println("Hoje é quarta-feira dia de Vólei");
                break;
            case "quinta":
                System.out.println("Hoje é quinta-feira dia de Natação");
                break;
            case "sexta":
                System.out.println("Hoje é sexta-feira dia de Karate");
                break;
            case "sábado":
            case "sabado":
                System.out.println("Hoje é sábado dia de Cinema");
                break;
            case "domingo":
                System.out.println("Hoje é domingo dia de Descanso");
                break;
            default:
                System.out.println("Este é um dia inválido");
                break;
        }

        // While
        System.out.println("Digite um número  while: ");
        int contador = sc.nextInt();
        int contador2 = 5;
        while (contador <= contador2++) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Do While
        System.out.println("Exemplo Do While:");
        int count = sc.nextInt();
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // For
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // Fecha o Scanner no final do programa
        sc.close();
    }
}
