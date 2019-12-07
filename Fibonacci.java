import java.util.Scanner;
class Fibonacci
{

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("\nEnter Number :  ");
                int num = sc.nextInt();
                fibonacciSeries(num);
        };

       static void fibonacciSeries(int n)
        {
            int p_num=0,c_num =1,f_num=0;
            if(n<=1)System.out.print("\n"+n);
            else
            {
                System.out.print(p_num+" "+c_num+" ");
                for(int i=2 ; i<n ; i++)
                {
                    f_num=p_num+c_num;
                    p_num=c_num;
                    c_num=f_num;
                    System.out.print(f_num+" ");
                }
            }
        }
};
