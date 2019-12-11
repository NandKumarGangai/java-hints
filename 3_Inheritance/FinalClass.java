final class Sample {
    Sample(){
        System.out.println("Final Class");
    }
}

class FinalClass extends Sample {
    public static void main(String[] args) {
        Sample sample = new Sample(); // Will throw error  'error: cannot inherit from final Sample'
    }
}