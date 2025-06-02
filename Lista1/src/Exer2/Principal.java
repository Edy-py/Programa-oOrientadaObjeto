package Lista1.src.Exer2;

import Funcoes.Cabessalho;


public class Principal {
    public static void main(String[] args) {

        //Impressao do cabessalho
        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 2","Marcio");
        cabessalho.imprimir();
        // Instanciando os objetos das classes do Exer1
        Exer1.Animais adjetivos = new Exer1.Animais("Grande","Laranja","Forte");
        Exer1.Transporte caracteirsticas = new Exer1.Transporte("Bi-motor","Veloz");
        Exer1.Maquinas funcionalidades = new Exer1.Maquinas("Serve para tudo","Fazer calculos");

        // mostrar os objetos instanciados
       /* caracteirsticas.imprimir();
        System.out.println();
        funcionalidades.imprimir(); //deixei como comentário porque o exercicio não pede, mas eu queria testar
        System.out.println();
        adjetivos.imprimir();
        System.out.println();
        */
    }
}
