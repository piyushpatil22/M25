package org.tnsindia.bufferreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferReader {
	public static void main(String[] args) throws IOException{
		BufferedReader rBuffer_obj =new BufferedReader(new InputStreamReader(System.in));
		String str =rBuffer_obj.readLine();
		System.out.println(str);
	}
}
