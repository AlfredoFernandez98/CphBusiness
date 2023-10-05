import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String>coffeMenu;

    public Cafe(){

        coffeMenu=new ArrayList<>();

    }

public void loadMenuData(){

    try {
        File file = new File("src/coffes.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            String coffes= scan.nextLine();
            System.out.println(coffes);

            coffeMenu.add(coffes);

        }
        scan.close();
    }
    catch(FileNotFoundException e){

        System.out.println("Det virker ikke");
    }
}

    public ArrayList<String> getCoffeMenu() {

        return coffeMenu;
    }
}
