class Solution {
    public int findComplement(int num) {
      for (long i = 1; i <= num; i <<= 1)
        num ^= i;
      return num;
    }
  }

public class App {
   
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int inputNumber = 5;
        int result = solution.findComplement(inputNumber);
    
        System.out.println(result);

        System.out.println("Hello, World!");
    }
}
