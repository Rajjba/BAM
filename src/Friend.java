public class Friend {
    String name = "A friend";
    int hp;
    boolean isFriend = true;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, boolean isFriend){
        this.name = name;
        this.isFriend = isFriend;
    }

    public int GetHP(){
        return hp;
    }
    public void SetHP(int hp){
        this.hp = hp;
    }
    public void DMG(int DMG){
        this.hp = hp-DMG;
    }
}
