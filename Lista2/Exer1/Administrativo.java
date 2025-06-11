package Lista2.Exer1;

public class Administrativo extends Assistente {
    private final String turno; // "dia" ou "noite"
    private final double adicionalNoturno;

    public Administrativo(String nome, String cpf, String telefone, double salario, int idade, int matricula, String turno, double adicionalNoturno) {
        super(nome, cpf, telefone, salario, idade, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if (turno.equalsIgnoreCase("noite")) {
            System.out.println("Adicional noturno: R$" + adicionalNoturno);
            System.out.println("Salário total: R$" + (getSalario() + adicionalNoturno));
        } else {
            System.out.println("Salário total: R$" + getSalario());
        }
    }
}




