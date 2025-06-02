/**
 *
 * @author edilson alves da silva
 */
package ExerciciosFixacao.Exer1;

public class Principal {
    public static void main(String[] args){

        Funcoes.Cabessalho cabessalho = new Funcoes.Cabessalho("Programação Orientada a Objetos","02/06/2025","Atividade em sala","Marcio Dias");
        cabessalho.imprimir();

        Pessoa pessoa = new Pessoa("Edilson","masculino","61 9 8190-7933",19);
        pessoa.mostrar_pessoa_concatenada(pessoa);
        System.out.println();
        Pessoa pessoa2 = new Pessoa("pessoa 2","Masculino","61 9 7890-5412",20);
        pessoa2.mostrar_pessoa_concatenada(pessoa2);
        System.out.println();
        Pessoa pessoa3 = new Pessoa("pessoa 3","Feiminino","61 9 8890-5412",21);
        pessoa3.mostrar_pessoa_concatenada(pessoa3);

    }
}
