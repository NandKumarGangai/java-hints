import java.util.Scanner;
class OperatorDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,choice=0;
        System.out.print("\nENTER TWO NUMBERS  : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        do
        {
                System.out.print("\nENTER \n1. ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT\n");
                choice = sc.nextInt();
                if(choice==1)
                    System.out.print("\nADDITION : "+(num1+num2));
                if(choice==2)
                    System.out.print("\nSUBTRACTION : "+(num1-num2));
                if(choice==3)
                    System.out.print("\nMULTIPLICATION : "+(num1*num2));
                if(choice==4)
                    System.out.print("\nDIVISION : "+(num1/num2));

        }while(choice!=5);
    };
};
