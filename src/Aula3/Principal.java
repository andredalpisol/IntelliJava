package Aula3;

public class Principal {
    public static void main(String[] args) {
        Animal a1 = new Animal("dale", "pudle", 15, "cachorro");
        Animal a2 = new Animal("biel", "viralata", 24, "jumento");

        System.out.println("Nome do animal é " + a1.getNome());
        System.out.println("Nome do animal é " + a2.getNome());
        a1.setIdade(-5);
        System.out.println("Idade do animal é " + a1.getIdade());
        a1.vacinar();
        a2.vacinar();
    }
}
