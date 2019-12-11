abstract class Person {
    abstract void printData();
}

class NestedClass {
    static int NUM = 10;

    NestedClass() {
        System.out.println("NestedClass Constructor called...and num is: " + NUM);
    }

    // Inner Class
    class Nest {
        int num = 20;

        Nest() {
            System.out.println("Nest Constructor called...and num is: " + num);
        }

        class West {
            int num = 30;

            West() {
                System.out.println("West Constructor called...and num is: " + num + " and NUM is: " + NestedClass.NUM);

            }
        }
    }

    //static inner class
    public static class StaticDemo {
        StaticDemo(){
            System.out.println("Statuc Constructor called... and NUM is: " + NestedClass.NUM);
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        NestedClass.Nest nest = nestedClass.new Nest();
        nest.new West();

        NestedClass.StaticDemo staticDemo = new NestedClass.StaticDemo();  // Initializing a statis inner class 

        // Creating anonymous class which extends Person class at compile time
        Person person = new Person() {
            void printData() {
                System.out.println(
                        "Hey there I am anonymous class and creating a new local inner class for demonstration.");

                // Creating a local class
                class Local {
                    Local() {
                        System.out.println("Local class is initialized successfully in printData method.");
                    }
                }
                new Local();
            }
        };
        person.printData();
    }
}