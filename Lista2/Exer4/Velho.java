package Lista2.Exer4;

public class Velho extends Imovel{
    private double desconto = 200000.00;

    public void Imprimir(){
        System.out.println("Estado do imóvel: Velho");
        System.out.println("Valor: R$ " + (super.getPreco() - desconto));
        System.out.println("Endereço: " + super.getEndereco());

    }
}
