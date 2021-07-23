package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel workerLevel;
    private double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // do not include on constructor, but it have to be initialized

    public Worker() {

    }

    public Worker(String name, WorkerLevel workerLevel, double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) { // add contracts to list
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) { // remove contracts from list
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c : contracts) {
            calendar.setTime(c.getDate());
            int cYear = calendar.get(Calendar.YEAR);
            int cMonth = 1 + calendar.get(Calendar.MONTH);
            if (year == cYear && month == cMonth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // set is not used for contracts
    public List<HourContract> getContracts() {
        return contracts;
    }

}
