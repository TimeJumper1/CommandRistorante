//concrete Command class
public class faiPrepararePasta implements  Command{
    //evoca l'ogetto cuoco
    Cuoco cuoco;
    public faiPrepararePasta(Cuoco cuoco){
        this.cuoco = cuoco;
    }
    public void execute(){
        cuoco.preparaPasta();
    }
}
