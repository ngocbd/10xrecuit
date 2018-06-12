import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static long getRound(int x,int y)
	{
		for(long i =0L ; i<Long.MAX_VALUE;i++)
		{
			if( (x+i)%365==0 && (y+i)%687==0 )
			{
				return i;
			}
		}
		
		return -1;
	}
	



	public static int[][] inverse(int[][] mat )
	{
		int det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		int temp = mat[0][0];
		temp = mat[0][0];
		mat[0][0] = mat[1][1];
		mat[1][1] = temp;
		
		mat[0][1] = - mat[0][1];
		mat[1][0] = - mat[1][0];
		
		int result[][]= new int[2][2];
		for(int i = 0; i < 2; ++i) {
			for(int j = 0; j < 2; ++j)
				result[i][j]=Math.round(mat[i][j]/det);
				
			
			
		}
		return result;
		
		
	}
	public static void printMatrix(int matrix[][])
	{
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i=1;
        while(in.hasNext()){
            String line1 = in.nextLine();
            //System.out.println(line1);
            String arr[] = line1.split(" ");
            
            int mat[][] =  new int[2][2];
            mat[0][0]= Integer.parseInt(arr[0]);
            mat[0][1]= Integer.parseInt(arr[1]);
            
            String line2 = in.nextLine();
            //System.out.println(line2);
             arr = line2.split(" ");
            
            
            mat[1][0]= Integer.parseInt(arr[0]);
            mat[1][1]= Integer.parseInt(arr[1]);
            
            
            int result[][] = inverse(mat);
    		System.out.printf("Case %d:\n",i);
    		printMatrix(result);
    		String line3 = in.nextLine();
           // int result[][] = inverse(mat);
            //System.out.println(result[0][1]);
            i++;
            
        }
        
       
		
		
	}
	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
        while(in.hasNext()){
            String input = in.nextLine();
            String arr[] = input.split(" ");
            System.out.printf("Case %d: %d\n",i,(getRound(Integer.parseInt(arr[0])  ,Integer.parseInt(arr[1]))));

            i++;
            
        }
		

	}

}
