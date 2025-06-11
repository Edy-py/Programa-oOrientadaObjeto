package Lista2.Exer1;

import Lista2.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Programação Orientada a Objetos", "07/06/2025", "Lista 2 - POO","Márcio Dias");
        cabessalho.imprimir();

        Gerente gerente = new Gerente("Edilson","111.111.111-11","9 9999-9999",20000.0,19);
        Tecnicos tecnico = new Tecnicos("João", "123.456.789-00", "99999-0000", 3000.0, 25, 101, 500.0);
        Administrativo admin = new Administrativo("Maria", "987.654.321-00", "88888-1111", 2800.0, 30, 102, "noite", 300.0);

        System.out.println("===== Técnico =====");
        tecnico.exibeDados();

        System.out.println("\n===== Administrativo =====");
        admin.exibeDados();

        System.out.println("\n===== Verificar Senha =====");
        gerente.verificarSenha();

    }
}
