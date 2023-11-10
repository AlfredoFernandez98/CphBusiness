import java.util.ArrayList;

 class FleetOfCars {

    ArrayList<Car>fleet=new ArrayList<>();


    public void addCar(Car car){
        fleet.add(car);

    }

   public int getTotalRegistrationFeeForFleet() {
        int r=0;
        for (Car i: fleet) {
            r += i.getRegistrationFee();



        }

        return r;
    }

     @Override
     public String toString() {

        String result="";
         for (Car c: fleet) {

             result += c;

         }
         return result+ "\n total RegistrationFee: " + getTotalRegistrationFeeForFleet();
     }
 }
