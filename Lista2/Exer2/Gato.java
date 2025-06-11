package Lista2.Exer2;

public class Gato extends Animal {

    public String mia(){
        return "está miando -> MIAU";
    }

    public void FazerBarulho(){
        System.out.println("O gato "+getNome()+" da raça "+getRaca()+" "+mia());
    }

    public String caminha(){
        return "O gato "+getNome()+" está caminhando... ";
    }
}
