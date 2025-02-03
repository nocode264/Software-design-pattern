public class SaleeFactory implements AbstractFactory {
    public Boisson createBoisson() {
        return new BoissonSalee();
    }
    public Aliment createAliment() {
        return new AlimentSale();
    }
    
}
