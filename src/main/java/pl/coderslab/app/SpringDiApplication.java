package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
        System.out.println("---");

        MessageService messageService = context.getBean(MessageService.class);
        messageService.send();
        System.out.println("---");

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage();
        System.out.println("---");
        messageSender.sendMessageFromProperty();

        context.close();
    }
}
