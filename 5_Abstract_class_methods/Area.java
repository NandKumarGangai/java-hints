abstract class Area {
    Area(){
        System.out.println("Object created from Area abstract class.");
    }
    abstract void calculateArea(int side);
    void printMessage(){
        System.out.println("You are in abstract class.");
    }
    final void printFinalMethod(){
        System.out.println("You cannot override final method.");
    }
}
