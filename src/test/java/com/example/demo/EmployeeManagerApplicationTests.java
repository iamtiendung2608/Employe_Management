package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class EmployeeManagerApplicationTests {
	private Calculator Result=new Calculator();
	@Test
	void contextLoads() {
		int a=5;
		int b=10;
		int Res=Result.add(a, b);
		int expect=15;
		assertThat(Res).isEqualTo(expect);
	}
	class Calculator{
		int add(int num1 , int num2) {
			return num1+num2;
		}
	}
}
