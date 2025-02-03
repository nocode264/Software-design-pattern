public class SucreeFactory implements AbstractFactory {
    public Boisson createBoisson() {
        return new BoissonSucree();
    }
    public Aliment createAliment() {
        return new AlimentSucre();
    }
}
