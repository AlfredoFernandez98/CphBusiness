import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ArrayList<Room> roomList=new ArrayList<>();
        Room r1= new Room(4,4,4);
        Room r2= new Room(3,6,8);
        Room r3= new Room(6,7,1);

        roomList.add(r1);
        roomList.add(r2);
        roomList.add(r3);

        Building building= new Building(roomList,3,4,true);

        System.out.println(countLampsInBuilding(building));

        System.out.println(isNormal(building));

    }

    private static  int countLampsInBuilding(Building build){
        int totalLamps=0;
            for(Room b: build.getRooms()){
                totalLamps+=b.getNumberOfLamps();

            }
            return totalLamps;
        }
    private static boolean isNormal(Building obj){

        if (obj.getNumberOfFloors() > obj.getRooms().size()){

            return true;

        } else{

            System.out.println("This is an add building");
            return false;

        }

    }

    }




