package com.qa.repository;

import java.util.ArrayList;
import java.util.List;

import com.qa.domain.Account;

public class HibernateAccountRepositoryImpl implements AccountRepository {

	@Override
	public List<Account> findAll() {
		List<Account> customers = new ArrayList<>();
		
		Account accounts = new Account();
		
		accounts.setFirstname("John");
		accounts.setLastname("Gordon");
		
		customers.add(accounts);
		
		return customers;
	}
}
