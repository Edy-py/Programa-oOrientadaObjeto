package Lista2.Exer3;

import Lista2.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programação Orientada a Objetos", "10/06/2025","Lista 2 - POO","Márcio Dias");
        cabessalho.imprimir();

        CamaroteInferior IngressoCamaroteInferior = new CamaroteInferior();
        CamaroteSuperior IngressoCamaroteSuperior = new CamaroteSuperior();
        Normal IngressoNormal = new Normal();
        Vip IngressoVIP = new Vip();

        IngressoNormal.ImprimeValor();
        System.out.println();
        IngressoVIP.ImprimeValor();
        System.out.println();
        IngressoCamaroteSuperior.ImprimeValor();
        System.out.println();
        IngressoCamaroteInferior.ImprimeValor();
    }
}
