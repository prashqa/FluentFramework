package com.project.pages;

public enum Title {
	
	MR("mr"),
	MS("ms"),
	MRS("mrs");
	
	private String value;
	
	Title(String value) {
		this.value = value;
	}
	
	 @Override
	    public String toString(){
	        return value;
	    }
	

}
