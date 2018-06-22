package com.ground.dating.starter.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ground.dating.starter.jdbc.ExportsIPBean;
import com.ground.dating.starter.jdbc.ExportsJDBC_BS;
import com.ground.dating.starter.jdbc.ExportsOPBean;
import com.ground.dating.starter.jdbc.GDException;

@RestController
public class HelloController {
	
	@Autowired
	ExportsJDBC_BS exportsJDBC_BS;

	

	
	@CrossOrigin
	@RequestMapping(value="/hello", 
			method=RequestMethod.GET
			, produces = "application/json"
			)
	public List<User> sayHi() {
		
		ExportsIPBean bean = new ExportsIPBean();
		ExportsOPBean opBean = null;
		try {
			opBean= exportsJDBC_BS.getLoginList(bean);
		} catch (GDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        opBean.toString();
		return Arrays.asList(new User(100, "kkkkk"), new User(200,"mm1111"));
	}
	
	
	
	
	
	
	
}
