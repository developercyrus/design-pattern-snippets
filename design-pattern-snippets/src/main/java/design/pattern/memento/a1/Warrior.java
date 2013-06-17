package design.pattern.memento.a1;

import java.util.Random;

public class Warrior {
    private String name; 
    private int hp;
    private int mp;

    public Warrior(String name, int hp, int mp) { 
        this.name = name;
        this.hp = hp; 
        this.mp = mp;
    }

    public void attack() {
        Random r = new Random();        
        this.hp -= r.nextInt(6) + 5;
        this.mp -= r.nextInt(6) + 5;
    }
    
    public void attackBoss() {
        Random r = new Random();        
        this.hp -= r.nextInt(6) + 100;
        this.mp -= r.nextInt(6) + 100;
    }
    
    public Record createSave() { 
        return new Record(this.name, this.hp, this.mp); 
    }
    
    public void restore(Record s) { 
        this.name = s.getName(); 
        this.hp = s.getHp(); 
        this.mp = s.getMp();
    }
    
    public void show() {
        System.out.println("name=" + name + "; hp=" + hp + "; mp=" + mp);
    }
    
}
