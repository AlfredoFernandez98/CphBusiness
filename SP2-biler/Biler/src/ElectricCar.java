public  class ElectricCar extends ACar{

    private int batteryCapacity;
    private int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public  int getBatteryCapacityKWh(){


        return batteryCapacity;//100kwh

    }

    public int getMaxRange(){

        return maxRange;//580km

    }

    public int getWhPrKm(){

        return batteryCapacity*1000/maxRange;
    }


    public int getRegistrationFee() {

        int fee=0;
        int kmPrLitre= (int)Math.floor(100/(getWhPrKm()/91.25));

        if((kmPrLitre >= 20) && (kmPrLitre <= 50)){
            fee=330;
        } else if ((kmPrLitre>=15) && (kmPrLitre <=19)) {

            fee=1050;

        } else if ((kmPrLitre >=10) && (kmPrLitre <=14)) {

            fee=2340;

        } else if ((kmPrLitre >=5) && (kmPrLitre <= 9)) {
            fee=5500;
        } else if  (kmPrLitre < 5){

            fee=10470;

        } else if (kmPrLitre>=51) {
            fee = 0;
        }

        return fee;
    }

    @Override

    public String toString(){
        return  "\n HERE ARE THE ELECTRIC-CARS: "  +
                "\n "+super.toString()+
                "\n Batterikapacity: "+ getBatteryCapacityKWh()+
                "\n MaxRange: "+ getMaxRange()+"km"+
                "\n Wh/Km: " + getWhPrKm()+
                "\n Registrationfee: "+ getRegistrationFee()+"kr."+"\n";
    }
}
