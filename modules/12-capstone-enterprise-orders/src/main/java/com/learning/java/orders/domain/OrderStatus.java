package com.learning.java.orders.domain;

/** A closed set of legal states, safer than accepting arbitrary status strings. */
public enum OrderStatus { NEW, PAID, SHIPPED, CANCELLED }
