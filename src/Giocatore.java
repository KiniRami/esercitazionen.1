import java.util.Scanner;

public class Giocatore extends Thread{
    private String nome;
    private int punteggio;
    GestoreGioco gg;

    public Giocatore(String nome,GestoreGioco gg) {
        this.nome = nome;
        this.punteggio = 0;
        this.gg=gg;
    }
    public void comunica() {
        System.out.println(nome);
    }




    @Override
    public void run(){
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("errore");
        }
        this.comunica();
        this.gioca();

    }

    private void gioca() {
        //choiedere in input un numero (stampa)
        System.out.println("Inserisci il numero: ");

        //leggere il numero (scanner)
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
       // input.close();

        System.out.println("Ho scelto il numero" + num);


        //invocare verifica
        gg.verifica(num);
    }
}


