package com.sachin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritedataInTextfile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\Desktop\\git-1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("testingg on 7-April");
	}
}