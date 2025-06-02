package Lista1.src.Exer3;

public class Calculos {
    int DiasAno = 365;
    int DiasMes = 30;

    public void CalcularMostrar(int ano, int mes, int dia){

        int dias = (ano * DiasAno) + (mes * DiasMes) + dia;
        System.out.println("Voce tem "+dias+" dias de vida.");
    }
}
