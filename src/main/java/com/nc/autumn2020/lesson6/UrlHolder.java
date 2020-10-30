package com.nc.autumn2020.lesson6;

public class UrlHolder {
    private String protocol;
    private String domain;
    private int port;
    private KeyValueParameter[] keyValueParameters;




    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setKeyValueParameters(KeyValueParameter[] keyValueParameters) {
        this.keyValueParameters = keyValueParameters;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public int getPort() {
        return port;
    }

    public KeyValueParameter[] getKeyValueParameters() {
        return keyValueParameters;
    }


    @Override
    public String toString() {
        //return native full url without Decoding
        return "UrlHolder{}";
    }
}
