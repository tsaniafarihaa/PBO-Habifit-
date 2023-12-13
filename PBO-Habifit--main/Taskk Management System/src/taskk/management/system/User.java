/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskk.management.system;

/**
 *
 * @author aisha
 */
public class User {
    private static int userCounter = 0;
    private int userId;
    private String username;
    private String password;
    private boolean isLoggedIn;
    
    private SimpleTask[] simpleTaskList;
    private int simpleCount = 0;
    
    private Habit[] habitList;
    private int habitCount = 0;
    
    private Goal[] goalList;
    private int goalCount = 0;

    public User(String username, String password) {
        this.userId = ++userCounter;
        this.username = username;
        this.simpleTaskList = new SimpleTask[100];
        this.habitList = new Habit[100];
        this.goalList = new Goal[100];
        this.password = password;
        this.isLoggedIn = false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    public void login(){
        this.isLoggedIn = true;
    }
    
    public void logout(){
        this.isLoggedIn = false;
    }
    
    public void addSimpleTask(SimpleTask simpleTask){
        simpleTaskList[simpleCount] = simpleTask;
        simpleCount++;
    }
    
    public void removeSimpleTask(String name) {
        for (int i = 0; i < simpleCount; i++) {
            if (simpleTaskList[i] != null && simpleTaskList[i].getName().equals(name)) {
                // Shift elements to fill the gap
                for (int j = i; j < simpleCount - 1; j++) {
                    simpleTaskList[j] = simpleTaskList[j + 1];
                }
                // Set the last element to null and decrement count
                simpleTaskList[simpleCount - 1] = null;
                simpleCount--;
                break; // Exit the loop after the task is removed
            }
        }
    }
    
    public void checkTask(String name){
        for (int i = 0; i < simpleCount; i++) {
            if (simpleTaskList[i] != null && simpleTaskList[i].getName().equals(name)) {
                simpleTaskList[i].check();
            }
        }
    }
    
    public void unCheckTask(String name){
        for (int i = 0; i < simpleCount; i++) {
            if (simpleTaskList[i] != null && simpleTaskList[i].getName().equals(name)) {
                simpleTaskList[i].unCheck();
            }
        }
    }
    
    public void addHabit(Habit habit){
        habitList[habitCount] = habit;
        habitCount++;
    }
    
    public void removeHabit(String name){
        for (int i = 0; i < habitCount; i++) {
            if (habitList[i] != null && habitList[i].getName().equals(name)) {
                // Shift elements to fill the gap
                for (int j = i; j < habitCount - 1; j++) {
                    habitList[j] = habitList[j + 1];
                }
                // Set the last element to null and decrement count
                habitList[habitCount - 1] = null;
                habitCount--;
                break; // Exit the loop after the task is removed
            }
        }
    }
    
    public void addGoal(Goal goal){
        goalList[goalCount] = goal;
        goalCount++;
    }
    
    public void removeGoal(String name){
        for (int i = 0; i < goalCount; i++) {
            if (goalList[i] != null && goalList[i].getName().equals(name)) {
                // Shift elements to fill the gap
                for (int j = i; j < goalCount - 1; j++) {
                    goalList[j] = goalList[j + 1];
                }
                // Set the last element to null and decrement count
                goalList[goalCount - 1] = null;
                goalCount--;
                break; // Exit the loop after the task is removed
            }
        }
    }
    
    public void checkGoal(String name){
        for (int i = 0; i < goalCount; i++) {
            if (goalList[i] != null && goalList[i].getName().equals(name)) {
                goalList[i].check();
            }
        }
    }
    
    public void unCheckGoal(String name){
        for (int i = 0; i < goalCount; i++) {
            if (goalList[i] != null && goalList[i].getName().equals(name)) {
                goalList[i].unCheck();
            }
        }
    }
    
    public void getSimpleTask(){
        System.out.println("========== Task List ==========");
        for (int i = 0; i < simpleCount; i++) {
            simpleTaskList[i].info();
            System.out.println("");
        }
    }
    
    public void getHabit(){
        System.out.println("========== Habit List ==========");
        for (int i = 0; i < habitCount; i++) {
            habitList[i].info();
            System.out.println("");
        }
    }
    
    public void getGoal(){
        System.out.println("========== Goal List ==========");
        for (int i = 0; i < goalCount; i++) {
            goalList[i].info();
            System.out.println("");
        }
    }
    
}
