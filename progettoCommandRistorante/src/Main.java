public class Main {
    public static void main(String[] args) {
        // istanzio cuoco e barista e cameriere
        Cuoco cuocoPeppe = new Cuoco();
        Barista baristaPippo = new Barista();
        Cameriere gino = new Cameriere();
        //faccio partire i concrete Command
        Command carbonara = new faiPrepararePasta(cuocoPeppe);
        Command capricciosa = new faiPrepararePizza(cuocoPeppe);
        Command OsoleMio = new FaiSuonareMandolino(cuocoPeppe);

        Command patatine = new FaiPreparareSnack(baristaPippo);
        Command longIsland = new FaiPreparareCoktail(baristaPippo);
        Command happyHour = new FaiPreparareAperitivo(baristaPippo);
        // faccio partire effettivamente i comandi
        gino.setComanda(carbonara);
        gino.inviaOrdine();
        gino.setComanda(capricciosa);
        gino.inviaOrdine();
        gino.setComanda(OsoleMio);
        gino.inviaOrdine();
        gino.setComanda(patatine);
        gino.inviaOrdine();
        gino.setComanda(longIsland);
        gino.inviaOrdine();
        gino.setComanda(happyHour);
        gino.inviaOrdine();
    }
}