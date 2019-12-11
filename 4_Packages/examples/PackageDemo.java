import calculation.Calculation;
import calculation.Calculation1; //importing a custom package 

class PackageDemo {
    public static void main(String args[]) {
        Calculation calculation = new Calculation(); 

        System.out.println("Addition: " + calculation.addition(10, 10));
        System.out.println("Multiplication: " + calculation.multiplication (10, 10));
        System.out.println("------------------------------------------------------");
        System.out.println("Addition: " + Calculation1.addition(10, 10));
        System.out.println("Multiplication: " + Calculation1.multiplication (10, 10));
    }
}