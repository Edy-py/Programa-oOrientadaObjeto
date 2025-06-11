package Lista2.Exer2;

public class Animal {
    private String nome,raca;

    public Animal(){
        this.nome = "";
        this.raca = "";
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public String caminha(){
        return "O animal está caminhando... ";
    }

    public void FazerBarulho(){
        System.out.println("O animal está fazendo Barulho...");
    }
}
