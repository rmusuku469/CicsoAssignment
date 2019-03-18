package com.cisco.web.util;

import java.util.Arrays;
import java.util.List;

public class UtilTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("https//www.oracle.com/xyx/y.html/jk/lo/ji","https//www.sun.com/cfd/z.jsp/yno","https//www.gen.com/str/mno.xhtml");
		System.out.println(new Util().getUrisAt(strings, -1));
	}
}
