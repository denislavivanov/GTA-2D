import jdk.nashorn.api.tree.Tree;

import java.awt.*;
import java.util.TreeMap;

public class Main extends Canvas {

    public static void main(String[] args) {
        MapGenerator map = new MapGenerator();

        map.printOnlyMap(map.map);

    }

}
