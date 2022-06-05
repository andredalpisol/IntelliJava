package Aula3;

public class Animal {
    private String nome;
    private String raça;
    private int idade;
    private String especie;

    public Animal(String nome, String raça, int idade, String especie){
    this.nome = nome;
    this.raça = raça;
    this.idade = idade;
    this. especie = especie;
    }

    public void vacinar (){
        System.out.println("O animal " + getNome() + " foi vacinado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Não existe idade menor de 0");}
        else { this.idade = idade;}
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
