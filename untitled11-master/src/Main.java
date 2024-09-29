public class Main {
    public static void main(String[] args) {
        HumanIMB humanIMB = new HumanIMB(80, 1.52);
        System.out.println(humanIMB.getResult());
    }
}

class HumanIMB {
    private double weight;  // Вага
    private double height;  // Зріст
    private double imb;


    // Конструктор
    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.imb = calculateIMB();
    }

    // Метод для обчислення IMB
    private double calculateIMB() {
        return weight / (height * height);
    }

    // Метод для повернення результату IMB
    public String getResult() {
        String[] results = {"Deficit", "Norm", "Warning!", "Fat"};   // Результати
        double[] thresholds = {18.5, 25, 30};  //Значення для IMB

        for (int i = 0; i < thresholds.length; i++) {
            if (imb < thresholds[i]) {
                return results[i];
            }
        }
        return results[results.length - 1];  // Якщо IMB >= 30
    }
}
