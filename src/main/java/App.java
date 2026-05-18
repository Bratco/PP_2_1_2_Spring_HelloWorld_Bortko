import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld hello1 = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld hello2 = (HelloWorld) applicationContext.getBean("helloWorld");
        boolean helloEqual = (hello1 == hello2);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        boolean catEqual = (cat1 == cat2);


        System.out.println("helloWorld " + helloEqual);
        System.out.println("Cat " + catEqual);

        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}