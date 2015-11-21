package com.batb.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batb.sms.bean.Address;
import com.batb.sms.repo.AddressRepository;

@Service
public class AddressSeriviceImpl extends AddressService {

	@Autowired
	AddressRepository repo;

	@Override
	public Address getById(int id) {
		return repo.getById(id);
	}

	public List<Address> getAll() {
		return repo.findAll();
	}

	public Address create(Address obj) {
		return repo.save(obj);
	}

	public Address update(Address obj) {
		return repo.saveAndFlush(obj);
	}

	public void remove(Address obj) {
		repo.delete(obj);
	}

}
