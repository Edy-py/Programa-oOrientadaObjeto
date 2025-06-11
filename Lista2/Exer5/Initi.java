package Lista2.Exer5;

import Lista2.Exer1.*;
import Lista2.Exer2.*;
import Lista2.Exer3.*;
import Lista2.Exer4.*;
import Lista2.Funcoes.*;


public class Initi {

    public static void cabessalho(){
        Cabessalho cabessalho = new Cabessalho("Programação Orientada a Objeto","11/06/2025","Lista 2 - POO","Márcio Dias");
        cabessalho.imprimir();
    }

    public static void Animais(){

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Totó");
        cachorro.setRaca("Pastor Alemão");
        System.out.println("\n===== Cachorro =====");
        cachorro.FazerBarulho();
        System.out.println();

        Gato gato = new Gato();
        System.out.println("\n===== Gato =====");
        gato.setNome("Sebastião");
        gato.setRaca("Siamês");
        gato.FazerBarulho();
        System.out.println();
    }

    public static void Funcionarios(){
        Tecnicos tecnico = new Tecnicos("João", "123.456.789-00", "99999-0000", 3000.0, 25, 101, 500.0);
        Administrativo admin = new Administrativo("Maria", "987.654.321-00", "88888-1111", 2800.0, 30, 102, "noite", 300.0);

        System.out.println("\n===== Técnico =====");
        tecnico.exibeDados();
        System.out.println("\n===== Administrativo =====");
        admin.exibeDados();
    }

    public static void ClasseSocial(){
        Pobre pobre = new Pobre();
        System.out.print("Pobre: " ); pobre.trabalha();

        Rica rica = new Rica();
        System.out.print("Rica: ");rica.fazCompras();

        Miseravel miseravel = new Miseravel();
        System.out.print("Miserável: ");miseravel.mendiga();
    }

    /*
    * crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se for
VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior.
Imprima o valor do ingresso.
    * */

    public static void VenderIngresso(){

        EntradaUsuario entrada = new EntradaUsuario("Qual ingresso você quer comprar?\n[1] Igresso Normal\n[2] Igresso VIP\n[3] Ingresso Camarote Superior\n[4] Ingresso Camarote Inferior");
        int escolha = entrada.lerInt();

        CamaroteInferior IngressoCamaroteInferior = new CamaroteInferior();
        CamaroteSuperior IngressoCamaroteSuperior = new CamaroteSuperior();
        Normal IngressoNormal = new Normal();
        Vip IngressoVIP = new Vip();

        switch (escolha){

            case 1:
                IngressoNormal.ImprimeValor();
                System.out.println("Ingresso comprado com sucesso!\nAproveite a festa!");
                break;
            case 2:
                IngressoVIP.ImprimeValor();
                System.out.println("Ingresso comprado com sucesso!\nAproveite a festa!");
                break;
            case 3:
                IngressoCamaroteSuperior.ImprimeValor();
                System.out.println("Ingresso comprado com sucesso!\nAproveite a festa!");
                break;
            case 4:
                IngressoCamaroteInferior.ImprimeValor();
                System.out.println("Ingresso comprado com sucesso!\nAproveite a festa!");
                break;
            default:
                System.out.println("Opção inválida!");

        }
    }
    public static void casa(){
        EntradaUsuario entrada = new EntradaUsuario("Qual casa vai comprar?\n[1] Casa nova\n[2] Casa velha");
        int escolha = entrada.lerInt();
        Novo casaNova = new Novo();
        Velho casaVelha = new Velho();

        switch (escolha){
            case 1:
                casaNova.Imprimir();
                System.out.println("Casa nova comprada com sucesso!");
                break;
            case 2:
                casaVelha.Imprimir();
                System.out.println("Casa velha comprada com sucesso!");
                break;
                default:
                    System.out.println("Opção inválida!");
        }


    }
}
