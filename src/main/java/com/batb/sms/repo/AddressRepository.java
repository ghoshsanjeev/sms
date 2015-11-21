package com.batb.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batb.sms.bean.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	Address getById(int id);

}
