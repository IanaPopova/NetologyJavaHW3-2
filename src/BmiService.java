public class BmiService {

    public int calculate(int weightInKg, double heightInM) {
        double bodyMassIndex = (int) (weightInKg / (heightInM * heightInM));
        return (int) bodyMassIndex;
    }
}
