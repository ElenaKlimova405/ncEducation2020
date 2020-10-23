package com.nc.autumn2020.lesson3;

public class Human {

    // обязательные
    private String firstName;
    private String lastName;
    private long id;

    // необязательные
    private short age;
    private String gender;
    private String job;

    private Human(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.id = builder.id;
        this.gender = builder.gender;
        this.job = builder.job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public short getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getJob() {
        return job;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static class Builder {
        // обязательные
        private String firstName;
        private String lastName;
        private long id;

        // необязательные
        private short age = 0;
        private String gender = "unknown";
        private String job = "no job";

        /**
         * @param firstName
         * @param  lastName
         * @param id
         */
        public Builder(String firstName, String lastName, long id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public Builder age(short age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }


        public Human build() {
            return new Human(this);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
