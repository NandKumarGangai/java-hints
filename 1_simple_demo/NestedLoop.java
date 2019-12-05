import java.util.Scanner;

class NestedLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y,z;


        for (y=0 ; y < x ; y++)
        {
            for(z=0 ; z<x ; z++)
                System.out.print(" i : "+y+" j : "+z+"\t");
            System.out.print("\n");
        }
    };
};
