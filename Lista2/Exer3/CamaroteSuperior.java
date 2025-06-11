package Lista2.Exer3;

public class CamaroteSuperior extends Vip{
    private String localizacao = "Camarote Superior";
    private double Valor_add = 50.00;

    public void ImprimeValor(){
        Vip valor_vip = new Vip();
        System.out.println("Ingresso VIP: R$ " + (super.getValor()+valor_vip.getValorAdicional() + Valor_add));
        System.out.println("Localização: "+ localizacao);
    }

}
