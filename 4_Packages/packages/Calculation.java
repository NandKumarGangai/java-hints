package calculation; // naming a package
/** 
 * use javac -d <src> <dest>
 * jar cvf calculation.jar *.class to create a jar file
 */
public class Calculation {
    public int addition(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
