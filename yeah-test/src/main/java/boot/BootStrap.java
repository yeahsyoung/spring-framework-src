package boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BootStrap {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(AppConfig.class));
	}
}
