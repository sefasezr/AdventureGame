public abstract class NormalLoc extends Location {

    NormalLoc(Player player, String name) {
        super(player);
        super.name = name;
    }
    public boolean getLocation(){
        return true;
    }
}
