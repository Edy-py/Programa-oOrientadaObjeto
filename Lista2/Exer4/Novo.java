package Lista2.Exer4;

public class Novo extends Imovel{
    private double acrescimo = 200000.00;

    public void Imprimir(){
        System.out.println("Estado do imóvel: Novo");
        System.out.println("Valor: R$ " + (super.getPreco() + acrescimo));
        System.out.println("Endereço: " + super.getEndereco());

    }
}
