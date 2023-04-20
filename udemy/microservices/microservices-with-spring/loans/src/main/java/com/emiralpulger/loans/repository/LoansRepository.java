package com.emiralpulger.loans.repository;

import com.emiralpulger.loans.model.Loans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoansRepository extends CrudRepository<Loans, Long> {

    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
