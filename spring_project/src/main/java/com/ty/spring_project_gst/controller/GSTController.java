package com.ty.spring_project_gst.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_project_gst.dto.DelhiGST;
import com.ty.spring_project_gst.dto.GST;
import com.ty.spring_project_gst.dto.KarnatakaGST;
import com.ty.spring_project_gst.dto.TamilnaduGST;

public class GSTController {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("gstspring.xml");
		GST gst=context.getBean("karnataka",KarnatakaGST.class);
		gst.calculate();
		
		gst=context.getBean("tamilnadu",TamilnaduGST.class);
		gst.calculate();
		
		gst=context.getBean("delhi",DelhiGST.class);
		gst.calculate();
		
	}

}
