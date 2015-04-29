package com.example.app;

import org.springframework.stereotype.Component;

@Component // DIコンテナに登録
public class AddCalculator implements Calculator {
	@Override
	public int calc(int a, int b) {
		return a + b;
	}
}
