package Teachable;

public class Funcionarios {
    public String nome;
    public int idade;
    public String cargo;
    public Boolean ativo;
    public double salario;

    public Funcionarios (String nome,int idade, String cargo, Boolean ativo, double salario){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = ativo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    public void demitir () {
        if (getAtivo()==true){
            setAtivo(false);
            System.out.println("O/A funcionario(a) " + nome + " foi demitido(a)");

        }
        else{
            System.out.println("ERRO! O/A funcionário(a)" + nome + "já está inativo(a)");
        }
    }
    public void promover (String cargo) {
        if (getCargo() != cargo){
        System.out.println("O/A funcionario(a) " + nome + " foi promovido para " + cargo);}
        else {
            System.out.println("ERRO! O funcionario(a) já exerce este cargo");
        }
    }

    public void aniversariar() {
        getIdade();
        setIdade(getIdade() +1);
        System.out.println("O/A funcionario(a) " + nome + " está de aniversário, hoje completando " + idade + " anos");
    }
    public void pagarSalario () {
        System.out.println("O/A funcionario(a) " + nome + " recebeu seu salário de R$ " + salario);
    }
}
