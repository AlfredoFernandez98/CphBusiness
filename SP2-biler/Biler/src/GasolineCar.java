public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    public String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {

        int fee=0;

        if((super.getKmPrLitre() >= 20) && (super.getKmPrLitre() <= 50)){
            fee=330;
        } else if ((super.getKmPrLitre()>=15) && (super.getKmPrLitre()<=19)) {

            fee=1050;

        } else if ((super.getKmPrLitre() >=10) && (super.getKmPrLitre() <=14)) {

            fee=2340;

        } else if ((super.getKmPrLitre() >=5) && (super.getKmPrLitre() <= 9)) {
            fee=5500;
        } else if  (super.getKmPrLitre()< 5){

           fee=10470;

        }

        return fee;

    }

    @Override
    public String toString() {
        return "\n HERE ARE THE GASOLINE-CARS: "  +
                "\n "+super.toString()+
                "\n TypebrændtStof: "+getFuelType()+
                "\n RegistrationFee: "+ getRegistrationFee()+"kr."+"\n";
    }
}
