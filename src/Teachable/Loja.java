package Teachable;

public class Loja {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("José", 25, "Caixa", true, 2.500);
        Funcionarios f2 = new Funcionarios("Vitor", 32, "Atendente", true, 2.500);
        Funcionarios f3 = new Funcionarios("Marcela", 35, "Gerente", true, 4725.25);
        Funcionarios f4 = new Funcionarios("Jorge", 28, "Supervisor", true, 4400.42);

        f1.demitir();
        f2.promover("Gerente");
        f3.aniversariar();
        f4.pagarSalario();

    }

    }

