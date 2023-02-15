public class BmiService {
    public double calculate(double height, double weight) {
        double ind = (weight / (height * height));
        return ind;

    }


}
