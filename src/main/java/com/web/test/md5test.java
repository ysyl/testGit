package com.web.test;

import org.apache.shiro.crypto.hash.SimpleHash;

public class md5test {

	public static void main(String[] args) {
		String hashAlgorithmName = "MD5";//加密方式  
	    Object crdentials = "123456";//密码原值  
	    Object salt = null;//盐值  
	    int hashIterations = 1024;//加密1024次  
	    Object result = new SimpleHash(hashAlgorithmName,crdentials,salt,hashIterations);  
	    System.out.println(result);  

	}
}
