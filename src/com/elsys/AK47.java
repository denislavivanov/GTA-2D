import java.util.TreeMap;

public class AK47 extends Weapon{

    public AK47(TreeMap<Coordinates, Character> map){
        super("AK47", 128);
        this.spawnWeapon(map, '3');
    }
    public AK47(){
        super("AK47", 128);
    }
}
