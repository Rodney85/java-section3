package ARRAYREVERSAL;

public class Reverse
{
    public static void main(String[] args)
      {
         int [] ray= {35, 180, 520, 650, 1000};
         reverse(ray, ray.length);
      }

         static void reverse(int x[], int y)
      {  
         int[] B = new int[y];
         int C = y;
         for (int i = 0; i < y; i++) {
B[C - 1] = x[i];
C = C - 1;
}
          // printing the reversed array
         System.out.println("So Your Reversed Array is:");
        for (int A = 0; A< y; A++) 
       {
         System.out.println(B[A]);
       }
    }
}