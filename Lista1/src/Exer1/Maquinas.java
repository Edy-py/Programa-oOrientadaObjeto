package Exer1;

public class Maquinas {
    String computador, calculadora;
    public Maquinas(String computador, String calculadora) {
        this.computador = computador;
        this.calculadora = calculadora;
    }
    public void imprimir() {
        System.out.println("Computador: " + computador);
        System.out.println("Calculadora: " + calculadora);
    }

}
