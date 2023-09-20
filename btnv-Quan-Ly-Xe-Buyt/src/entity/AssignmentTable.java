package entity;

import java.util.Arrays;

public class AssignmentTable {
    private Driver driver;
    private AssignmentTableBorrow[] details;

    public AssignmentTable(Driver driver, AssignmentTableBorrow[] details) {
        this.driver = driver;
        this.details = details;
    }

    @Override
    public String toString() {
        return "AssignmentTable{" +
                "driver=" + driver +
                ", details=" + Arrays.toString(details) +
                '}';
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public AssignmentTableBorrow[] getDetails() {
        return details;
    }

    public void setDetails(AssignmentTableBorrow[] details) {
        this.details = details;
    }
}
