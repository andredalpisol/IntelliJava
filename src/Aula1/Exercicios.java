package Aula1;

public class Exercicios {
    public static void main(String[] args) {
        mensagem("Chama papae");

        for (int i = 150; i <= 300; i++){
            System.out.println(i);
            }

        for (int i = 1; i <= 1000; i++){
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++){
            if (i%3==0){
            System.out.println(i);}
        }
        System.out.println(calc(5));

            }



    public static int calc (int numero1) {
        if (numero1%2==0){
            return numero1/2;}
        else {
            return (3*numero1) + 1;
        }
    }


    public static void mensagem(String msg) {
        System.out.println(msg);
    }}











