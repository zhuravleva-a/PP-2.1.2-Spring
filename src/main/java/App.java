import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сравнение бинов helloworld: " + (helloWorld1 == helloWorld2));
        System.out.println("Сравнение бинов cat: " + (cat1 == cat2));



    }
}