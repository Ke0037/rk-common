package com.rk.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class FileUtilTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetExtendName() {
		String fileName = "1706D.jpg";
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
