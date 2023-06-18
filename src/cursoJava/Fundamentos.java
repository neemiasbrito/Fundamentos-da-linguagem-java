package cursoJava;

import java.util.Scanner;

public class Fundamentos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "Neemias Brito";
        String nome2;
        nome2 = "Hadassa Carolinny";
        int idade = 50;
        char sexo = 'M';
        double temperatura = 26.7;
        boolean arCondicionado = false;
        System.out.println("Uso de variáveis na linguagem Java");
        System.out.println("Exemplos");
        System.out.println("primeiros nomes " + nome);
        System.out.println("Segundo nome " + nome2);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Arcondicionado: " + arCondicionado);
        System.out.println("------------------------------------");
        System.out.println();
        double i = 10;
        System.out.println("Operador Aritméticos");
        System.out.println("Exemplos");
        System.out.println("i = " + i);
        System.out.println("i = " + i + " + 5 | i = " + (i + 5));
        System.out.println("i = " + i + " - 5 | i = " + (i - 5));
        System.out.println("i = " + i + " * 5 | i = " + (i * 5));
        System.out.println("i = " + i + " / 5 | i = " + (i / 5));
        System.out.println("i = " + i + " % 5 | i = " + (i % 5)); // % fala mod exemplo 10  mod 5 resto 0
        double y = 10;
        System.out.println("Atriuições");
        System.out.println("Exemplos");
        System.out.println("y = " + y);
        System.out.println("y += 5       | y = " + (y += 5));
        System.out.println("y -= 5       | y = " + (y -= 5));
        System.out.println("y *= 5       | y = " + (y *= 5));
        System.out.println("y /= 5       | y = " + (y /= 5));
        y++; // soma mais 1 a variável
        System.out.println("y++          | y = " + y);
        y--; // subtrair 1 da variável
        System.out.println("y--          | y = " + y);
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println("Estruturas de controle");
        System.out.println("");
        System.out.println("Estruturas de controle condicional");
        System.out.println("");
        System.out.println("Exemplos");
        System.out.println("Exemplos 1 - uso do 'if' ");
        idade = 18;
        System.out.println("idade: " + idade);
        if (idade == 18){
            System.out.println("Alistamentos militar obrigatório");
        }
        System.out.println("");
        System.out.println("Exemplos 2 - Uso do 'if - else'");
        if (idade < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
        System.out.println("");
        idade = 65;
        System.out.println("idade: " + idade);
        System.out.println("Exemplos 3 - Uso do 'else - if'");
        if (idade < 16){
            System.out.println("proibito votar");
        } else if (idade >= 18 && idade <= 70){
            System.out.println("voto obrigatório");
        } else {   // else if (idade == 16 || idade == 17 || idade > 70){
            System.out.println("voto facultativo");
        }
        System.out.println("");
        System.out.println("Exemplos 4 - Uso do 'switch'");
        System.out.println("1. Cadastro de Cliente");
        System.out.println("2. Cadastro de usuários");
        System.out.println("3. Relatórios");
        System.out.println("digite o numero da opção");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("cliente");
                break;
            case 2:
                System.out.println("usuários");
                break;
            case 3:
                System.out.println("relatórios");
                break;
            default:
                System.out.println("opção inválida");
        }
        System.out.println("");
        System.out.println("Estruturas de Repetições");
        System.out.println("");
        System.out.println("Exemplo 5 - Uso do 'for' ");
        for (int j = 10; j > 0; j--) { // j recebi valor 10. o valor 10 é maior que 0? sim
            System.out.println(j);
        }
        System.out.println("");
        System.out.println("Exemplo 6 - Tabuada");
        for (int tabuada = 0; tabuada <= 10; tabuada++) { // tabuada iniciar em 0 e tem uma condição e mas um incremento
            System.out.println("");
            for (int valor = 0; valor <= 10; valor++) {
                System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
            }
        }

        System.out.println("");
        System.out.println("Exemplos 7 - us da estrutura while");
        int contador = 1;
        while (contador <= 10) { // contador de 1 a 10
            System.out.println(contador);
            contador++;
        }
        System.out.println("");
        System.out.println("Exemplo - 8 uso da estrutura 'do while' ");
        char novoJogo;
        do {
            System.out.println("Deseja jogar novamente (s/n)?");
            novoJogo = 'n'; // novoJgo recebe a atribuição de (n)
        } while (novoJogo == 's'); // novoJogo
        System.out.println("GAME OVER");

    }
}
