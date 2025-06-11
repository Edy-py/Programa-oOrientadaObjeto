package Lista1.src.Exer9;

import Lista2.Funcoes.Cabessalho;
import Lista2.Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","23/05/2025","Lista 1: Atividade 9","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada = new EntradaUsuario("Digite um valor inteiro: ");

        int num = entrada.lerInt();
        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println();
        System.out.println("O valor digitado " + num);
        System.out.println();
        System.out.println("Antecessor do valor digitado = " + antecessor + "\nSucessor do valor digitado = " + sucessor);
    }
}
