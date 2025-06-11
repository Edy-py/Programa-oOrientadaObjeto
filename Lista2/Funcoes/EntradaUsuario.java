package Lista2.Funcoes;

import java.util.Scanner;

public class EntradaUsuario {
    public Scanner sc = new Scanner(System.in);
    String texto;


    public EntradaUsuario(String texto) {
        this.texto = texto;
    }



    public int LerIdade(){
        System.out.println(texto);
        return sc.nextInt();
    }
    public int LerMes(){
        System.out.println(texto);
        return sc.nextInt();
    }
    public int LerDia(){
        System.out.println(texto);
        return sc.nextInt();
    }
    public String LerString(){
        System.out.println(texto);
        return sc.nextLine();
    }

    public float lerFloat(){
        System.out.println(texto);
        return sc.nextFloat();
    }
    public int lerInt(){
        System.out.println(texto);
        return sc.nextInt();
    }
    public double lerDouble(){
        System.out.print(texto);
        return sc.nextDouble();
    }

    public double FormatarNumero(double num){

        return Math.round(num*100.0)/100.0; // Força o arredondamento para duas casas decimais
    }


}