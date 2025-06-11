package Lista2.Exer2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

}
