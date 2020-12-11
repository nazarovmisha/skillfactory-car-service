package ru.skillfactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.skillfactory.entity.DefaultCar;
import ru.skillfactory.service.CarService;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.skillfactory");

        CarService carService = context.getBean(CarService.class);
        carService.launchCar();

        DefaultCar defaultCar = context.getBean(DefaultCar.class);
        System.out.println(defaultCar.getSpeed());
    }
}
