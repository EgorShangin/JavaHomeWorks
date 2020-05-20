public class HW2_5 {
    public static void main(String[] args) {
        int[] arra = {3, 6, 1, 10, 15, -3, -6, 11, 15,-33, 45, 13};
        int min = arra[0];
        int max = arra[0];
        for (int i = 0; i < arra.length; i++)
        {
            if (arra[i] < min)
            {
                min = arra[i];
            }
            else if (arra[i] > max)
            {
                max = arra[i];
            }
        }
        System.out.println("Минимальный элемент массива : " + min);
        System.out.println("Максимальный элемент массива : " + max);
    }
}
