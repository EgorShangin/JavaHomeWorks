public class HW2_4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        PrintArr(arr);
    }
    public static void PrintArr (int[][] arr)
    {
        for (int i=0; i < arr.length; i++ )
        {
            for (int j=0; j < arr[i].length; j++)
            {
                if (arr[i] == arr[j])
                {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
