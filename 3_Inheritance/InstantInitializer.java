/**
 * It is example of how to compile and run a java file which has different name of class and file name.
 */
class Instance{
    int num;
    {
        num = 100;
    }
    Instance(){
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) {
        Instance instance = new Instance();
    }
}