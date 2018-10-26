package com.example.demoaws.dtos;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class OutputContexts implements Serializable {
	private String name;
	private Integer lifespanCount;
	private Map<String, String> parameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLifespanCount() {
		return lifespanCount;
	}

	public void setLifespanCount(Integer lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "OutputContexts [name=" + name + ", lifespanCount=" + lifespanCount + ", parameters=" + parameters + "]";
	}
	
	

}
