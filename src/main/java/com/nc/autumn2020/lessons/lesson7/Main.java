package com.nc.autumn2020.lessons.lesson7;

import java.util.Objects;

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
      /*Cut cut = new Cut(new Point(0,0), new Point(1,1));
       System.out.println(cut.getName());
        */


       /*  int[] a = {1,2,3};
        for (int b: a) {
            System.out.println(b);
        }*/

       /* Human pete = new Human(1, 'm', "Pete");
        Human kate = new Human(1, 'f', "Kate");
        /*kate.setParent(pete);
        pete.setParent(kate);

        System.out.println(pete.equals(kate));

        Student studentPete = new Student(1, 'm', "Pete");
*/

        //Human copyPete = new Human(pete);



        /*
        Human human = new Human(1, 'm', "Pete");


        System.out.println(human.clone());

        */


        /*for (int i = 0; i < 2000000; i++) {
            new Human(1, 'm', "Pete");

        }*/


        try {
            Object obj = null;
            obj.equals(obj);
        } catch (Throwable throwable) {
            System.out.println(throwable);
        } finally {

        }


    }
}


class A {

}

abstract class Figure /*extends A  -  можно, но не надо*/ {
    protected String name;

    {
        System.out.println("1");
    }

    public Figure(String name) {
        System.out.println("2");
    }

    public String getName() {
        return name;
    }

    public abstract Point[] getPoints(); // можно удалить


}

class Square extends Figure {
    private Point topLeft, topRight, lowLeft, lowRight;

    public Square(String name) {
        super(name);
    }


    @Override
    public Point[] getPoints() {
        return new Point[0];
    }
}

class Cut extends Figure {
    Point start, end;
    private String name;

    {
        System.out.println("3");
    }

    public Cut(Point start, Point end) {
        super("figure");
        System.out.println("4");
        this.name = "Cut";
        this.start = start;
        this.end = end;
    }

    @Override
    public String getName() {
        return name;
    }

    public Point[] getPoints() {
        return new Point[]{start, end};
    }

    @Override
    public String toString() {
        return "Cut{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Student extends Human implements Cloneable{

    public Student(int id, char gender, String name) {
        super(id, gender, name);
    }

    public Student(int id, char gender, String name, Human parent) {
        super(id, gender, name, parent);
    }

    public Student(Human human) {
        super(human);
    }

    /*@Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Human)) {
            return false;
        }

        Human human = (Human)obj;

        System.out.println(this.getParent() + " " + human.setParent(););
        System.out.println(this.getName() + " " + human.getName());
        return this.getId() == human.getId()
                && this.getGender() == human.getGender()
                && Objects.equals(this.getName(), human.getName())
                && Objects.equals(this.getParent(), human.getParent());


    }*/



}

class Human {
    // поля
    private int id;
    private char gender;
    private String name;
    private Human parent;


    // конструкторы
    private Human(int id, char gender) {
        if (id<0) {
            throw new RuntimeException();
        }
        this.id = id;
        this.gender = gender;
    }

    public Human(int id, char gender, String name) {
        if (id<0) {
            throw new RuntimeException();
        }
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public Human(int id, char gender, String name, Human parent) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.parent = parent;
    }
    public Human(Human human) {
        this.id = human.id;
        this.gender = human.gender;
        this.name = human.name;
        this.parent = human.parent;
    }

    public Human getParent() {
        if (this.parent == null) {
            return null;
        }
        return new Human(this.parent);
    }

    public void setParent(Human parent) {
        if (parent == null) {
            return;
        }
        this.parent = new Human(parent);
    }

    // всё остальное
    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
    Законы де Моргана
    транз
    симм
    рефл

    не пробрасывать исключение
     */

    /*@Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Human human = (Human)obj;

        System.out.println(this.parent + " " + human.parent);
        System.out.println(this.name + " " + human.name);
        return this.id == human.id
                && this.gender == human.gender
                && Objects.equals(this.name, human.name)
                && Objects.equals(this.parent, human.parent);


    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id &&
                gender == human.gender &&
                Objects.equals(name, human.name) &&
                Objects.equals(parent, human.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender, name, parent);
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", parent=" + parent +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() {
        System.out.println("Destroy");
    }
}
