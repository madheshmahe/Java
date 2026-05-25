class typecasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit typecasting (widening)
        System.out.println("Value of b: " + b);

        double c = 9.99;
        int d = (int) c; // Explicit typecasting (narrowing)
        System.out.println("Value of d: " + d);
    }
}