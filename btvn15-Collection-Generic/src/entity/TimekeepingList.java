package entity;

import logics.FactoryLogic;

import java.util.Arrays;
import java.util.List;

public class TimekeepingList {
    private Worker worker;
    private List<TimekeepingListDetail> details;

    public TimekeepingList(Worker worker, List<TimekeepingListDetail> details) {
        this.worker = worker;
        this.details = details;
    }

    @Override
    public String toString() {
        return "TimekeepingList{" +
                "worker=" + worker +
                ", details=" + details +
                '}';
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public List<TimekeepingListDetail> getDetails() {
        return details;
    }

    public void setDetails(List<TimekeepingListDetail> details) {
        this.details = details;
    }
}
