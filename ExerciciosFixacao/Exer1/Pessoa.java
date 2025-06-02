/**
 *
 * @author edilson alves da silva
 */
package ExerciciosFixacao.Exer1;

public class Pessoa {
//atributos
    String nome, sexo, telefone;
    int idade;
    
    // construtor
    Pessoa(String nome, String sexo, String telefone, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
    }
    // método para imprimir informações do objeto pessoa
    void mostrar_pessoa_concatenada(Pessoa pessoa){
        System.out.println("Nome: "+pessoa.nome+"\nSexo: "+pessoa.sexo+"\nTelefone: "+pessoa.telefone+"\nIdade: "+pessoa.idade);
    }
}



