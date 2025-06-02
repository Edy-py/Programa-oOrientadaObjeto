package Lista1.src.Exer4;

import Funcoes.Cabessalho;
import Funcoes.EntradaUsuario;
import Lista1.src.Exer4.CalculoMedia;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 4","Marcio");
        cabessalho.imprimir();

        float num1,num2,num3;
        EntradaUsuario entrada = new EntradaUsuario("Digite um valor: ");

        System.out.println("*** Numeros para primeira media ***");
        System.out.println();

        num1 = entrada.lerFloat();
        num2 = entrada.lerFloat();
        num3 = entrada.lerFloat();

        CalculoMedia calculo = new CalculoMedia();
        float media = calculo.Calcular3num(num1,num2,num3);

        System.out.println();
        System.out.println("*** Numeros para segunda media ***");
        System.out.println();

        num1 = entrada.lerFloat();
        num2 = entrada.lerFloat();
        num3 = entrada.lerFloat();

        float media2 = calculo.Calcular3num(num1,num2,num3);

        float MediaDaMedia = calculo.Calcular2num(media,media2);

        System.out.println();
        System.out.println("Media 1: " + media + "\nMedia 2: " + media2+ "\nMedia das medias: " + MediaDaMedia);


    }
}