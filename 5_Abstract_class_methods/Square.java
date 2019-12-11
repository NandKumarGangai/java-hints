class Square extends Area {
    void calculateArea(int s){
        System.out.println("Area of Square is: " + ( s * s ));
    };

    /**
     * Will throw error:
     *  overridden method is final
     */
   /*  void printFinalMethod(){
        super.printFinalMethod();
        System.out.println("I am trying to overriding you.");
    } */
    public static void main(String[] args) {
        Square square = new Square();

        square.calculateArea(10);
        square.printMessage(); // non-abstract method from abstract class
        square.printFinalMethod();
    }
}
