package Lista2.Exer1;

public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private int idade;

    public Funcionario(String nome, String cpf, String telefone, double salario, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.println("Salário base: R$" + salario);
    }
}
