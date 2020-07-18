package aforo255.ms.tes.transaction.service;

import aforo255.ms.tes.transaction.model.entity.Transaction;

public interface ITransactionService {
	
	public Transaction save(Transaction transaction);
	public Iterable<Transaction> findByAccountId(Integer accountId);
	public Iterable <Transaction> findAll();	
	
}
