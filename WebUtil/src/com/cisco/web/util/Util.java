package com.cisco.web.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Util {
	public List<String> getUrisAt(List<String> urls,int level){
		if(level<0) {
			return Arrays.asList();
		}
		List<String> urisAtgivenLevel = new LinkedList<String>();
		for(String url : urls) {
			urisAtgivenLevel.add(getUriAt(url, level));
		}
		return urisAtgivenLevel;
	}
	public String getUriAt(String url,int level) {
		StringBuffer uri = new StringBuffer("");
		String uris[] = url.split("/");
		int index = level+2;
		for(int i = 0;i<=index;i++) {
			uri = uri.append(uris[i]).append("/");
		}
		return uri.toString();
	}
}
