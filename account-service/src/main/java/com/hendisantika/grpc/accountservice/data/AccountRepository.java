package com.hendisantika.grpc.accountservice.data;

import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : microservices-protobuf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-02
 * Time: 06:42
 */
public class AccountRepository {
    List<Account> accounts;

    public AccountRepository(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> findAll() {
        return accounts;
    }

    public List<Account> findByCustomer(int customerId) {
        return accounts.stream().filter(it -> it.getCustomerId() == customerId).collect(Collectors.toList());
    }

    public Account findByNumber(String number) {
        return accounts.stream().filter(it -> it.getNumber().equals(number)).findFirst().get();
    }
}
