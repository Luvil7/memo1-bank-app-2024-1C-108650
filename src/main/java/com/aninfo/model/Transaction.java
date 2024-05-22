package com.aninfo.model;

import javax.persistence.*;


@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long cbu;

    private Double amount;

    private TransactionType type;

    public Transaction(){
    }

    public Transaction(Long cbu, Double amount, TransactionType type) {
        this.cbu = cbu;
        this.amount = amount;
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public Long getCbu() {
        return cbu;
    }

    public Long getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }

}