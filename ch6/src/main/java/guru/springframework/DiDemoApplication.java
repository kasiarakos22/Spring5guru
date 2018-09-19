package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.examplebeans.FakeDatasource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		FakeDatasource fakeDatasource = ctx.getBean(FakeDatasource.class);
		System.out.println(fakeDatasource.getUser());
	}
}
