package com.util.dataPull;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.util.dataPull.core.config.shop.entities.Contractor;
import com.util.dataPull.core.config.shop.entities.ContractorAccountDetail;
import com.util.dataPull.core.config.shop.entities.Customer;
import com.util.dataPull.core.config.shop.entities.CustomerOrder;
import com.util.dataPull.core.config.shop.entities.IncLoan;
import com.util.dataPull.core.config.shop.entities.IncomeDetail;
import com.util.dataPull.core.config.shop.entities.Installment;
import com.util.dataPull.core.config.shop.entities.LoanPaying;
import com.util.dataPull.core.config.shop.entities.Loaner;
import com.util.dataPull.core.config.shop.entities.OutcomeDetail;
import com.util.dataPull.core.config.shop.entities.PurchasedCustomerInst;
import com.util.dataPull.core.config.shop.entities.Season;
import com.util.dataPull.core.config.shop.entities.Seller;
import com.util.dataPull.core.config.shop.entities.SellerLoanBag;
import com.util.dataPull.core.config.shop.entities.SellerOrder;
import com.util.dataPull.core.config.shop.entities.SellerOrderWeight;
import com.util.dataPull.core.config.shop2020.entities.contractors.Contractor2020;
import com.util.dataPull.core.config.shop2020.entities.contractors.ContractorTransaction;
import com.util.dataPull.core.config.shop2020.entities.customers.Customer2020;
import com.util.dataPull.core.config.shop2020.entities.customers.CustomerOrder2020;
import com.util.dataPull.core.config.shop2020.entities.customers.PurchasedCustomerInst2020;
import com.util.dataPull.core.config.shop2020.entities.expanses.IncomeDetail2020;
import com.util.dataPull.core.config.shop2020.entities.expanses.OutcomeDetail2020;
import com.util.dataPull.core.config.shop2020.entities.masterData.Season2020;
import com.util.dataPull.core.config.shop2020.entities.sales.Installment2020;
import com.util.dataPull.core.config.shop2020.entities.sales.Seller2020;
import com.util.dataPull.core.config.shop2020.entities.sales.SellerLoanBag2020;
import com.util.dataPull.core.config.shop2020.entities.sales.SellerOrder2020;
import com.util.dataPull.core.config.shop2020.entities.sales.SellerOrderWeight2020;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.LoanCredit;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.LoanDebit;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.Loaner2020;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.PayCredit;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.PayDebit;
import com.util.dataPull.core.config.shop2020.entities.shopLoan.ShopLoanTransaction;
import com.util.dataPull.core.config.shop2020.repo.Contractor2020Repo;
import com.util.dataPull.core.config.shop2020.repo.ContractorTransactionRepo;
import com.util.dataPull.core.config.shop2020.repo.CustomerOrderRepo;
import com.util.dataPull.core.config.shop2020.repo.CustomerRepo;
import com.util.dataPull.core.config.shop2020.repo.FridageRepo;
import com.util.dataPull.core.config.shop2020.repo.ILoanCreditRepo;
import com.util.dataPull.core.config.shop2020.repo.ILoanDebitRepo;
import com.util.dataPull.core.config.shop2020.repo.IPayCreditRepo;
import com.util.dataPull.core.config.shop2020.repo.IPayDebitRepo;
import com.util.dataPull.core.config.shop2020.repo.IncomeDetailRepo;
import com.util.dataPull.core.config.shop2020.repo.InstallmentRepo;
import com.util.dataPull.core.config.shop2020.repo.LoanerRepo;
import com.util.dataPull.core.config.shop2020.repo.OutcomeDetailRepo;
import com.util.dataPull.core.config.shop2020.repo.PurchasedCustomerInstRepo;
import com.util.dataPull.core.config.shop2020.repo.SeasonRepo;
import com.util.dataPull.core.config.shop2020.repo.SellerLoanBagRepo;
import com.util.dataPull.core.config.shop2020.repo.SellerOrderRepo;
import com.util.dataPull.core.config.shop2020.repo.SellerOrderWeightRepo;
import com.util.dataPull.core.config.shop2020.repo.SellerRepo;
import com.util.dataPull.core.config.shop2020.repo.StoreRepo;
import com.util.dataPull.core.exception.DataBaseException;
import com.util.dataPull.core.exception.EmptyResultSetException;
import com.util.dataPull.core.service.spring.BaseService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataPuller implements CommandLineRunner {

	@PersistenceContext
	@Qualifier("shopEntityManager")
	EntityManager shopEntityManager;

	@PersistenceContext
	@Qualifier("shop2020EntityManager")
	EntityManager shop2020EntityManager;

	@Autowired
	SeasonRepo seasonRepo;

	@Autowired
	FridageRepo fridageRepo;

	@Autowired
	StoreRepo storeRepo;

	@Autowired
	BaseService baseService;

	@Autowired
	Contractor2020Repo contractorRepo;

	

	@Autowired
	ContractorTransactionRepo contractoTransactionRepo;

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	SellerRepo sellerRepo;

	@Autowired
	LoanerRepo loanerRepo;

	@Autowired
	SellerOrderRepo sellerOrderRepo;

	@Autowired
	CustomerOrderRepo customerOrderRepo;

	@Autowired
	SellerLoanBagRepo bagRepo;

	@Autowired
	SellerOrderWeightRepo weightRepo;

	@Autowired
	PurchasedCustomerInstRepo purchasedCustomerInstRepo;

	 
 
	 
	@Autowired
	IncomeDetailRepo incomeDetailRepo;

  
	@Autowired
	OutcomeDetailRepo outcomeDetailRepo;

	@Autowired
	InstallmentRepo installmentRepo;

	 
	
	
	@Autowired
	ILoanCreditRepo loanCreditRepo;
	@Autowired
	ILoanDebitRepo loanDebitRepo;
	@Autowired
	IPayCreditRepo payCreditRepo;
	@Autowired
	IPayDebitRepo payDebitRepo;

	@Override
	@Transactional
	public void run(String... args) throws Exception { 
		
		
		
	//fullPull();
		partialPull();
	}
	
	
	
	
	private void fullPull() throws DataBaseException, EmptyResultSetException {


		// shopEntityManager.
		List<Object> result = null;

		// ============================================================================================================================================
		
		  log.info("start fetching Season Data ......"); result =
		  baseService.findAllBeans(Season.class, shopEntityManager);
		  log.info("Season Data has be en fetched succeffully  :)");
		  result.stream().forEach(e ->
		  
		  seasonRepo.save((Season2020) new Season2020().map(e)));
		  
		  log.info("Season Data has be en saved succeffully  :)");
		  
		  //============================================================================================================================================
		  log.info("start fetching Contractor Data ......"); List<Contractor>
		  shopContractors = baseService.findAllBeans(Contractor.class,
		  shopEntityManager);
		  log.info("Contractor Data has be en fetched succeffully  :)");
		  shopContractors.stream().forEach(e -> contractorRepo.save((Contractor2020)
		  new Contractor2020().map(e)));
		  log.info("Contractor Data has be en saved succeffully  :)"); 
		  
		  //============================================================================= ===============================================================
		  log.info("start fetching ContractorAccountDetail Data ......"); result =
		  baseService.findAllBeans(ContractorAccountDetail.class, shopEntityManager);
		  log.info("ContractorAccountDetail Data has be en fetched succeffully  :)");
		  result.stream().forEach(e -> {
		  
		  try { //log.info("ContractorAccountDetail ID =>>>>>>" +		  ((ContractorAccountDetail) e).getId()); 
		  if (((ContractorAccountDetail) e).getContractorAccount().getContractorId()!= 101)
			  contractoTransactionRepo.save((ContractorTransaction) new
				  ContractorTransaction().map(e)); }
		  catch (Exception e1) { 
			 e1.printStackTrace(); }
		  
		  
		  }); log.info("ContractorAccountDetail Data has be en saved succeffully  :)");
		 
		  // ============================================================================================================================================
		  log.info("start fetching Customer Data ......"); result =
	 result=  baseService.findAllBeans(Customer.class, shopEntityManager);
		  log.info("Customer Data has be en fetched succeffully  :)");
		  result.stream().forEach(e ->
		  
		  customerRepo.save((Customer2020) new Customer2020().map(e)));
		  log.info("Customer Data has be en saved succeffully  :)");
		  // ============================================================================================================================================
		  log.info("start fetching Seller Data ......"); result =
		  baseService.findAllBeans(Seller.class, shopEntityManager);
		  log.info("Seller Data has be en fetched succeffully  :)");
		  
		  result.stream().forEach(e ->
		  
		  sellerRepo.save((Seller2020) new Seller2020().map(e)));
		  log.info("Seller Data has be en saved succeffully  :)"); 
		  // ============================================================================================================================================
		  log.info("start fetching Loaner Data ......"); result =
		  baseService.findAllBeans(Loaner.class, shopEntityManager);
		  log.info("Loaner Data has be en fetched succeffully  :)");
		  
		  result.stream().forEach(e ->
		  
		  loanerRepo.save((Loaner2020) new Loaner2020().map(e)));
		  log.info("Loaner Data has be en saved succeffully  :)");
		 
		// ============================================================================================================================================
		
		  log.info("start fetching CustomerOrder Data ......");
		  result =
		  baseService.findAllBeans(CustomerOrder.class, shopEntityManager);
		  log.info("CustomerOrder Data has be en fetched succeffully  :)");
		  
		  result.stream().forEach(e ->
		  
		  customerOrderRepo.save((CustomerOrder2020) new CustomerOrder2020().map(e)));
		  log.info("CustomerOrder Data has be en saved CustomerOrder  :)"); //
		// ============================================================================================================================================
		  log.info("start fetching SellerLoanBag Data ......");
		  
		  result = baseService.findAllBeans(SellerLoanBag.class, shopEntityManager);
		  log.info("SellerLoanBag Data has be en fetched succeffully  :)");
		  
		  result.stream().forEach(e ->
		 
		  bagRepo.save((SellerLoanBag2020) new SellerLoanBag2020().map(e)));
		  log.info("SellerLoanBag Data has be en saved succeffully  :)"); //
		 // ============================================================================================================================================
		  log.info("start fetching SellerOrder Data ......"); result =
		  baseService.findAllBeans(SellerOrder.class, shopEntityManager);
		  log.info("SellerOrder Data has be en fetched succeffully  :)");
		  
		  result.stream().forEach(e ->
		  
		  sellerOrderRepo.save((SellerOrder2020) new SellerOrder2020().map(e)));
		  log.info("SellerOrder Data has be en saved succeffully  :)");
		 
		// ============================================================================================================================================
		log.info("start fetching SellerOrderWeight Data ......");
		result = baseService.findAllBeans(SellerOrderWeight.class, shopEntityManager);
		log.info("SellerOrderWeight Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		weightRepo.save((SellerOrderWeight2020) new SellerOrderWeight2020().map(e)));
		log.info("SellerOrderWeight Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching Installment Data ......");
		result = baseService.findAllBeans(Installment.class, shopEntityManager);
		log.info("Installment Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		installmentRepo.save((Installment2020) new Installment2020().map(e)));
		log.info("Installment Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching PurchasedCustomerInst Data ......");

		result = baseService.findAllBeans(PurchasedCustomerInst.class, shopEntityManager);
		log.info("PurchasedCustomerInst Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		purchasedCustomerInstRepo.save((PurchasedCustomerInst2020) new PurchasedCustomerInst2020().map(e)));
		log.info("PurchasedCustomerInst Data has be en saved succeffully  :)");
		// ============================================================================================================================================

 		log.info("start fetching IncomeDetail Data ......");
		result = baseService.findAllBeans(IncomeDetail.class, shopEntityManager);
		log.info("IncomeDetail Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		incomeDetailRepo.save((IncomeDetail2020) new IncomeDetail2020().map(e)));
		log.info("IncomeDetail Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching OutcomeDetail Data ......");
		result = baseService.findAllBeans(OutcomeDetail.class, shopEntityManager);
		log.info("OutcomeDetail Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->
		outcomeDetailRepo.save((OutcomeDetail2020) new OutcomeDetail2020().map(e)));
		log.info("OutcomeDetail Data has be en saved succeffully  :)");
		// ============================================================================================================================================

		// ============================================================================================================================================
		log.info("start fetching LoanPaying Data ......");
		result = baseService.findAllBeans(LoanPaying.class, shopEntityManager);
		log.info("LoanPaying Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->
		{
			  LoanPaying loanPaying=(LoanPaying)e;
		  if(loanPaying.getLoanAccount().getType().equals("IN_LOAN")) {
			  ShopLoanTransaction loanTransaction=new PayCredit().mapLoanPaying(loanPaying);
			  payCreditRepo.save((PayCredit)loanTransaction);
		  }
		  else if (loanPaying.getLoanAccount().getType().equals("OUT_LOAN")) {
			  ShopLoanTransaction loanTransaction=new PayDebit().mapLoanPaying(loanPaying);
			  payDebitRepo.save((PayDebit)loanTransaction);
		  }  
		  
		  
		  }
		);
		log.info("LoanPaying Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching IncLoan Data ......");
		result = baseService.findAllBeans(IncLoan.class, shopEntityManager);
		log.info("IncLoan Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->
		{
			  IncLoan incloan=(IncLoan)e;
	 		  if(incloan.getLoanAccount().getType().equals("IN_LOAN")) {
				  ShopLoanTransaction loanTransaction=new LoanDebit().mapIncLoan(incloan);
	 			  loanDebitRepo.save((LoanDebit)loanTransaction);
			  }
			  else if (incloan.getLoanAccount().getType().equals("OUT_LOAN")) {
	 			  ShopLoanTransaction loanTransaction=new LoanCredit().mapIncLoan(incloan);
				  loanCreditRepo.save((LoanCredit)loanTransaction);
	 		  }  
			  
			  
			  });
		log.info("IncLoan Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("====================================================================================================================================");
		log.info("====================================================================================================================================");
		log.info("====================================================================================================================================");
		log.info("================================   ==========================================   =============      ==============================");
		log.info("================================   ==========================================   ===========    =   ================================");
		log.info("================================   ==========================================   ===========   ==   =================================");
		log.info("================================   ==========================================   ==========   ===   ==================================");
		log.info("================================   ==========================================   =========   ====   ==============================");
		log.info("================================   ==========================================   ========   =====   ==============================");
		log.info("================================   =================       ==================   =======   ======   ===============================");
		log.info("========================	         ==============             ===============   ======  ========   ==============================");
		log.info("=====================   ========   ============                 =============   ====   =========   =================================");
		log.info("====================    ========   ==============             ===============   ===   ==========   ===================================");
		log.info("====================    ========   =================       ==================   ==   ===========   ==================================");
		log.info("======================   =======   ==========================================   =   ============   ==============================");
		log.info("==========================      =========================================================================================================");
		log.info("====================================================================================================================================");
		log.info("====================================================================================================================================");


	
	}
	
	
	private void partialPull() throws DataBaseException, EmptyResultSetException {  log.info("start fetching ContractorAccountDetail Data ......");
 			List	 result = new ArrayList<>();// baseService.findAllBeans(IncomeDetail.class, shopEntityManager);
 			log.info("start fetching IncomeDetail Data ......");
 			result = baseService.findAllBeans(IncomeDetail.class, shopEntityManager);
 			log.info("IncomeDetail Data has be en fetched succeffully  :)");

 			result.stream().forEach(e ->

 			incomeDetailRepo.save((IncomeDetail2020) new IncomeDetail2020().map(e)));
 			log.info("IncomeDetail Data has be en saved succeffully  :)");
 			// ============================================================================================================================================
 			log.info("start fetching OutcomeDetail Data ......");
 			result = baseService.findAllBeans(OutcomeDetail.class, shopEntityManager);
 			log.info("OutcomeDetail Data has be en fetched succeffully  :)");

 			result.stream().forEach(e ->
 			outcomeDetailRepo.save((OutcomeDetail2020) new OutcomeDetail2020().map(e)));
 			log.info("OutcomeDetail Data has be en saved succeffully  :)");
 			//===============================================================================================================================================
			 
	
 			log.info("start fetching LoanPaying Data ......");
 			result = baseService.findAllBeans(LoanPaying.class, shopEntityManager);
 			log.info("LoanPaying Data has be en fetched succeffully  :)");

 			result.stream().forEach(e ->
 			{
 				  LoanPaying loanPaying=(LoanPaying)e;
 			  if(loanPaying.getLoanAccount().getType().equals("IN_LOAN")) {
 				  ShopLoanTransaction loanTransaction=new PayCredit().mapLoanPaying(loanPaying);
 				  payCreditRepo.save((PayCredit)loanTransaction);
 			  }
 			  else if (loanPaying.getLoanAccount().getType().equals("OUT_LOAN")) {
 				  ShopLoanTransaction loanTransaction=new PayDebit().mapLoanPaying(loanPaying);
 				  payDebitRepo.save((PayDebit)loanTransaction);
 			  }  
 			  
 			  
 			  }
 			);
 			log.info("LoanPaying Data has be en saved succeffully  :)");
 			// ============================================================================================================================================
 			log.info("start fetching IncLoan Data ......");
 			result = baseService.findAllBeans(IncLoan.class, shopEntityManager);
 			log.info("IncLoan Data has be en fetched succeffully  :)");

 			result.stream().forEach(e ->
 			{
 				  IncLoan incloan=(IncLoan)e;
 		 		  if(incloan.getLoanAccount().getType().equals("IN_LOAN")) {
 					  ShopLoanTransaction loanTransaction=new LoanDebit().mapIncLoan(incloan);
 		 			  loanDebitRepo.save((LoanDebit)loanTransaction);
 				  }
 				  else if (incloan.getLoanAccount().getType().equals("OUT_LOAN")) {
 		 			  ShopLoanTransaction loanTransaction=new LoanCredit().mapIncLoan(incloan);
 					  loanCreditRepo.save((LoanCredit)loanTransaction);
 		 		  }  
 				  
 				  
 				  });
 			log.info("IncLoan Data has be en saved succeffully  :)");
	
	}
}
