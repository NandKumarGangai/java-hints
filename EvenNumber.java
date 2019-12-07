import java.util.Scanner;
class EvenNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number  :  ");
        int num = sc.nextInt();
        if(num%2!=0) num+=1;

        for(int i=0 ; num <= 100 ; i++)
            {System.out.print(" "+num );
                num+=2;}


    };
};
