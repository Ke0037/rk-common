package com.rk.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DateUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test//月初
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2008, 1, 3, 4, 25, 23);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2008, 1, 4, 16, 24, 56);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(df.format(date));
	}

}
