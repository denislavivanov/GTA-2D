public class Player {
    String username;
    enum Person {
        Man1,
        Man2,
        Man3,
        Woman1,
        Woman2,
        Woman3
    }
    Person type;
    vector<Weapon> weapons;
    int speed;

    public Player(String username, Person type) {
        this.username = username;
        this.type = type;
    }
}