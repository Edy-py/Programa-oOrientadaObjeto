package Lista2.Exer1;

import Lista2.Funcoes.EntradaUsuario;

public class Gerente extends Funcionario {
    protected String senha = "AAPERA@#";

    private String getSenha(){
        return senha;
    }

    public Gerente(String nome, String cpf,String telefone, double salario,int idade){
        super(nome,cpf,telefone,salario,idade);
    }

    private void exibirDados() {
        System.out.println("\n===== Gerente =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Senha: " + getSenha());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario: " + getSalario());
        System.out.println("Idade: " + getIdade());
    }

    public void verificarSenha() {

        EntradaUsuario entradaSenha = new EntradaUsuario("Digite sua senha de gerente");
        if(entradaSenha.LerString().equals(getSenha())){
            System.out.println("Senha correta!");
            exibirDados();
        }
        else {
            System.out.println("Senha incorreta!");
            System.exit(0);
        }
    }
}
