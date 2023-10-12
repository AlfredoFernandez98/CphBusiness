// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Her kalder jeg metodenA
        Test.methodA("Start");
        Test.methodA("Alfredo");
        //Her kalder jeg metodenB
        Test.methodB("Hello");
        //her kalder jeg metodenC;
        Test.methodC("Hola");
        //her kalder jeg metodenD
        Test.methodD(9);

        System.out.println("NU printer jeg JavaErSjovt");
        Flows flows = new Flows();
        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        System.out.println("flows.methodA(\"start\");");
        flows.methodA("start");
        System.out.println("flows.methodB(\"Hello, world\");");
        flows.methodB("Hello, world");
        System.out.println("flows.methodC(\"Hello, world\");");
        flows.methodC("Hello, world");
        System.out.println("flows.methodD(25);");
        flows.methodD(25);



    }
}