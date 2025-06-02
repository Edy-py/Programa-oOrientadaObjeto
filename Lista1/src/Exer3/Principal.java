package Lista1.src.Exer3;

import Funcoes.Cabessalho;
import Funcoes.EntradaUsuario;
import Lista1.src.Exer3.Calculos;

public class Principal {
    public static void main(String[] args) {
        int anos, meses, dias;

        //Impressao do cabessalho
        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 3","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada = new EntradaUsuario("Digite quantos anos de vida vc tem: ");
        System.out.println("******************************\n*  Calculo de dias de vida   *\n******************************");
        anos = entrada.LerIdade();
        EntradaUsuario entrada2 = new EntradaUsuario("Digite quantos meses de vida vc tem: ");
        meses = entrada2.LerMes();
        EntradaUsuario entrada3 = new EntradaUsuario("Digite quantos dias de vida vc tem: ");
        dias = entrada3.LerDia();

        Calculos calculos = new Calculos();
        calculos.CalcularMostrar(anos, meses, dias);
    }
}
