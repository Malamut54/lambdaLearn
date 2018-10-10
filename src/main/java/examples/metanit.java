package examples;

public class metanit {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = sum(nums, (n)-> n > 5); // сумма чисел, которые больше 5
        System.out.println(x);
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

interface Expression {
    boolean isEqual(int n);
}

