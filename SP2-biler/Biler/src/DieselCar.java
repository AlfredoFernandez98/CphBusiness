public class DieselCar extends AFuelCar {

    private boolean particleFilter;


    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre,boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter=particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter(){

        return particleFilter;
    }


    public int getRegistrationFee() {

        int dieselFee=0;

        if (!hasParticleFilter()){

            dieselFee+=1000;

        }

        if((super.getKmPrLitre()>=20) && (super.getKmPrLitre()<=50)){
            dieselFee+=130;
        } else if ((super.getKmPrLitre()>=15)&&(super.getKmPrLitre()<=19)) {

            dieselFee+=1390;
        } else if ((super.getKmPrLitre()>=10)&&(super.getKmPrLitre()<=14)) {
            dieselFee+=1850;

        } else if ((super.getKmPrLitre()>=5)&&(super.getKmPrLitre()<=9)) {
            dieselFee+=2770;

        } else if (super.getKmPrLitre()<5){
            dieselFee+=15260;

        }

        return dieselFee;

    }

    @Override

    public String toString(){

        return
                "\n HERE ARE DIESEL-CARS: "  +
                "\n "+super.toString()+
                "\n Brændtstoftype: "+ getFuelType()+
                "\n har en partikel: "+hasParticleFilter()+
                "\n RegistrationFee: "+ getRegistrationFee()+"kr."+"\n";

    }

}
