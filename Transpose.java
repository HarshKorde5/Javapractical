import java.util.*;

class Transpose
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter elements of the matrix : ");
        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                System.out.print((i+1)+","+(j+1)+": ");
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("Elements of the matrix before transpose : ");
        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Elements of the matrix after transpose : ");
        for(int i = 0;i < cols;i++)
        {
            for(int j = 0;j < rows;j++)
            {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();

        }
    }
}