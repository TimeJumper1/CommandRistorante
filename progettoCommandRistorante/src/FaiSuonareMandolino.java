//concrete Command class
public class FaiSuonareMandolino implements  Command{
    //evoca l'ogetto cuoco
    Cuoco cuoco;
    public FaiSuonareMandolino(Cuoco cuoco){
        this.cuoco = cuoco;
    }
    public void execute(){
        cuoco.suonaMandolino();
    }
}
