package com.qa.repository;

import java.util.List;

import com.qa.domain.Account;

public interface AccountRepository {

	List<Account> findAll();

}