public abstract class AFuelCar extends ACar {

    private int kmPrLitre; // her kan man indtaste hvor meget ens bil kan køre i liter.
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();


    public int getKmPrLitre(){

        return kmPrLitre;
    }

    @Override
    public String toString(){

        return          super.toString() +
                        " \n Type of Fuel: " + getFuelType() +
                        "\n Km/L: " + kmPrLitre;
    }
}
