interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting anonymousObj = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };

        anonymousObj.greet();
    }
}

