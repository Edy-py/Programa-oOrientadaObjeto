package Lista2.Exer1;

public class Tecnicos extends Assistente {
    private double bonusSalarial;

    public Tecnicos(String nome, String cpf, String telefone, double salario, int idade, int matricula, double bonusSalarial) {
        super(nome, cpf, telefone, salario, idade, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Bônus salarial: R$" + bonusSalarial);
        System.out.println("Salário total: R$" + (getSalario() + bonusSalarial));
    }
}
