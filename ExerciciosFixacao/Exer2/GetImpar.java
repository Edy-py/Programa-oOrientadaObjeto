package ExerciciosFixacao.Exer2;

public class GetImpar {
    int num;
    GetImpar(int num) {
        this.num = num;
    }
    int getNum() {
        if(num % 2 != 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}



