public class SafeHouse extends NormalLoc{
    SafeHouse(Player player){
        super(player,"Guvenli ev");
    }

    public boolean getLocation() {
        player.setHealthy(player.getReHealty());
        System.out.println("İyileştiniz...");
        System.out.println("Şuan Güvenli Ev adlı yerdesiniz..");
        return true;
    }
}
