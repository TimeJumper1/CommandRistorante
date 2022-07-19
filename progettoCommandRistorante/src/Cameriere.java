//invoker
public class Cameriere {
    private Command command;
    public void setComanda(Command command){
        this.command = command;
    }
    public void inviaOrdine(){
        command.execute();
    }
}
