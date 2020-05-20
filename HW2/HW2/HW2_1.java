
public class HW2_1 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0,1,0,1};
        for (int x : arr)
        {
            if (x == 0)
            {
                x = 1;
            }
            else if (x == 1)
            {
                x = 0;
            }
         System.out.print(x + " ");
        }
    }
}
