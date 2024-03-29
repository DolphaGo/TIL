package com.example.tobyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.tobyproject.toby_1.CountingConnectionMaker;
import com.example.tobyproject.toby_1.CountingDaoFactory;
import com.example.tobyproject.toby_1.UserDao;

@SpringBootApplication
public class TobyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TobyProjectApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        final UserDao dao = context.getBean("userDao", UserDao.class);

        /**
         * dao 사용 코드
         */
        dao.hello();

        final CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter : "+ ccm.getCounter());
    }

}
