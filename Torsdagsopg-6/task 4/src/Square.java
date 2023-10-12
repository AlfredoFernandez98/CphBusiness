public class Square implements Shape{

double l;
    Square(double l){
        this.l=l;

    }
    @Override
    public double GetAreal() {
        double result= l*l;
        return result;

    }
}
