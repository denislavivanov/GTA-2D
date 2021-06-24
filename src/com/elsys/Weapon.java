import java.util.Random;
import java.util.TreeMap;

public abstract class Weapon implements CollisionFree{
    String name;
    int capacity;

    public Weapon(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void spawnWeapon(TreeMap<Coordinates, Character> map, Character weaponType){
        int column, row;
        column = getRand(64);
        row = getRand(64);

        while(map.get(new Coordinates(column, row)) != 'p'){
            column = getRand(64);
            row = getRand(64);
        }
        map.put(new Coordinates(column, row), weaponType);
    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

}