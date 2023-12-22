/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskk.management.system;

/**
 *
 * @author aisha
 */
public class Habit extends Task{
    private String frequency;

    public Habit(String name,String desc, String frequency) {
        super(name,desc);
        this.frequency = frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }
    
    public void info(){
        System.out.println(name);
        System.out.println("Frequency: "+ frequency);
    }
    
    
}
