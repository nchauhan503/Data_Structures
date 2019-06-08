package com.List;

public class EmployeeDoubleNode {
    private Employee employee;
    private EmployeeDoubleNode next;
    private EmployeeDoubleNode previous;

    public EmployeeDoubleNode(Employee employee){
        this.employee = employee;
    }


    public void setNext(EmployeeDoubleNode next){
        this.next = next;
    }

    public EmployeeDoubleNode getNext(){
        return this.next;
    }

    public void setPrevious(EmployeeDoubleNode previous){
        this.previous = previous;
    }

    public EmployeeDoubleNode getPrevious(){
        return this.previous;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee(){
        return this.employee;
    }



}
