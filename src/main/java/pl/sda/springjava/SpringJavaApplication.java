package pl.sda.springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJavaApplication {

    @Autowired
    private HelloBean helloBean;

    public static void main(String[] args) {
        SpringApplication.run(SpringJavaApplication.class, args);

    }

    @PostConstruct
    public void run() {
        helloBean.hello();
    }

}
