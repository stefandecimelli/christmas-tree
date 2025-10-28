package com.decimelli.christmas;

import java.io.PrintStream;

public class ChristmasTreePrinter {

	private int size;

	public ChristmasTreePrinter(int size) {
		if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");       
        }
		this.size = size;
	}

	public void print(PrintStream out) {
		for (int i = 0; i < this.size; i++) {
			out.println(" ".repeat(size - i) + "*".repeat(1 + 2 * i));	
		}
		out.println(" ".repeat(size) + "|");
	}
}
