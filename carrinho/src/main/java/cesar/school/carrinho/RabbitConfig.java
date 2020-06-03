package cesar.school.carrinho;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    static final String fanoutExchangeName = "fanout-exchange";
    static final String queueCobranca = "cobranca-queue";
    static final String queueExpedicao = "expedicao-queue";
    static final String queueEstoque = "estoque-queue";

    @Bean
    Queue queueCobranca() {
        return new Queue(queueCobranca, false);
    }

    @Bean
    Queue queueExpedicao() {
        return new Queue(queueExpedicao, false);
    }

    @Bean
    Queue queueEstoque() {
        return new Queue(queueEstoque, false);
    }

    @Bean
    FanoutExchange exchange() {
        return new FanoutExchange(fanoutExchangeName);
    }

    @Bean
    Binding bindFanoutExchangeToCobranca(FanoutExchange fanoutExchange, Queue queueCobranca) {
        return BindingBuilder.bind(queueCobranca).to(fanoutExchange);
    }

    @Bean
    Binding bindFanoutExchangeToExpedicao(FanoutExchange fanoutExchange, Queue queueExpedicao) {
        return BindingBuilder.bind(queueExpedicao).to(fanoutExchange);
    }

    @Bean
    Binding bindFanoutExchangeToEstoque(FanoutExchange fanoutExchange, Queue queueEstoque) {
        return BindingBuilder.bind(queueEstoque).to(fanoutExchange);
    }


}