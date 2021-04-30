package kr.mjc.sehyuckpark.java.lambdaexpression;

public class GreetingEx {

    public void sayHello(Greeting greeting) {
        greeting.greet();
    }

    public void go() {
        class EnglishGreeting implements Greeting {
            @Override
            public void greet() {
                System.out.println("Hello.");
            }
        }
        Greeting englishGreeting = new EnglishGreeting();
        sayHello(englishGreeting); // Hello.

        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour.");
            }
        };
        sayHello(frenchGreeting); // Bonjour.

        sayHello(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hola.");  // Hola
            }
        });

        sayHello(() -> System.out.println("AnNyung."));
    }

    public static void main(String[] args) {
        new GreetingEx().go();
    }
}
