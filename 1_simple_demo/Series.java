class Series
{
    public static void main(String args[])
    {

        final int num=5;
       // num=6;
        String s1="dkte"; String s2 = "cse";
        String s3=s1+s2;
            System.out.println("\ns3  : "+s3);

        for(int x=0 ; x < 5 ; x++)
        {
            for(int y=4 ; y>x ; y--)
                System.out.print(" ");
            for(int z=0 ; z<=x ; z++)
                System.out.print("*");

                System.out.println("\n");
        }


    };
};
