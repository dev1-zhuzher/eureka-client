package com.vanke.client.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@RequestMapping(value="/admin")
	public String test(){
		String temp = "";
		for(int i = 0; i < 10 ; i++){
			if(i % 2 == 1){
				temp = temp+i+"";
			}
		}
		return temp;
	}
}
