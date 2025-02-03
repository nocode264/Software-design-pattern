public static void main(String[] args) {
    AbstractFactory factory1 = new SaleeFactory();
    AbstractFactory factory2 = new SucreeFactory();

    Aliment produit1 = factory1.createAliment();

    produit1.getDescription();

}