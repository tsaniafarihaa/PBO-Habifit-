/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskk.management.system;

/**
 *
 * @author aisha
 */
public abstract class Task {
    protected String name;
    protected String desc;

    public Task(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    
    public abstract void info();
}
