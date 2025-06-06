package ExerEmSala5_6_2025;

public class Apartamentos extends Imoveis {
    private Comodos comodos;
    private String temGaragem;
    private int qtdAndar, qtdAptosPorAndar;

    public Apartamentos(Tipos tipo, String tamanho) {
        super(tipo, tamanho);
    }

    public Comodos getComodos() {
        return comodos;
    }
    public void setComodos(Comodos comodos) {
        this.comodos = comodos;
    }
    public String getTemGaragem() {
        return temGaragem;
    }
    public void setTemGaragem(String temGaragem) {
        this.temGaragem = temGaragem;
    }
    public int getQtdAndar() {
        return qtdAndar;
    }
    public void setQtdAndar(int qtdAndar) {
        this.qtdAndar = qtdAndar;
    }
    public int getQtdAptosPorAndar() {
        return qtdAptosPorAndar;
    }
    public void setQtdAptosPorAndar(int qtdAptosPorAndar) {
        this.qtdAptosPorAndar = qtdAptosPorAndar;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tem garagem: " + getTemGaragem());
        System.out.println("Andar: " + getQtdAndar());
        System.out.println("Aptos por andar: " + getQtdAptosPorAndar());
        System.out.println("Cômodos: " + getComodos().nome + " - " + getComodos().quantidade);
        System.out.println("-----------------------------");
    }

}
