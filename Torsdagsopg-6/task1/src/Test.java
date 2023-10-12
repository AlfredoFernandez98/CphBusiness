public class Test {

    public static void methodA(String input){
        System.out.println("Printer med methodA");

        if(!input.equals("Start")){
            System.out.println("Hvorfor har du ikke skrevet Start");

        } else {
            System.out.println("Så printer vi bogstav A");
            System.out.println(methodC(input));
        }

    }
    public static void methodB(String start ){
        System.out.println("Printer med methodB");

    }

    public static int methodC(String input){
        System.out.println("Printer med methodC");
        methodD(input.length());
        return (input.length()*2)/2;

    }

    public static void methodD(int num){
        System.out.println("Printer med methodD");
        if (num<10){
            System.out.println("Nummeret er større end 10");
        } else {
            System.out.println("Numeret er mindre end 10");

        }
        System.out.println("du er lækker");

    }

}
