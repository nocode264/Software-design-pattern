public class AvionFactory extends VehiculeFactory {
    @Override
        public Vehicule creerVehicule() {
            return new Avion();
        }
    
}
