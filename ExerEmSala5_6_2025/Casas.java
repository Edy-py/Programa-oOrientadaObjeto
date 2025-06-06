package ExerEmSala5_6_2025;

public class Casas extends Imoveis {
    private String Tempiscina;
    private String Temquintal;
    private Comodos comodos;

    public Casas(Tipos tipo, String tamanho) {
        super(tipo, tamanho);
    }

    public String getTempiscina() {
        return Tempiscina;
    }
    public void setTempiscina(String Tempiscina) {
        this.Tempiscina = Tempiscina;
    }
    public String getTemquintal() {
        return Temquintal;
    }
    public void setTemquintal(String Temquintal) {
        this.Temquintal = Temquintal;
    }
    public Comodos getComodos() {
        return comodos;
    }
    public void setComodos(Comodos comodos) {
        this.comodos = comodos;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tem piscina: " + getTempiscina());
        System.out.println("Tem quintal: " + getTemquintal());
        System.out.println("Cômodos: " + getComodos().nome + " - " + getComodos().quantidade);
        System.out.println("-----------------------------");
    }

}
