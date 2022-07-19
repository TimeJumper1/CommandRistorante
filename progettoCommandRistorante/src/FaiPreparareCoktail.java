// classe concreta Command
public class FaiPreparareCoktail implements  Command {
    //evoca l'ogetto barista
    Barista barista;
    public FaiPreparareCoktail(Barista barista){
        this.barista = barista;
    }
    public void execute(){
        barista.preparacoktail();
    }
}
