package aforo255.ms.tes.transaction.kafka.consumer.listener;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import aforo255.ms.tes.transaction.service.TransactionEvents;

@Component
public class TransactionEventsConsumer {
	@Autowired
	private TransactionEvents transactionEvents;

	private Logger log = LoggerFactory.getLogger(TransactionEventsConsumer.class);

	@KafkaListener(topics = { "operation-events" })
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord)
			throws JsonMappingException, JsonProcessingException {
		log.info("ConsumerRecord account :{}", consumerRecord);
		transactionEvents.processTransactionEvent(consumerRecord);

	}
}
