public class VoitureFActory extends VehiculeFactory {
    @Override
    public Vehicule creerVehicule(){
        return new Voiture();
    }
    
}
