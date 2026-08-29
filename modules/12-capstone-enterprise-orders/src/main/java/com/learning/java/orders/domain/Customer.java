package com.learning.java.orders.domain;

/** Immutable customer data carried by an order in the capstone's framework-neutral domain. */
public record Customer(String id, String email) { }
