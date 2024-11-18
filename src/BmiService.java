public class BmiService {
    public int calculate(double weight, double height) {
        double math = height * height;
        double index = weight / math;
        return (int) index;
    }
}
