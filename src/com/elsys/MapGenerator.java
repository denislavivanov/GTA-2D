import javax.swing.*;
import java.util.Random;
import java.util.TreeMap;


public class MapGenerator {
    TreeMap<Coordinates, Character> originalMap;
    TreeMap<Coordinates, Character> map;

    public MapGenerator() {
        map = new TreeMap<Coordinates, Character>();
        originalMap = new TreeMap<Coordinates, Character>();

        for (int i = 0; i < 64; i++) {
            for(int j = 0; j < 64; j++) {
                map.put(new Coordinates(i, j), ' ');
            }
        }
        StreetGenerator streets = new StreetGenerator(map);

        SmallHouses smallHouses1 = new SmallHouses("Small Houses", map, 1);
        TowerBlock towerBlock1 = new TowerBlock("Tower", map, 1);
        Supermarket supermarket = new Supermarket("Billa", map);

        SmallHouses smallHouses2 = new SmallHouses("Small Houses2", map, 2);
        SkyscraperGenerator skyscraper = new SkyscraperGenerator("Skyscraper", map);
        Mall mall = new Mall("Mall", map);



        SmallHouses smallHouses3 = new SmallHouses("Small Houses3", map, 3);
        TowerBlock towerBlock2 = new TowerBlock("Tower", map, 2);
        ClothingStore clothingStore = new ClothingStore("ClothingStore", map);

        //Weapon weapons = new Weapon("Op", map);
        /*
        Knife knife = new Knife(map);
        Pistol pistol = new Pistol(map);
        AK47 ak47 = new AK47(map);
        RocketLauncher rocketLauncher = new RocketLauncher(map);

        //this.printOnlyMap(map);
        */
        for(int column = 0; column <= 63; column++){
            for(int row = 0; row <= 63; row++){
                this.originalMap.put(new Coordinates(column, row), this.map.get(new Coordinates(column, row)));
                //System.out.printf("%c", this.map.get(new Coordinates(column, row)));
            }
            //System.out.printf("\n");
        }


        //originalMap = map;
        //this.printOnlyMap(map);
        //System.out.printf("\n");

    }

    public int getRand(int randomRange) {
        Random rand = new Random();
        return rand.nextInt(randomRange);
    }

    public void printOnlyMap(TreeMap<Coordinates, Character> map){
        for(int column = 0; column < 64; column++){
            for(int row = 0; row < 64; row++){
                System.out.printf("%c", map.get(new Coordinates(column, row)));
            }
            System.out.printf("\n");
        }
    }

    public void printMap(TreeMap<Coordinates, Character> map, Player player){
        int column = (int)player.Position.y - 5;
        int row = (int)player.Position.x - 5;
        int printableX = 11, printableY = 11;

        for(int count = 0; count < printableY; count++, column++){

            for(int count2 = 0, my_row = row; count2 < printableX; count2++, my_row++){
                if(map.get(new Coordinates(column, my_row)) == null){
                    System.out.printf("#");
                } else{
                    System.out.printf("%c", map.get(new Coordinates(column, my_row)));
                }
            }
            System.out.printf("\n");
        }
    }
    /*
    public TreeMap<Coordinates, Character> returnMap(Player player){
        int column = player.current_position.y - 5;
        int row = player.current_position.x - 5;
        int printableX = 11, printableY = 11;

        TreeMap<Coordinates, Character> my_map = new TreeMap<Coordinates, Character>();

        for(int count = 0; count < printableY; count++, column++){

            for(int count2 = 0, my_row = row; count2 < printableX; count2++, my_row++){
                if(map.get(new Coordinates(column, my_row)) == null){
                    my_map.put(new Coordinates(count, count2), '#');
                    //System.out.printf("#");
                } else{
                    if(map.get(new Coordinates(column, my_row)) == '*'){
                        my_map.put(new Coordinates(count, count2), originalMap.get(new Coordinates(column, my_row)));
                    } else {
                        my_map.put(new Coordinates(count, count2), map.get(new Coordinates(column, my_row)));
                    }
                }
            }
            //System.out.printf("\n");
        }

        return my_map;
    }
    */
    public TreeMap<Coordinates, Character> returnMap(Player player) {
        int X = (int)player.Position.x - 5;
        int Y = (int)player.Position.y - 5;
        int printableX = 11, printableY = 11;

        TreeMap<Coordinates, Character> temp = new TreeMap<Coordinates, Character>();

        if(X < 0)
            X = 0;

        if(Y < 0)
            Y = 0;
        
        if(X + printableX > 64)
            X = 64 - printableX;
        
        if(Y + printableY > 64)
            Y = 64 - printableY;

        for(int row = Y; row < Y + printableY; row++) {
            for(int column = X; column < X + printableX; column++) {
                temp.put(new Coordinates(column - X, row - Y), map.get(new Coordinates(row, column)));
            }
        }

        return temp;
    }
}
