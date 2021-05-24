package com.springbootbatch.practice.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	public void write(List<? extends String> messages) throws Exception {
		// TODO Auto-generated method stub
		for (String msg : messages) {
			System.out.println("Writing the data " + msg);
		}
	}

}
