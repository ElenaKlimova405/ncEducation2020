package com.nc.autumn2020.solutions.lesson3;

public class Book {

    // обязательные поля
    private String title;
    private String author;
    private int numberOfPages;
    // необязательные поля
    private int price;
    private int year;
    private String city;

    private Book(Book.Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.numberOfPages = builder.numberOfPages;
        this.price = builder.price;
        this.year = builder.year;
        this.city = builder.city;
    }

    public String getTitle() {
        return title;
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

    public void setTitle(String title) {
        this.title = title;
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
        private String title;
        private String author;
        private int numberOfPages;
        // необязательные поля
        private int price = 0;
        private int year = 0;
        private String city = "unknown";

        /**
         * @param title
         * @param  author
         * @param numberOfPages
         */
        public Builder(String title, String author, int numberOfPages) {
            this.title = title;
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
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }
}
