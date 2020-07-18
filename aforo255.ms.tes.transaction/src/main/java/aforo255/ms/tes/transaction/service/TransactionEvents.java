package aforo255.ms.tes.transaction.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aforo255.ms.tes.transaction.model.entity.Transaction;
import aforo255.ms.tes.transaction.model.repository.ITransactionRepository;
@Service
public class TransactionEvents {
	@Autowired
	private ITransactionRepository repository;

	@Autowired
	ObjectMapper objectMapper;
	private Logger log = LoggerFactory.getLogger(TransactionEvents.class);

	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord)
			throws JsonMappingException, JsonProcessingException {
		Transaction transactionEvent = objectMapper.readValue(consumerRecord.value(), Transaction.class);
		log.info("transactionEven:{}", consumerRecord.value());

		repository.save(transactionEvent);
	}

}
