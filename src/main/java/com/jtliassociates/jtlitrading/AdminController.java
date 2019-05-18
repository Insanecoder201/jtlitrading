package com.jtliassociates.jtlitrading;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jtliassociates.jtlitrading.model.AdminInfo;
import com.jtliassociates.jtlitrading.model.CallInfo;
import com.jtliassociates.jtlitrading.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService service;

	@RequestMapping("/admin")
	public String showAdmin() {
		return "Admin";
	}
	
	@RequestMapping("/adminedition")
	public String enterCallInfo() {
		return "Adminedition";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String validateCredentials(ModelMap map, @RequestParam String email, @RequestParam String password) {
		
		List<AdminInfo> list = service.getAllAdmin();
		long count = list.stream()
						 .filter(x -> x.getUsername().equals(email) && x.getPassword().equals(getMD5EncryptedValue(password)))
						 .count();
		if(count > 0){
			return "Adminedition";
		}
		map.put("errorMessage", "Invalid credentials");
		return "Admin";
	}
	
	@RequestMapping(value="/adminedition", method=RequestMethod.POST)
	public String insertCallInfo(ModelMap map, @RequestParam(value="intraday", required=false) String intraday, @RequestParam(name="shortterm", required=false) String shortterm, @RequestParam(name="longterm", required=false) String longterm) {
		
		CallInfo info = new CallInfo();
		info.setCallDate(LocalDateTime.now());
		if(!StringUtils.isEmpty(intraday)) {
			info.setCallInfo(intraday);
			info.setCallType("I");
			service.insertCallInfo(info);
			map.put("intradaymessage", "Your intraday calls are saved..!");
		}
		if(!StringUtils.isEmpty(shortterm)) {
			info.setCallInfo(shortterm);
			info.setCallType("S");
			service.insertCallInfo(info);
			map.put("shorttermmessage", "Your short term calls are saved..!");
		}
		if(!StringUtils.isEmpty(longterm)) {
			info.setCallInfo(longterm);
			info.setCallType("L");
			service.insertCallInfo(info);
			map.put("longtermmessage", "Your long term calls are saved..!");
		}
		
		
		
		return "Adminedition";
		
	}
	
	
	public static String getMD5EncryptedValue(String password) {
        final byte[] defaultBytes = password.getBytes();
        try {
            final MessageDigest md5MsgDigest = MessageDigest.getInstance("MD5");
            md5MsgDigest.reset();
            md5MsgDigest.update(defaultBytes);
            final byte messageDigest[] = md5MsgDigest.digest();
            final StringBuffer hexString = new StringBuffer();
            for (final byte element : messageDigest) {
                final String hex = Integer.toHexString(0xFF & element);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            password = hexString + "";
        } catch (final NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return password;
    }
}
