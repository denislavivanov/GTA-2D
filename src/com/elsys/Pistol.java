import java.util.TreeMap;

public class Pistol extends Weapon{

    public Pistol(TreeMap<Coordinates, Character> map){
        super("Pistol", 64);
        this.spawnWeapon(map, '2');
    }
    public Pistol(){
        super("Pistol", 64);
    }
}
