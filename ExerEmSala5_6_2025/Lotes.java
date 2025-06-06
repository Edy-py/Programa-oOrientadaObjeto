package ExerEmSala5_6_2025;

public class Lotes extends Imoveis {
    public String cercados, aplainados;

    public Lotes(String cercados, String aplainados, Tipos tipos, String tamanho) {
        super(tipos, tamanho);
        this.cercados = cercados;
        this.aplainados = aplainados;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cercado: " + cercados);
        System.out.println("Aplainado: " + aplainados);
        System.out.println("-----------------------------");
    }
}
