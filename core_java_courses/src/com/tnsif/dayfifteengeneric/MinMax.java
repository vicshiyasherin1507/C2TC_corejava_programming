package com.tnsif.dayfifteengeneric;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}