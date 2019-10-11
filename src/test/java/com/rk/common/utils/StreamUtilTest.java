package com.rk.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class StreamUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCloseAll() throws FileNotFoundException {
		
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String string = StreamUtil.readTextFile(new FileInputStream("e:/data.txt"));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("e:/data.txt"));
		System.out.println(string);
	}

}
