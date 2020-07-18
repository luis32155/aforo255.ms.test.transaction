package aforo255.ms.tes.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aforo255.ms.tes.transaction.model.entity.Transaction;
import aforo255.ms.tes.transaction.service.ITransactionService;

@RestController
public class TransactionController {
	@Autowired
	private ITransactionService transaction;
	
	@GetMapping("/transaction/{id_invoice}")
	public ResponseEntity<?> obtenerByAccountId (@PathVariable Integer id_invoice){
		
		Iterable<Transaction> iTransaction=transaction.findByAccountId(id_invoice);
		
		return ResponseEntity.ok(iTransaction);
		
	}
	
	@GetMapping("/listar")
	public List<Transaction> listar(){
		
		return (List<Transaction>) transaction.findAll();
	}
	
}
