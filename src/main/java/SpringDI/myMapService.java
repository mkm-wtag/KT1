package SpringDI;

import com.sun.javaws.IconUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myMapService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Service service = (Service) context.getBean("service");
        System.out.println(service.getService().getCoordinates("Mohakhali"));
    }
}
