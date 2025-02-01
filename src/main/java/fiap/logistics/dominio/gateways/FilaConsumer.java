package fiap.logistics.dominio.gateways;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FilaConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_PEDIDO_PARA_ENTREGA)
    public void receberPedidoParaEntrega(String mensagem) {
        System.out.println("Pedido recebido: " + mensagem);
    }


}


