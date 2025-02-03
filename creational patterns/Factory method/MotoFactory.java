public class MotoFactory extends VehiculeFactory {
    @Override
    public Vehicule creerVehicule(){
        return new moto();
    }
}
