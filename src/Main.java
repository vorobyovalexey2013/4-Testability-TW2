public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        BmiService service = new BmiService();
        double height = 1.87; // метров
        double weight = 98; // килограмм
        double Bmi = (int) service.calculate(height, weight);
        System.out.println("Индекс Вашего тела: " + Bmi);


    }
}