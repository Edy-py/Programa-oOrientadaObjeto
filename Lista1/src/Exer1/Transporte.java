package Exer1;

public class Transporte {
    String aviao, motocicleta;
    public Transporte(String aviao, String motocicleta){
        this.aviao = aviao;
        this.motocicleta = motocicleta;
    }
    public void imprimir(){
        System.out.println("Aviao: "+aviao);
        System.out.println("Motocicleta: "+motocicleta);
    }
}
