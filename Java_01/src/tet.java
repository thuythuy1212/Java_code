import java.util.*;

public class tet {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; count<n;i++)
        {
            int ap = 3*i+2;
            if(ap%4!=0)
            {
                System.out.print(ap+" ");
                count++;
            }

        }

    }
}