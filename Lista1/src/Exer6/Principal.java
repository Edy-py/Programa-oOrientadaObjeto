package Lista1.src.Exer6;


import Funcoes.Cabessalho;
import Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 6","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada = new EntradaUsuario("Digite seu saldo: \nR$ ");
        double saldo = entrada.lerDouble();

        Reajuste reajuste = new Reajuste();
        double saldoReajustado = reajuste.reajustarSaldo(saldo);

        System.out.println("Seu saldo foi reajustado em uma taxa de 1% ");
        System.out.println("Saldo atual: " + entrada.FormatarNumero(saldo) + "\nSaldo reajustado: " + entrada.FormatarNumero(saldoReajustado));
    }
}
