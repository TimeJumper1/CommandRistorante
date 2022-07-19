// classe concreta Command
public class FaiPreparareAperitivo implements  Command{
    //evoca l'oggetto barista
    Barista barista;
    public FaiPreparareAperitivo(Barista barista){
        this.barista = barista;
    }
    public void execute(){
        barista.preparaSnack();
        barista.preparacoktail();
    }
}
