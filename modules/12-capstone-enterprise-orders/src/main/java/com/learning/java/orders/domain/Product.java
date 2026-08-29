package com.learning.java.orders.domain;

/** Product snapshot stored with an order line; its Money field carries both amount and currency. */
public record Product(String id, String name, Money price) { }
