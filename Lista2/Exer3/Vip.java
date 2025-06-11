package Lista2.Exer3;

public class Vip extends Ingresso{
    private double ValorAdicional = 50.00;

    public double getValorAdicional() {
        return ValorAdicional;
    }

    public void ImprimeValor(){
        System.out.println("Ingresso VIP: R$ " +(super.getValor()+ValorAdicional));
    }
}
