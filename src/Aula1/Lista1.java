package Aula1;

import java.util.Scanner;

public class Lista1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("OLA MEU CHAPA");

        int [] numeros = new int [5];
        numeros[4] = 40;

        System.out.println("Na posição 4 temos o elemento " + numeros [4]);

        int [] numeros2 = {10, 20, 30, 40, 50};
        int nota = 0;

        for(int contador = 0; contador < numeros2.length; contador++) {
            System.out.println("O numero na posição " + (contador +1) +  " é " + numeros2[contador]);
        }

        char[] gabarito = {'a', 'b', 'c', 'd', 'a'};
        char[] respostas = new char[5];

        for(int questao = 0; questao < gabarito.length; questao++) {
             System.out.println("Digite a resposta da pergunta" + (questao+1));
             respostas[questao] = leitor.next().charAt(0);

             }

        for (int pos = 0; pos < respostas.length; pos++){
            if (gabarito [pos] == respostas [pos]){
                nota++;
            }
        }
        System.out.println("Voce acertou " + nota + " perguntas");

        String[] palavras = {"casa","papel","mercado","cachorro","gato"};
        for (String elemento:palavras){
            System.out.println(elemento);
        }

    }}

