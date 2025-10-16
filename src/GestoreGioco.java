public class GestoreGioco {
    int NumeroVincente;

    public GestoreGioco(){
       NumeroVincente=96;
    }
    public void verifica(int num){
        if(num == NumeroVincente){
            System.out.println("Hai Vinto");
        }
        else{
            System.out.println("Hai fallito");
        }
    }
}
