package com.springbootbatch.practice.step;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

	public String process(String data) throws Exception {
		// TODO Auto-generated method stub
		return data.toUpperCase();
	}
	
}
