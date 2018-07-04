package com.mock.server.core.domain;

import java.io.Serializable;

public class ServerInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3147273335119373959L;

	private int ServerId;
	private String servierIp;
	private int serverPort;
	private String basePath;
	private String protocol;

	public int getServerId() {
		return ServerId;
	}

	public void setServerId(int serverId) {
		ServerId = serverId;
	}

	public String getServierIp() {
		return servierIp;
	}

	public void setServierIp(String servierIp) {
		this.servierIp = servierIp;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return "ServerId:" + this.ServerId+"servierIp:" + this.servierIp+"serverPort:" + this.serverPort+"basePath:" + this.basePath+"protocol:" + this.protocol;
	}

}
