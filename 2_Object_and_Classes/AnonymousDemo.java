class Calculation {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

class AnonymousDemo {
    public static void main(String args[]) {
        System.out.println(new Calculation().add(10, 20));
    }
}