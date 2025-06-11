package Lista2.Exer3;

public class CamaroteInferior extends Vip{
    private String localizacao = "Camarote Inferior";

    public String getLocalizacao(){
        return localizacao;
    }

    public void ImprimeValor(){
        Vip valor_vip = new Vip();
        System.out.println("Ingresso VIP: R$ "+(valor_vip.getValorAdicional()+super.getValor()));
        System.out.println("Localização: "+ localizacao);
    }
}
