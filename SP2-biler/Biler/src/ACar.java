public abstract class ACar implements Car {
   private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registrationNumber,String make,String model,int numberOfDoors){

        this.registrationNumber=registrationNumber;
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;

    }



    public String getRegistrationNumber(){

        return registrationNumber;

    }

    public String getMake(){
        return make;

    }

    public String getModel(){
        return model;

    }
    public int getNumberOfDoors(){
        return numberOfDoors;

    }

    @Override

    public String toString(){

        return   "Her er nummerplade: " +registrationNumber+
                            "\n Hvad for en mærke er det: "+make+
                            "\n Modellen: "+ model+
                            "\n Antal dør: "+ numberOfDoors;

    }
}
