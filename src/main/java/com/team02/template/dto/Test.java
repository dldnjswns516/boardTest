package com.team02.template.dto;

public class Test {
	
	private String testString;
	private int testInteger;
	private boolean testBoolean;
	private String testNull;
	
	public String getTestNull() {
		return testNull;
	}
	public void setTestNull(String testNull) {
		this.testNull = testNull;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public int getTestInteger() {
		return testInteger;
	}
	public void setTestInteger(int testInteger) {
		this.testInteger = testInteger;
	}
	public boolean isTestBoolean() {
		return testBoolean;
	}
	public void setTestBoolean(boolean testBoolean) {
		this.testBoolean = testBoolean;
	}
	@Override
	public String toString() {
		return "Test [testString=" + testString + ", testInteger=" + testInteger + ", testBoolean=" + testBoolean
				+ ", testNull=" + testNull + "]";
	}
	
	
	
	

}
