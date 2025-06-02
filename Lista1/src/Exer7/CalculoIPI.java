package Lista1.src.Exer7;

public class CalculoIPI {
    // ((pc1 * qta1) + (pc2 * qta2)) * (IPI/100)
    public float CalcularIPI(float pc1, float pc2, int qta1,int qta2,float IPI) {
        return ((pc1 * qta1) + (pc2 * qta2)) * (IPI/100);
    }

    public void Imprimir(float pc1, float pc2, int qta1,int qta2,float IPI,double resultado,String cod1,String cod2) {
        System.out.println("|Codigo da peça: " + cod1 + "| Valor Unitario: " + pc1 + "| quantidade: " + qta1 + "\n|Codigo da peça: " + cod2 + "| Valor Unitario: " + pc2 + "| quantidade: " + qta2 +  "\nIPI: " + IPI + "% Resultado do calculo: R$" + resultado);
        System.out.println();
    }
}
