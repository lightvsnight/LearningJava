package com.io.reader;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {

	public static void main(String[] args) throws IOException {

		String str = "what are you doing now";
		char[] ch = new char[str.length()];

		str.getChars(0, str.length(), ch, 0);

		CharArrayReader input = new CharArrayReader(ch);

		int i;
		while( -1 != (i = input.read())){
			System.out.print((char)i);
		}
		
		System.out.println();
		
		CharArrayReader input1 = new CharArrayReader(ch);
		int j;
		for (; ; ) {
			if(-1 == (j = input1.read())){
				break;
			}else{
				System.out.print((char)j);
			}
		}

		input.close();
	}
}
