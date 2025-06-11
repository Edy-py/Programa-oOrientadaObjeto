package Lista2.Funcoes;

public class Cabessalho {

    String materia,data,titulo,professor;
    String autor = "Edilson Alves Da Silva";
    String faculdade = "Universidade Federal de Catalão";
    String curso = "Ciencia da Computacao 3° periodo";
    int largura = 50;

    // Contrutor para intanciar as variáveis
    public Cabessalho(String materia, String data, String titulo, String professor) {
        this.materia = materia;
        this.data = data;
        this.titulo = titulo;
        this.professor = professor;
    }

    // Função para centralizar texto
    private static String centralizarTexto(String texto, int largura) {
        int espacos = (largura - texto.length()) / 2; // Quantos espaços precisamos colocar antes e depois do texto
        String padding = " ".repeat(Math.max(0, espacos)); // cria uma string com o numero de espaços calculados anteriomente. Math.max(0, espacos) garante que nunca seja negativo
        return padding + texto + padding + (texto.length() % 2 == 0 ? "" : " "); // retorna o texto formatado/centralizado."(texto.length() % 2 == 0 ? "" : " ")" verificação se numero for impar add mais um espaço, caso contrário não muda;
    }
    public void imprimir() {
        System.out.println("╔" + "═".repeat(largura) + "╗"); // .repeat quantidade de vezes que vai ser impresso

        String linhaFaculdade = String.format("║%-" + (largura ) + "s║", centralizarTexto(faculdade, largura - 2));
        System.out.println(linhaFaculdade);

        System.out.println("╠" + "═".repeat(largura) + "╣");

        System.out.printf("║ %-15s: %-32s║\n", "Nome", autor);
        System.out.printf("║ %-15s: %-32s║\n", "Curso", curso);
        System.out.printf("║ %-15s: %-32s║\n", "Data", data);
        System.out.printf("║ %-15s: %-32s║\n", "Título", titulo);
        System.out.printf("║ %-15s: %-32s║\n", "Matéria", materia);
        System.out.printf("║ %-15s: %-32s║\n", "Professor", professor);

        System.out.println("╚" + "═".repeat(largura) + "╝");
        System.out.println();
    }
}

// %-Xs → operador de formatação:
// %      → indica que vem um especificador de formato.
// -      → alinha o texto à esquerda dentro do espaço disponível.
// X      → número de caracteres de espaço que a string vai ocupar.
// s      → significa que será formatado um valor do tipo String.

// Exemplo: "%-10s" → imprime uma String ocupando 10 posições, alinhada à esquerda.


