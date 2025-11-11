package Patterns;

public class House {

    public static void main(String[] args)
    {

        // Roof
        for (int row = 1; row <= 5; row++)
        {
            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }
            for (int str = 1; str <= (2 * row - 1); str++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Walls + Door
        int height = 8;
        int width = 11;
        int doorWidth = 3;
        int doorHeight = 4;
        int doorStart = (width - doorWidth) / 2;

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= width; j++)
            {

                // Draw boundary walls
                if (j == 1 || j == width || i == height)
                {
                    System.out.print("*");
                }

                // Door area (leave space for door)
                else if (i > height - doorHeight && j > doorStart && j <= doorStart + doorWidth)
                {
                    System.out.print(" ");
                }

                // Empty space inside walls
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
