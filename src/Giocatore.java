import java.util.Scanner;

public class Giocatore extends Thread {
    private String nome;
    private int numeroScelto;
    GestoreGioco gg;

    public Giocatore(String nome, GestoreGioco gg) {
        this.nome = nome;
        this.gg = gg;
    }

    public int getNumeroScelto() {
        return numeroScelto;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
      
            System.out.print(nome + ", inserisci il numero (1-50): ");
            Scanner input = new Scanner(System.in);
            numeroScelto = input.nextInt();
        
    }
}


