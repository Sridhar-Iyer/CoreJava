package enums;



public class EnumExample {

    enum Directions {EAST, WEST, NORTH, SOUTH}

    public static void main(String[] args) {

        Directions direction = Directions.EAST;

        direction = Directions.SOUTH;

        System.out.println(direction.name());

        System.out.println(new StaticFinalExample().getDirection(3));
    }
}

class StaticFinalExample {

    public static final int EAST = 1;
    int directions = 0;
    int getDirection(int direction ) {
        if(direction == 1) directions = EAST;
        return directions;
    }
}
