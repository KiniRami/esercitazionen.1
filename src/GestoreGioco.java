import java.util.Random;

public class GestoreGioco {
    int NumeroVincente;

    public GestoreGioco() {
        Random rnd = new Random();
        NumeroVincente = rnd.nextInt(50) + 1; 
    }

    public void verifica(int num) {
        if (num == NumeroVincente) {
            System.out.println("Hai Vinto");
        } else {
            System.out.println("Hai fallito");
        }
    }
}
