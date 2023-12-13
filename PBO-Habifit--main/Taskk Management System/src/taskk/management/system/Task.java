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

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract void info();
}
