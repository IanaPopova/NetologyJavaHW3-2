public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInM = 1.60;
        int weightInKg = 64;
        int bodyMassIndex = service.calculate(weightInKg, heightInM);
        System.out.println(bodyMassIndex);
    }
}
