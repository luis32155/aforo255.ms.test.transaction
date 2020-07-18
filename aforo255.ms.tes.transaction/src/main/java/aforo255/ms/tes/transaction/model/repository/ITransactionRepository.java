package aforo255.ms.tes.transaction.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import aforo255.ms.tes.transaction.model.entity.Transaction;

public interface ITransactionRepository extends MongoRepository<Transaction,String>  {
	@Query("{'id_invoice':?0}") 
	public Iterable<Transaction>  findByAccountId(Integer accountId);
}
