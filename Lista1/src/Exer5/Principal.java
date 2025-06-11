package Lista1.src.Exer5;

import Lista2.Funcoes.Cabessalho;
import Lista2.Funcoes.EntradaUsuario;


public class Principal {
    public static void main(String[] args) {
        int a,b;

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 5","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada = new EntradaUsuario("Digite um numro inteiro entre 0 e 1000: ");
        a = entrada.lerInt();
        b = entrada.lerInt();

        MaiorValor descobrir = new MaiorValor();
        int maior = descobrir.maioralor(a, b);

        System.out.println("O maior valor digitado foi "+maior);
    }
}
