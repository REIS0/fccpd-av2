package cesar.school.expedicao;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import cesar.school.model.Compra;

@Component
public class Receiver {
    
    public void receiveMessage(Compra compra) throws InterruptedException {
        System.out.println("Notificao recebida.");
        System.out.println("Compra finalizada " + compra.toString());
        TimeUnit.SECONDS.sleep(3);
    }
}