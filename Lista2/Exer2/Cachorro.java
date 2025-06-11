package Lista2.Exer2;

public class Cachorro extends Animal {

    public String late(){
        return "está latindo -> AUAU ";
    }
    public void FazerBarulho(){
        System.out.println("O cachorro "+getNome()+" da raça "+getRaca()+" "+late());
    }

    public String caminha(){
        return "O cachorro "+getNome()+" está caminhando... ";
    }
}
