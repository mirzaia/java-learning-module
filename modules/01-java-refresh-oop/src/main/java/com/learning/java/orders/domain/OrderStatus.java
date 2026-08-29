package com.learning.java.orders.domain;

/** The finite lifecycle states an order may hold; an enum prevents misspelled string states. */
public enum OrderStatus { NEW, PAID, SHIPPED, CANCELLED }
