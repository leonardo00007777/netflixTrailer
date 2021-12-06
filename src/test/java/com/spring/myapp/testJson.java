package com.spring.myapp;

import java.util.ArrayList;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/****************************************************
* 
* Project : Test
***************************************************/
public class testJson {

	private ArrayList<HashMap<String, String>> list;
	private HashMap<String, String> map;

	public void testJson() {
		list = new ArrayList<HashMap<String, String>>();
		map = new HashMap<String, String>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		list.add(map);

		map = new HashMap<String, String>();
		map.put("aaa", "444");
		map.put("bbb", "555");
		map.put("ccc", "666");
		list.add(map);

		map = new HashMap<String, String>();
		map.put("aaa", "888");
		map.put("bbb", "999");
		map.put("ccc", "000");
		list.add(map);

		JSONObject jsonObjet = JSONObject.fromObject(map); //HashMap 속성을 json 객체로
		JSONArray jsonArray = JSONArray.fromObject(list); //ArrayList 속성을 json객체로
		System.out.println(jsonObjet);
		System.out.println(jsonArray);

	}

	public static void main(String[] args) {
		/*
		 * Json m = new Json(); m.testJson();
		 */
	}

}
