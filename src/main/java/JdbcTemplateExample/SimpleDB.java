package JdbcTemplateExample;

import TightCoupled.AppleMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SimpleDB {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("simple.xml");
        SimpleJdbcTemplate simpleJdbcTemplate= (SimpleJdbcTemplate) context.getBean("jtemplate");
        String query="update people set first_name=?, where id=?";
        simpleJdbcTemplate.update(query,"Md",7);

    }
}
