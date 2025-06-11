package Lista1.src.Exer8;

import Lista2.Funcoes.Cabessalho;
import Lista2.Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 8","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada = new EntradaUsuario("Digite o valor do seu salario: R$");
        double salario = entrada.lerDouble();
        salario = entrada.FormatarNumero(salario);

        Salario quatidadedeSalario = new Salario();

        System.out.println("Esse valor equivale a "+ entrada.FormatarNumero(quatidadedeSalario.calcularSalario(salario)));
    }
}
