public class GiocaNumeri {
    public static void main(String[] args){
        //1) presentazione del thread main
        System.out.println("INIZIA");
        //2) istanza dei giocatori
        GestoreGioco gg= new GestoreGioco();
        Giocatore g1 = new Giocatore("marco ", gg);
        Giocatore g2 = new Giocatore("mario ", gg);
        g1.start();
        g2.start();
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.err.println("errore");
        }
        //3) fine gioco
        System.out.println("FINE GIOCO!!!");
    }
}


