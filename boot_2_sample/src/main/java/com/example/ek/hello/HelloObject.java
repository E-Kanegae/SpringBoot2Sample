package com.example.ek.hello;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import org.springframework.util.ObjectUtils;
import lombok.Getter;

/**
 * Data Object for {@link HelloController}
 */
public class HelloObject {

	Charset charset = StandardCharsets.UTF_8;
	String algorithm = "SHA-512";

	/**
	 * Constructor
	 * @param id
	 */
	public HelloObject(Integer id) {
		if(ObjectUtils.isEmpty(id)) {
			id = 0;
		}
		this.id = id;
		
		byte[] bytes;
		try {
			bytes = MessageDigest.getInstance(algorithm)
					.digest((id.toString().getBytes(charset)));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			bytes = new byte[0];
		}
		String result = DatatypeConverter.printHexBinary(bytes);
		
		this.name = result;
		this.mail = result + "@com.example.ek";
	}
	
	@Getter
	private Integer id;
	@Getter
	private String name;
	@Getter
	private String mail;

}
