/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskk.management.system;

/**
 *
 * @author aisha
 */
public class Goal extends Task {
    private boolean isChecked;

    public Goal(String name, String desc) {
        super(name,desc);
        this.isChecked = false;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
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
        System.out.println("is checked? "+ isChecked);
    }
    
}
