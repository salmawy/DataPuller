package com.util.dataPull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.util.dataPull.core.config.shop.entities.Contractor;
import com.util.dataPull.core.config.shop.entities.ContractorAccount;
import com.util.dataPull.core.config.shop.entities.ContractorAccountDetail;
import com.util.dataPull.core.config.shop.entities.Customer;
import com.util.dataPull.core.config.shop.entities.CustomerOrder;
import com.util.dataPull.core.config.shop.entities.IncLoan;
import com.util.dataPull.core.config.shop.entities.Income;
import com.util.dataPull.core.config.shop.entities.IncomeDetail;
import com.util.dataPull.core.config.shop.entities.Installment;
import com.util.dataPull.core.config.shop.entities.LoanAccount;
import com.util.dataPull.core.config.shop.entities.LoanPaying;
import com.util.dataPull.core.config.shop.entities.Loaner;
import com.util.dataPull.core.config.shop.entities.Outcome;
import com.util.dataPull.core.config.shop.entities.OutcomeDetail;
import com.util.dataPull.core.config.shop.entities.PurchasedCustomerInst;
import com.util.dataPull.core.config.shop.entities.Season;
import com.util.dataPull.core.config.shop.entities.Seller;
import com.util.dataPull.core.config.shop.entities.SellerLoanBag;
import com.util.dataPull.core.config.shop.entities.SellerOrder;
import com.util.dataPull.core.config.shop.entities.SellerOrderWeight;
import com.util.dataPull.core.config.shop2020.entities.Contractor2020;
import com.util.dataPull.core.config.shop2020.entities.ContractorAccount2020;
import com.util.dataPull.core.config.shop2020.entities.ContractorAccountDetail2020;
import com.util.dataPull.core.config.shop2020.entities.Customer2020;
import com.util.dataPull.core.config.shop2020.entities.CustomerOrder2020;
import com.util.dataPull.core.config.shop2020.entities.IncLoan2020;
import com.util.dataPull.core.config.shop2020.entities.Income2020;
import com.util.dataPull.core.config.shop2020.entities.IncomeDetail2020;
import com.util.dataPull.core.config.shop2020.entities.Installment2020;
import com.util.dataPull.core.config.shop2020.entities.LoanAccount2020;
import com.util.dataPull.core.config.shop2020.entities.LoanPaying2020;
import com.util.dataPull.core.config.shop2020.entities.Loaner2020;
import com.util.dataPull.core.config.shop2020.entities.Outcome2020;
import com.util.dataPull.core.config.shop2020.entities.OutcomeDetail2020;
import com.util.dataPull.core.config.shop2020.entities.PurchasedCustomerInst2020;
import com.util.dataPull.core.config.shop2020.entities.Season2020;
import com.util.dataPull.core.config.shop2020.entities.Seller2020;
import com.util.dataPull.core.config.shop2020.entities.SellerLoanBag2020;
import com.util.dataPull.core.config.shop2020.entities.SellerOrder2020;
import com.util.dataPull.core.config.shop2020.entities.SellerOrderWeight2020;
import com.util.dataPull.core.config.shop2020.entities.repo.Contractor2020Repo;
import com.util.dataPull.core.config.shop2020.entities.repo.ContractorAccount2020Repo;
import com.util.dataPull.core.config.shop2020.entities.repo.ContractorAccountDetailRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.CustomerOrderRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.CustomerRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.FridageRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.IncLoanRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.IncomeDetailRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.IncomeRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.InstallmentRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.LoanAccountRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.LoanPayingRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.LoanerRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.OutcomeDetailRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.OutcomeRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.PurchasedCustomerInstRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.SeasonRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.SellerLoanBagRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.SellerOrderRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.SellerOrderWeightRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.SellerRepo;
import com.util.dataPull.core.config.shop2020.entities.repo.StoreRepo;
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
	ContractorAccount2020Repo conntAcc2020Repo;

	@Autowired
	ContractorAccountDetailRepo accountDetailRepo;

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
	IncLoanRepo incLoanRepo;

	@Autowired
	IncomeRepo incomeRepo;

	@Autowired
	IncomeDetailRepo incomeDetailRepo;

	@Autowired
	OutcomeRepo outcomeRepo;

	@Autowired
	OutcomeDetailRepo outcomeDetailRepo;

	@Autowired
	InstallmentRepo installmentRepo;

	@Autowired
	LoanAccountRepo loanAccountRepo;

	@Autowired
	LoanPayingRepo loanPayingRepo;

	@Override
	@Transactional
	public void run(String... args) throws Exception {

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
		  // ============================================================================================================================================
		  log.info("start fetching ContractorAccount Data ......");
		  
		  List<ContractorAccount> contractorsAccounts =
		  baseService.findAllBeans(ContractorAccount.class, shopEntityManager);
		  log.info("ContractorAccount Data has be en fetched succeffully  :)");
		  
		  contractorsAccounts.stream().forEach(e -> { ContractorAccount2020 bean =
		  (ContractorAccount2020) new ContractorAccount2020().map(e);
		  
		  try {
		  
		  //log.info("Contractor2020 ID =>>>>>>" + ((ContractorAccount)		  e).getContractorId());
		  
		  //log.info("ContractorAccount2020 ID =>>>>>>" + ((ContractorAccount)		  e).getId()); 
			  if (((ContractorAccount) e).getContractorId() != 101)
		  conntAcc2020Repo.save(bean); } catch (Exception e2) {
		  log.error("error inserting " + String.valueOf(bean.getId()));
		  e2.printStackTrace(); } });
		  log.info("ContractorAccount Data has be en saved succeffully  :)"); 
		  //============================================================================= ===============================================================
		  log.info("start fetching ContractorAccountDetail Data ......"); result =
		  baseService.findAllBeans(ContractorAccountDetail.class, shopEntityManager);
		  log.info("ContractorAccountDetail Data has be en fetched succeffully  :)");
		  result.stream().forEach(e -> {
		  
		  try { //log.info("ContractorAccountDetail ID =>>>>>>" +		  ((ContractorAccountDetail) e).getId()); 
		  if (((ContractorAccountDetail) e).getContractorAccount().getContractorId()!= 101)
		  accountDetailRepo.save((ContractorAccountDetail2020) new
		  ContractorAccountDetail2020().map(e)); }
		  catch (Exception e1) { 
			 e1.printStackTrace(); }
		  
		  
		  }); log.info("ContractorAccountDetail Data has be en saved succeffully  :)");
		 
		  // ============================================================================================================================================
		  log.info("start fetching Customer Data ......"); result =
		  baseService.findAllBeans(Customer.class, shopEntityManager);
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
		
		  log.info("start fetching CustomerOrder Data ......"); result =
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

		log.info("start fetching Income Data ......");

		result = baseService.findAllBeans(Income.class, shopEntityManager);
		log.info("Income Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		incomeRepo.save((Income2020) new Income2020().map(e)));
		log.info("Income Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching IncomeDetail Data ......");
		result = baseService.findAllBeans(IncomeDetail.class, shopEntityManager);
		log.info("IncomeDetail Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		incomeDetailRepo.save((IncomeDetail2020) new IncomeDetail2020().map(e)));
		log.info("IncomeDetail Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching Outcome Data ......");
		result = baseService.findAllBeans(Outcome.class, shopEntityManager);
		log.info("Outcome Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		outcomeRepo.save((Outcome2020) new Outcome2020().map(e)));
		log.info("Outcome Data has be en saved succeffully  :)");
		// ============================================================================================================================================

		log.info("start fetching OutcomeDetail Data ......");
		result = baseService.findAllBeans(OutcomeDetail.class, shopEntityManager);
		log.info("OutcomeDetail Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		outcomeDetailRepo.save((OutcomeDetail2020) new OutcomeDetail2020().map(e)));
		log.info("OutcomeDetail Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching LoanAccount Data ......");
		result = baseService.findAllBeans(LoanAccount.class, shopEntityManager);
		log.info("LoanAccount Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		loanAccountRepo.save((LoanAccount2020) new LoanAccount2020().map(e)));
		log.info("LoanAccount Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching LoanPaying Data ......");
		result = baseService.findAllBeans(LoanPaying.class, shopEntityManager);
		log.info("LoanPaying Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		loanPayingRepo.save((LoanPaying2020) new LoanPaying2020().map(e)));
		log.info("LoanPaying Data has be en saved succeffully  :)");
		// ============================================================================================================================================
		log.info("start fetching IncLoan Data ......");
		result = baseService.findAllBeans(IncLoan.class, shopEntityManager);
		log.info("IncLoan Data has be en fetched succeffully  :)");

		result.stream().forEach(e ->

		incLoanRepo.save((IncLoan2020) new IncLoan2020().map(e)));
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
}
