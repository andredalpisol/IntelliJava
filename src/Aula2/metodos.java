package Aula2;

public class metodos {

    public static void main(String[] args) {
        impressao();
        mensagem ("losaodasdlasdosao");
        System.out.println(dobro (15));
        System.out.println(fatorial (6));
        for(int i = 1; i < 11; i++){
            System.out.println("O fatorial de " + i + " é " + fatorial(i));
        }
        mensagem("O resultado é " + calc(2,3));
        mensagem("O resultado é " + calc(2.5,3.3));
        mensagem("O resultado é " + calc(2 , 3, 5));

        double[] notas = {9.5, 5.8, 9, 2.6};
        mensagem("O resultado da média é " + calc(notas));
        System.out.printf("%s%.2f", "A media das notas é: ", calc(notas));
    }

    //metodo sem retorno -void e sem parametros pois nao colocamos nada
    public static void  impressao () {
        System.out.println("Java é lindo");
    }

    public static void  mensagem (String msg) {
        System.out.println(msg);
    }

    public static int dobro (int numero){
        return numero * 2;
    }

    //Calculando um fatorial - multiplica por seus antecessores até chegar em 01//

    public static int fatorial (int numero){
        int fatorial = 1;
        for (int cont = numero; cont > 0; cont --){
            fatorial *=cont;
        }
        return  fatorial;
    }

    //SOBRECARGAS DE MÉTODOS - 2 METODOS QUE FAZEM A MESMA COISA - MESMO NOME, MAS FUNCIONAM JUNTOS PQ UM USA UMA VARIAVEL - INT E OUTRO - DOUBLE

    public static int calc (int numero1, int numero2){
        return numero1 + numero2;
    }

    public static double calc(double numero1, double numero2){
        return numero1+numero2;
    }
    public static int calc(int numero1, int numero2, int numero3){
        return numero1+numero2+numero3;
    }

    public static double calc(double[] numeros){
        double soma = 0;
        for(double n:numeros){
            soma += n;
        }
        return soma/numeros.length;
    }
}
