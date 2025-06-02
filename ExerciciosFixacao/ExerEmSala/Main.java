package ExerciciosFixacao.ExerEmSala;

public class Main {
    public static void main(String[] args) {

        Funcoes.Cabessalho cabessalho = new Funcoes.Cabessalho("Programação Orientada a Objetos","02/06/2025","Atividade em sala","Marcio Dias");
        cabessalho.imprimir();

        Aluno aluno = new Aluno();
        aluno.setNome("Edilson");
        aluno.setAno(2025);
        aluno.setMatricula(1234);
        aluno.setIdade(19);

        Curso curso = new Curso();
        curso.setDepto("IBIOTEC");
        curso.setNome("Ciencia da Computação");
        curso.setSigla("CC");

        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Idade: "+aluno.getIdade());
        System.out.println("Ano: "+aluno.getAno());
        System.out.println("Matrícula: "+aluno.getMatricula());
        System.out.println();
        System.out.println("Nome do Curso: "+curso.getNome());
        System.out.println("Sigla do Curso: "+curso.getSigla());
        System.out.println("Departamento: "+curso.getDepto());


    }
}