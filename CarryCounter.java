

public class CarryCounter {
        public static int NumberOfCarries(int num1, int num2) {
            int carryCount = 0;
            int carry = 0;
            while (num1 > 0 || num2 > 0) {
                int digit1 = num1 % 10;
                int digit2 = num2 % 10;
                int sum = digit1 + digit2 + carry;
                carry = sum / 10;
                if (carry > 0) {
                    carryCount++;
                }

                num1 /= 10;
                num2 /= 10;
            }
            return carryCount;
        }
        public static void main(String[] args) {
            System.out.println(NumberOfCarries(451, 349));
            System.out.println(NumberOfCarries(23,534));
         }
       }