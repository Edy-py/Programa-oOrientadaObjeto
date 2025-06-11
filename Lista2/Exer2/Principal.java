package Lista2.Exer2;

import Lista2.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programação Orientada a Objetos", "07/06/2025", "Lista 2 - POO","Márcio Dias");
        cabessalho.imprimir();

        // super class Animal

        // class Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Totó");
        cachorro.setRaca("Pastor Alemão");

        //class Gato
        Gato gato = new Gato();
        gato.setNome("Sebastião");
        gato.setRaca("Siamês");

        System.out.println();

        // Teste dos métodos
            // class Cachorro
        cachorro.FazerBarulho();
        System.out.println(cachorro.caminha());

        System.out.println();

            // class gato
        gato.FazerBarulho();
        System.out.println(gato.caminha());


        System.out.println();
        System.out.println();

        // super class Pessoa

        // class Pobre

    }

}
