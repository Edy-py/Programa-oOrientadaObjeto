package Lista1.src.Exer7;

import Lista2.Funcoes.Cabessalho;
import Lista2.Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programacao Orientada a Objeto","21/05/2025","Lista 1: Atividade 8","Marcio");
        cabessalho.imprimir();

        EntradaUsuario entrada_preco = new EntradaUsuario("Preço unitário da peça: ");
        EntradaUsuario entrada_quantidade = new EntradaUsuario("Quantidade de peça: ");
        EntradaUsuario entrada_codigo = new EntradaUsuario("Codigo da peça: ");
        EntradaUsuario entradaIPI = new EntradaUsuario("Valor do IPI: ");

        float preco1,preco2;
        int quantidade1,quantidade2,IPI;
        String codigo1,codigo2;

        System.out.println("Peça 1:");
        preco1 = entrada_preco.lerFloat();
        quantidade1 = entrada_quantidade.lerInt();
        codigo1 = entrada_codigo.LerString();

        System.out.println("Peça 2:");
        preco2 = entrada_preco.lerFloat();
        quantidade2 = entrada_quantidade.lerInt();
        codigo2 = entrada_codigo.LerString();

        IPI = entradaIPI.lerInt();

        CalculoIPI calculoIPI = new CalculoIPI();

        float result = calculoIPI.CalcularIPI(preco1,preco2,quantidade1,quantidade2,IPI);
        double result_formatado = entrada_preco.FormatarNumero(result);

        calculoIPI.Imprimir(preco1,preco2,quantidade1,quantidade2,IPI,result_formatado,codigo1,codigo2);

    }
}
