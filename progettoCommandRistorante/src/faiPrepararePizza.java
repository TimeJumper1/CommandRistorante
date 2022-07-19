// concreteCommand class
public class faiPrepararePizza implements  Command{
    //evoca l'ogetto cuoco
    Cuoco cuoco;
    public faiPrepararePizza(Cuoco cuoco){
        this.cuoco = cuoco;
    }
    public void execute(){
        cuoco.preparaPizza();
    }
}
