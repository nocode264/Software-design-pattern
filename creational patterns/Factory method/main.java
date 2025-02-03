import java.lang.invoke.VarHandle;

public static void main(String[] args) {
    VehiculeFactory vehicule = new VoitureFActory();
    vehicule.creerVehicule().type();

    VehiculeFactory vehicule2 = new MotoFactory();
    vehicule2.creerVehicule().type();

    VehiculeFactory vehicule3 = new AvionFactory();
    vehicule3.creerVehicule().type();

}