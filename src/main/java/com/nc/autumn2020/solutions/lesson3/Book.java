package com.nc.autumn2020.solutions.lesson3;

public class Book {

    // обязательные поля
    String tittle;
    String author;
    int numberOfPages;
    // необязательные поля
    int price;
    int year;
    String city;

    private Book(Book.Builder builder) {
        this.tittle = builder.tittle;
        this.author = builder.author;
        this.numberOfPages = builder.numberOfPages;
        this.price = builder.price;
        this.year = builder.year;
        this.city = builder.city;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static class Builder {
        // обязательные поля
        String tittle;
        String author;
        int numberOfPages;
        // необязательные поля
        int price = 0;
        int year = 0;
        String city = "unknown";

        /**
         * @param tittle
         * @param  author
         * @param numberOfPages
         */
        public Builder(String tittle, String author, int numberOfPages) {
            this.tittle = tittle;
            this.author = author;
            this.numberOfPages = numberOfPages;
        }

        public Builder price(short price) {
            this.price = price;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }
}
