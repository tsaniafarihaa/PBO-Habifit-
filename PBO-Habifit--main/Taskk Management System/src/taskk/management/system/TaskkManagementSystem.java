/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package taskk.management.system;


public class TaskkManagementSystem {
    public static void main(String[] args) {
        User u1 = new User("John Doe","devicantik");
        
        u1.login();
        
        u1.addSimpleTask(new SimpleTask("Tugas PBO Class Diagram","05-11-2023","High"));
        u1.addSimpleTask(new SimpleTask("Quiz Sister","04-11-2023","Medium"));
        u1.getSimpleTask();
        
        u1.removeSimpleTask("Tugas PBO Class Diagram");
        u1.getSimpleTask();
        
        u1.addHabit(new Habit("Gym","Weekly"));
        u1.addHabit(new Habit("Belajar ngoding","Daily"));
        u1.getHabit();
        
        u1.removeHabit("Belajar ngoding");
        u1.getHabit();
        
        u1.addGoal(new Goal("Belajar buat CLO sister"));
        u1.addGoal(new Goal("Menang lomba kentut"));
        u1.getGoal();
        
        u1.removeGoal("Belajar buat CLO sister");
        u1.getGoal();
        
        u1.checkGoal("Menang lomba kentut");
        u1.getGoal();
        
        u1.checkTask("Quiz Sister");
        u1.getSimpleTask();
        
    }

}
