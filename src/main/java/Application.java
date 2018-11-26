import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.service.AccountService;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AccountService service = appContext.getBean("accountService", AccountService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
