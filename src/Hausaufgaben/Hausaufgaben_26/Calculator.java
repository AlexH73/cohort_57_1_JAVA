package Hausaufgaben.Hausaufgaben_26;

public class Calculator{
    public int addNumbers(int[] nums) {
        int sum = 0;
        for(int i = 0;
            i < nums.length;
            i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int result = calc.addNumbers(new int[] {1,2,3,4});
        System.out.println("Сумма: " + result);
    }
}
