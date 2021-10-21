import java.util.Scanner;

public class Course {

    public static void main(String arg[])
    {
        long i,count = 0;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        long n= Math.abs(sc.nextLong());
        for(long j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
        }
        if(count>2)
            System.out.print("murekkeb");
        else if (count >= 0){
            if (n ==0){
                System.out.println("Ne murekkeb ne de sade");
            }
            else
            System.out.println("sade");
        }
    }
}


