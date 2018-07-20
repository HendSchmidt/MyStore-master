package com.example.mystore;

public class ProductInvalidExeception extends RuntimeException{

	private static final long serialVersionUID = 3762486590564219630L;

	public ProductInvalidExeception(String e) {
		super(e);
	}
}
