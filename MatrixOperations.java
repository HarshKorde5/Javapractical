import java.util.*;

class MatrixOperations
{
    public static void display(int matrix[][])
    {
        for(int i = 0;i < 3;i++)
        {
            for(int j = 0;j < 3;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void Addition(int mat1[][],int mat2[][])
    {
        for(int i = 0;i < 3;i++)
        {
            for(int j = 0;j < 3;j++)
            {
                System.out.print(mat1[i][j]+mat2[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void Multiplication(int mat1[][],int mat2[][])
    {
        for(int i = 0;i < 3;i++)
        {
            for(int j = 0;j < 3;j++)    //row1col1,2,3
            {
                int temp = 0;

                for(int k = 0;k < 3;k++)    //col1,2,3
                {
                    temp += mat1[i][k]*mat2[k][j];
                }

                System.out.print(temp+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {

        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3],cnt = 1;
        int matrix2[][] = new int[3][3];

        for(int i = 0;i < 3;i++)
        {
            for(int j = 0;j < 3;j++)
            {
                matrix1[i][j] = cnt++;
                matrix2[i][j] = cnt++;

            }
        }

        System.out.println("Matrix 1 : ");
        MatrixOperations.display(matrix1);

        System.out.println("Matrix 2 : ");
        MatrixOperations.display(matrix2);

        while(true)    
        {
            System.out.println("Menu\n1.Addition\n2.Multiplication\n3.Exit\nEnter your choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    MatrixOperations.Addition(matrix1,matrix2);
                break;

                case 2:
                    MatrixOperations.Multiplication(matrix1,matrix2);
                break;

                case 3:
                    System.exit(0);
                break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}