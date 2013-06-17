package design.pattern.memento.a1;

public class Main {
    public static void main(String[] args) { 
        RPGGame game = new RPGGame();
        
        Warrior w = new Warrior("John", 100, 80);
        w.attack();
        w.show();
        game.save("2013-06-15", w.createSave());
        
        w.attackBoss();
        w.show();
        game.save("2013-06-16", w.createSave());
        
        w.restore(game.getRecord("2013-06-15"));
        w.show();
    }
}
