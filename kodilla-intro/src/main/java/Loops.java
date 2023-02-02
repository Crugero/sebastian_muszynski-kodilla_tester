public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,4,8};
        int resultNumbers = sumNumbers(numbers);
        System.out.println(resultNumbers);
    }

    public static int sumNumbers(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result;
    }
}


