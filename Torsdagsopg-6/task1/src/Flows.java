public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");

            methodC(input);



        }

        System.out.println("r");
    }

    public void methodB(String start) {
        System.out.println("S");
        System.out.println("j");
    }

    public int methodC(String input) {
        System.out.println("v");
        if(input.length()==12){
            System.out.println("o");

        }else{
        System.out.println("a");
        }
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {

        if (number == 5) {
            System.out.println("E");
        }
        else if(number==12){
            System.out.println("t");
        }

    }


}
