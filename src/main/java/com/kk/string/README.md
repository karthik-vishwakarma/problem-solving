# String

1. Swap two numbers without using the third variable
   ```java
    import java.util.Scanner;
    public class SwapTwoNumberWithoutThirdVariable {
      public static void main(String[] args) {
         int x, y;
         System.out.println("ENTER YOU NUMBER");
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         y = scanner.nextInt();
         System.out.println("BEFORE SWAPPING :: X : " + x + " :: Y : " + y);
         x = x + y;
         y = x - y;
         x = x - y;
         System.out.println("AFTER SWAPPING :: X : " + x + " :: Y : " + y);
      }
   }
   ```
2. 