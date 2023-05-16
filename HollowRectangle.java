public class HollowRectangle {
    public static void main(String[] args) {
        
        for (int i = 1 ; i <=5 ; i++ )
        {
            for(int j = 1 ; j <= 4 ; j++)
            {   // Print asterisk (*) for the first and last row
                // or for the first and last column
                if(i==1 || j == 4 || i == 5 || j == 1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
            }
        }
    }

