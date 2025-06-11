package Lista2.Exer1;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, String cpf, String telefone, double salario, int idade, int matricula) {
        super(nome, cpf, telefone, salario, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Matrícula: " + matricula);
    }
}

