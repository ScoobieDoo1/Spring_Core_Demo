package springdemo;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
	

	public static void main(String[] args) {
		
	/*
		Car cc = new Car();
		cc.setBrand("Audi");
		cc.setColor("Silver");
		cc.setPrice(10000);
		
		System.out.println(cc.getBrand());
		System.out.println(cc.getColor());
		System.out.println(cc.getPrice());
		
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Car.xml");
		Car audi = (Car) context.getBean("car");
		System.out.println(audi);
		
		
	}

}
