public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,4,8};
        int resultNumbers = sumNumbers();
        System.out.println(resultNumbers);
    }

    public int sumNumbers(int[] numbers){
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;

        }
    }


