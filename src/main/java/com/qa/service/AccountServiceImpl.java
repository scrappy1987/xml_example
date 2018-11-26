package com.qa.service;

import java.util.List;

import com.qa.domain.Account;
import com.qa.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
	
	public AccountServiceImpl() {
		
	}
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	public void setaccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
}
