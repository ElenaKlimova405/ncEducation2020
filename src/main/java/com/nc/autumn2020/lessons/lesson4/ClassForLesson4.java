package com.nc.autumn2020.lessons.lesson4;

class Main {
    public static void main(String[] args) {
      Cut cut = new Cut(new Point(0,0), new Point(1,1));
       System.out.println(cut.getName());



       /*  int[] a = {1,2,3};
        for (int b: a) {
            System.out.println(b);
        }*/
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

class Cut extends Figure{
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
}
