package com.edureka.springAopProject;

public class CustomerService {
	
	private String name;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Customer Name : "+this.name);
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printURL() {
		System.out.println("Customer URL : "+this.url);
	}
	
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", url=" + url + "]";
	}
	
	
	  public void printThrowException() { throw new IllegalArgumentException(); }
	 
	
}
