import java.util.Random;

public class RandomNumbers {
    private Random rand = new Random();
    private int max = 0;
    private int min = 40;

    public static void main(String[] args) {
        RandomNumbers randNo = new RandomNumbers();
        randNo.drawNumbers();
    }

    public void drawNumbers() {
        int sum = 0;
        while (sum < 5000) {
            int number = rand.nextInt(31);
            setMin(number);
            setMax(number);
            System.out.println(number);
            sum += number;
        }
        System.out.println("Max: " + getMax());
        System.out.println("Min: " + getMin());
    }

    public void setMin(int number) {
        if(number < min) {
            min = number;
        }
    }

    public void setMax(int number) {
        if(number > max) {
            max = number;
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}