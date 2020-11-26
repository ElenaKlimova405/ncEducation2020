package com.nc.autumn2020.solutions.lesson16;

import org.jetbrains.annotations.NotNull;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import java.util.*;
import java.util.concurrent.Semaphore;

public class HomeWork{
    private volatile Queue<Student> homeWork = new ArrayDeque<Student>();
    private volatile Map<Student, ArrayList<Grade>> journal = new TreeMap<>();

    public synchronized int getHomeWork(Teacher teacher) {
        int q = 2;
        while (homeWork.size() == 0 && ((q--) > 0)) {
            try {
                this.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (homeWork.size() == 0) {
            return 0;
        }

        try {
            Student homework = homeWork.poll();
            System.out.println("Учитель " + teacher + " получил д/з от " + homework);
            Random random = new Random();
            Grade grade = new Grade(random.nextInt() % 5 + 1, teacher);
            if (this.journal.containsKey(homework) && this.journal.get(homework).size() > 0) {
                this.journal.get(homework).add(grade);
            } else {
                ArrayList<Grade> grades = new ArrayList<>();
                grades.add(grade);
                this.journal.put(homework, grades);
            }
            System.out.println("Учитель " + teacher + " поставил студенту " + homework + " оценку " + grade);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            notifyAll();
        }

        return 1;
    }

    public synchronized void addHomeWork(Student homework) {
        while (homeWork.size() >= 3) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            homeWork.add(homework);
            System.out.println("Студент " + homework.toString() + " добавил д/з.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            notifyAll();
        }
    }

    public synchronized int getSize() {
        return homeWork.size();
    }

    public Map<Student, ArrayList<Grade>> getJournal() {
        return journal;
    }
}
