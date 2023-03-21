package com.github.hadesfranklyn.project;

public class HelloDocker {

	private final String content;
	private final String enviroment;

	public HelloDocker(String content, String enviroment) {
		this.content = content;
		this.enviroment = enviroment;
	}

	public String getContent() {
		return content;
	}

	public String getEnviroment() {
		return enviroment;
	}

}
