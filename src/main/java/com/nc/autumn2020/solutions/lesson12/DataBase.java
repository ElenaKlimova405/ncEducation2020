package com.nc.autumn2020.solutions.lesson12;

class DataBase {
    @PropertyValue(value = "${user.name}")
    private String userName;
    @PropertyValue(value = "${user.password}")
    private String userPassword;
    @PropertyValue(value = "${database.name}")
    private String dataBaseName;


    @PropertyObjectValue("${custom.class}")
    private CustomObject customObject;

    public DataBase() {
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", dataBaseName='" + dataBaseName + '\'' +
                '}';
    }
}