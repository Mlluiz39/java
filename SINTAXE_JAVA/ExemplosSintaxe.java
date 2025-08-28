package SINTAXE_JAVA;

public class ExemplosSintaxe {
    public static void main(String[] args) {

      // 1. impressão de dados
      System.out.println("Podemos imprimir texto e números também: " + 12345);

      // 2. Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'o';
        //concatenação de char com String resulta em String
        String texto = caractere + "la, Mundo!";
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(texto);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        //3. Operadores Aritméticos
        int soma = 5 + 3;
        int subtracao = 5 - 3;
        int multiplicacao = 5 * 3;
        int divisao = 5 / 3;
        int modulo = 5 % 3;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo); 
        // Quando precisar de precisão usmos double ou float
        double c = 10;
        double e = 3;
        System.out.println(c / e);
        
        // Incremento e Decremento
        int numero = 5;
        numero++; // Incrementa 1
        System.out.println("Incremento: " + numero);
        numero--; // Decrementa 1
        numero--; // Decrementa 1
        System.out.println("Decremento: " + numero);

        //4. Operadores Compostos
        int valor = 10;
        valor += 5; // valor = valor + 5
        System.out.println("Valor após += 5: " + valor);
        valor -= 3; // valor = valor - 3
        System.out.println("Valor após -= 3: " + valor);
        valor *= 2; // valor = valor * 2
        System.out.println("Valor após *= 2: " + valor);
        valor /= 4; // valor = valor / 4
        System.out.println("Valor após /= 4: " + valor);
        valor %= 3; // valor = valor % 3
        System.out.println("Valor após %= 3: " + valor);  
    }
}
