package org.springframework.samples.petclinic.bill.DTO;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.owner.DTO.Visit;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "bills")
public class Bill {

	@Column(name = "bill_date")
	@NotEmpty
	private Date bill_date;

	@Column(name = "importe")
	@NotEmpty
	private Double importe;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "bill_id")
	@OrderBy("visit_date ASC")
	private Set<Visit> visits = new LinkedHashSet<>();
}
