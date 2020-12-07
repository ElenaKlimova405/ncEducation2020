package com.nc.autumn2020.lessons.lesson22.Task2;

import java.util.ArrayList;

public class Field {
    private ArrayList<Worker> workers = new ArrayList<>();
    private int plowingPercentage = 0;

    public Worker removeOneWorker() {
        if (workers.size() == 0)
            return null;
        return workers.remove(workers.size()-1);
    }

    public Worker removeWorker(Worker worker) {
        if (workers.size() > 0 && workers.remove(worker))
            return worker;
        return null;
    }

    public ArrayList<Worker> removeWorkers() {
        ArrayList<Worker> arrayList = new ArrayList<>(this.workers);
        workers.clear();
        System.out.println("Все рабочие ушли домой");
        return arrayList;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    private void addPlowingPercentage(int amountOfWork) {
        System.out.println("Рабочий может вспахать +" + amountOfWork);
        this.plowingPercentage += amountOfWork;

        if (this.plowingPercentage > 100) {
            this.plowingPercentage = 100;
            System.out.println("Поле вспахано, больше не надо работать!");
        } else {
            System.out.println("Всего вспахано:" + this.plowingPercentage);
        }
    }

    public void bePlowed() {
        for (Worker worker : this.workers) {
            this.addPlowingPercentage(worker.getAmountOfWork());
        }
    }

}
