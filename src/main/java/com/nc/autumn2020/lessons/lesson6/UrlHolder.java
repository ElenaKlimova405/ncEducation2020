package com.nc.autumn2020.lessons.lesson6;

import java.util.ArrayList;

public class UrlHolder {
    private String protocol;
    private String domain;
    private int port = -1;
    private String address;
    private ArrayList<KeyValueParameter> keyValueParameters;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<KeyValueParameter> getKeyValueParameters() {
        return keyValueParameters;
    }

    public void setKeyValueParameters(ArrayList<KeyValueParameter> keyValueParameters) {
        this.keyValueParameters = keyValueParameters;
    }

    @Override
    public String toString() {
        //return native full url without Decoding

        if (this.protocol == null) {
            return "Протокол не должен быть равен null";
        }

        if (this.domain == null) {
            return "Домен не должен быть равен null";
        }

        /*if (this.address == null) {
            return "Адрес не должен быть равен null";
        }*/


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UrlHolder{protocol=");
        stringBuilder.append(this.protocol);
        stringBuilder.append("; domain=");
        stringBuilder.append(this.domain);
        stringBuilder.append("; port=");
        stringBuilder.append(this.port != -1 ? this.port : "null");
        stringBuilder.append("; address=");
        stringBuilder.append(this.address != null ? this.address : "null");

        if (this.keyValueParameters != null && this.keyValueParameters.size() > 0) {
            stringBuilder.append("; ");
            for (int i = 0; i < this.keyValueParameters.size(); i++) {
                stringBuilder.append("Key=");
                stringBuilder.append(this.keyValueParameters.get(i).getKey());
                stringBuilder.append(", ");
                stringBuilder.append("Value=");
                stringBuilder.append(this.keyValueParameters.get(i).getValue());
                if (i < this.keyValueParameters.size() - 1) {
                    stringBuilder.append("; ");
                }
            }
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}