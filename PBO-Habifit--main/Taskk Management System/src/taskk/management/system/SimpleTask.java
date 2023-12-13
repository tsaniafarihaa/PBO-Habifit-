/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskk.management.system;

/**
 *
 * @author aisha
 */
public class SimpleTask extends Task implements Check{
    private String dueDate;
    private String priority;
    private boolean isChecked;

    public SimpleTask(String name, String dueDate, String priority) {
        super(name);
        this.dueDate = dueDate;
        this.priority = priority;
        this.isChecked = false;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }
    
    public void check(){
        this.isChecked = true;
    }
    
    public void unCheck(){
        this.isChecked = false;
    }
    
    public void info(){
        System.out.println(name);
        System.out.println("Due Date: "+ dueDate);
        System.out.println("Priority: " + priority);
        System.out.println("is checked? " + isChecked);
    }
    
}
