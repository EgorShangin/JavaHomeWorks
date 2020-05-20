public class HW2_3 {
    public static void main(String[] args) {
        int[] MyArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int x : MyArr)
        {
            if (x < 6)
            {
                x *= 2;
            }
            System.out.print(x + " ");
        }
    }
}
