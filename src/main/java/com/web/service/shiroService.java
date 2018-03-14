package com.web.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class shiroService {
	
	public void testMethod(){  
        System.out.println("testMethod，time:"  
                +new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new  Date()));  
    } 

}
