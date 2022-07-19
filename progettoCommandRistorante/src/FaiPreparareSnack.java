// classe concreta Command
public class FaiPreparareSnack implements Command {
    //evoca l'oggetto barista
    Barista barista;
    public FaiPreparareSnack(Barista barista){
        this.barista = barista;
    }
    public void execute(){
        barista.preparaSnack();
    }
}
