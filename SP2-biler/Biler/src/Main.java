// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet =new FleetOfCars();



Car c1=new GasolineCar("123434","Audi","A6",5,20);
Car c2=new ElectricCar("00000", "Tesla","Model X long Range",4,100,580);
Car c3= new DieselCar("333333","Toyota","Yaris", 4,35,true );

fleet.addCar(c1);
fleet.addCar(c2);
fleet.addCar(c3);

        System.out.println(fleet);

    }
}