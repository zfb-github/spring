import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Person bean = applicationContext.getBean(Person.class);

		System.out.println(bean);



	}
}
