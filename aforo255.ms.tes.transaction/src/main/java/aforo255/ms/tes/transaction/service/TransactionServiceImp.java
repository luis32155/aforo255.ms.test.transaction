package aforo255.ms.tes.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.tes.transaction.model.entity.Transaction;
import aforo255.ms.tes.transaction.model.repository.ITransactionRepository;
@Service
public class TransactionServiceImp implements ITransactionService{

	@Autowired
	private ITransactionRepository repository;
	
	@Override
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByAccountId(Integer accountId) {
		return repository.findByAccountId(accountId);
	}

	@Override
	public Iterable<Transaction> findAll() {
		return repository.findAll();
	}

}
