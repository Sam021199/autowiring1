package com.demo.component.autowiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Associate {
	private int aid;
	private String aname;
	private String arole;
	
	//associate class is dependent on the desktop class
	//if autowired is not specified then it will give nullpointerexception
	@Autowired
	private Desktop desktop;
	
	
	public Desktop getDesktop() {
		return desktop;
	}


	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}


	public Associate() {
		super();
		System.out.println("Object created successfully!!!");
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getArole() {
		return arole;
	}
	public void setArole(String arole) {
		this.arole = arole;
	}


	public void show() {
		// TODO Auto-generated method stub
		System.out.println("done!!");
		desktop.compile();
		
	}
	

}
