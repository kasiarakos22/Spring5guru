package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		FakeDatasource fakeDatasource = ctx.getBean(FakeDatasource.class);
		System.out.println(fakeDatasource.getUser());
		System.out.println(fakeDatasource.getUrl());
		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}
}
