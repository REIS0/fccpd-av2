package cesar.school.carrinho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cesar.school.model.Compra;

@Component
public class Carrinho implements CommandLineRunner {

    @Autowired
    RabbitTemplate template;

    public void run(String... args) throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Compra compra = new Compra((rand.nextInt()*1000) + "@email.com", rand.nextInt()*10000 + "",
                 new ArrayList<>(Arrays.asList(rand.nextInt()*1000 + "", rand.nextInt()*1000 + "", rand.nextInt()*1000 + "")), rand.nextFloat()*1000);
            System.out.println("Enviando a notificacao...");
            template.convertAndSend("fanout-exchange", "", compra);
            TimeUnit.SECONDS.sleep(5);        
        }
    }
}