package com.example.repository;

import com.example.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * リポジトリ・クラスを利用してサービス・クラスを構築する
 * 以下のメソッドを作成
 * ・全件取得
 * ・1件取得
 * ・登録
 * ・削除
 */

@Repository
public class CustomerRepository {
	private final ConcurrentMap<Integer, Customer> customerMap = new ConcurrentHashMap<>();

	public List<Customer> findAll() {
		return new ArrayList<>(customerMap.values());
	}

	public Customer findOne(Integer customerId) {
		return customerMap.get(customerId);
	}

	public Customer save(Customer customer) {
		return customerMap.put(customer.getId(), customer);
	}

	public void delete(Integer customerId) {
		customerMap.remove(customerId);
	}
}
