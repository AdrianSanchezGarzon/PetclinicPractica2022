package org.springframework.samples.petclinic.bill.DAO;

import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.bill.DTO.Bill;

public interface BillRepository extends Repository<Bill, Integer> {
}
