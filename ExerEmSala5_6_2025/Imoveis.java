package ExerEmSala5_6_2025;

public class Imoveis {
    private String codigo;
    String localidade;
    private Proprietario proprietario;
    Tipos tipo;
    String tamanho;
    private double valor;
    private Situacao situacao = Situacao.A_VENDA;  // Começa como À VENDA

    // Métodos para manipular a situação
    public void reservar(String codigo) {
        if (situacao == Situacao.A_VENDA) {
            situacao = Situacao.RESERVADO;
        } else {
            System.out.println("Imóvel não pode ser reservado. Situação atual: " + situacao);
        }
    }

    public void vender(String codigo) {
        if (situacao == Situacao.RESERVADO) {
            situacao = Situacao.VENDIDO;
        } else {
            System.out.println("Imóvel deve estar reservado para ser vendido.");
        }
    }

    public void cancelarReserva(String codigo) {
        if (situacao == Situacao.RESERVADO) {
            situacao = Situacao.A_VENDA;
        } else {
            System.out.println("Não é possível cancelar, pois o imóvel não está reservado.");
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Imoveis(Tipos tipo,String tamanho){
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void imprimirDados() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Área: " + getArea());
        System.out.println("Localidade: "+getLocalidade());
        System.out.println("Valor: " + getValor());
        System.out.println("Situação: " + getSituacao());
        System.out.println("Proprietário: " + getProprietario().getNome());
    }

    private String getArea() {
        return this.tamanho;
    }

    private Tipos getTipo() {
        return this.tipo;
    }

}