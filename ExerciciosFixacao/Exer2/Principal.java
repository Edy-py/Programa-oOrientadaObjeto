package ExerciciosFixacao.Exer2;

public class Principal {
    public static void main(String[] args) {

        Funcoes.Cabessalho cabessalho = new Funcoes.Cabessalho("Programação Orientada a Objetos","02/06/2025","Atividade de Fixação","Marcio Dias");
        cabessalho.imprimir();

        int soma = 0;
        for (int i = 0; i <= 9; i++) {
            GetImpar result = new GetImpar(i);
            if(result.getNum() == 1){
                soma += i;
            }
        }
        System.out.println("Soma impares entre 1 e 9 (Com for) "+soma);

        int contador = 1;
        int somapar = 0;
        while (contador <= 20){
            GetPar result = new GetPar(contador);
            if(result.getNum() == 1){
                somapar += contador;
            }
            contador++;
        }

        System.out.println("Soma pares entre 1 e 20 (Com while): "+somapar);
        int somapar2 = 0;
        for (int i = 0; i <= 20; i++){
            GetPar result = new GetPar(i);
            if(result.getNum() == 1){
                somapar2 += i;
            }
        }
        System.out.println("Soma pares entre 1 e 20 (Com for) "+somapar2);
    }
}
