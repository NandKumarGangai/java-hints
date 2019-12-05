import java.util.Scanner;
class SwitchDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print("\n1. red\t2.yellow\t3.green\n4.blue \t5.pink\n");
        switch(s)
        {
        case "red":
            System.out.print("\n\ncolor of car is red\n");break;
        case"yellow":
            System.out.print("\n\ncolor of ball is yellow\n");break;
        case "green":
            System.out.print("\n\ncolor of tree is green\n");break;
        case "blue":
            System.out.print("\n\ncolor of sky id=s blue\n");break;
        case"pink":
            System.out.print("\n\ncolor of shirt is pink\n");break;
        default:
            System.out.print("\n\nwrong choice\n");break;

        }

    };
};
