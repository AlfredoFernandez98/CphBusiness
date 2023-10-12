public class Circle implements Shape {

double r;
Circle(double r){
    this.r=r;

}
    @Override
    public double GetAreal() {
        double result=3.14*(r*r);
        return result;

    }
}
