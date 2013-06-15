package design.pattern.bridge.a1.after;

public class Main {
    public static void main(String[] args) {
        /*
         * http://howard-lyrics.blogspot.hk/2011/04/design-pattern-bridge.html
         * 
         * bridge pattern是用來設計編譯時期的結構，
         * strategy是用來設計執行時期的行為。
         * 
         * 以此例來說，使用何種版本的android platform，是在編譯時期就決定好的，
         * 不會在執行的時候才決定要用froyo或gingerbread，
         */
                
        Platform froyo = new Froyo();        
        Platform gingerbread = new Gingerbread();
        
        AngryBee ffv = new FreeVersion(froyo);
        AngryBee fxv = new XmasVersion(froyo);
        AngryBee gfv = new FreeVersion(gingerbread);
        AngryBee gxv = new XmasVersion(gingerbread);
        
        ffv.play();
        fxv.play();
        gfv.play();
        gxv.play();
    }
}
