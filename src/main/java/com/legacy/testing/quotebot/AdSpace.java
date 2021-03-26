package com.legacy.testing.quotebot;

import com.legacy.testing.thirdparty.TechBlogs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AdSpace {

	private static Map<String, Collection<String>> cache = new HashMap<String, Collection<String>>();

	public static Collection<String> getAdSpaces() {
		if (cache.containsKey("blogs list")) {
			return cache.get("blogs list");
		}
		// FIXME : only return blogs that start with a 'T'
		Collection<String> listAllBlogs = TechBlogs.listAllBlogs();
		cache.put("blogs list", listAllBlogs);
		return listAllBlogs;
	}
}
