public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 48; //кг
        double height = 1.61; //м
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}
