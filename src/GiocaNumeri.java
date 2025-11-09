public class GiocaNumeri {
    public static void main(String[] args){
        System.out.println("INIZIO GIOCO");

        GestoreGioco gg = new GestoreGioco();
        Giocatore g1 = new Giocatore("Marco", gg);
        Giocatore g2 = new Giocatore("Mario", gg);

        
        g1.start();
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.err.println("Errore nell'attesa dei thread");
        }

        
        System.out.println("\n RISULTATI");
        System.out.print(g1.getNome() + " ha scelto: " + g1.getNumeroScelto() + "  ");
        gg.verifica(g1.getNumeroScelto());

        System.out.print(g2.getNome() + " ha scelto: " + g2.getNumeroScelto() + " ");
        gg.verifica(g2.getNumeroScelto());

        System.out.println("\n=== FINE GIOCO ===");
    }
}
