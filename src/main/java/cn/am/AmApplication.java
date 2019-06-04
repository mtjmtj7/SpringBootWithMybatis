package cn.am;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("cn.am.dao")

=======

@SpringBootApplication
@MapperScan("cn.am.dao")
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
public class AmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmApplication.class, args);
    }
<<<<<<< HEAD
}


=======

}
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
