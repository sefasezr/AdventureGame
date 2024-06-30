public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;

    BattleLoc(Player player,String name,Obstacle obstacle) {
        super(player);
        super.name = name;
        this.obstacle = obstacle;
    }

    public boolean getLocation(){
        int obsCount = obstacle.count();
        System.out.println("Şuan buradasınız : "+ getName() );
        System.out.println("Dikkatli ol! Burada "+obsCount+" tane "+obstacle.getName()+" yaşıyor !");
        System.out.println("<S>avaş veya <K>aç");
        String selCase = scan.next().toUpperCase();
        if(selCase.equals("S")){
            if(combat(obsCount)){
                System.out.println(this.getName()+" bölgesindeki tüm düşmanları temizlediniz !");
                return true;
            }else{
                System.out.println("Öldünüz !");
                return false;
            }
        }
        return true;
    }

    public boolean combat(int obsCount){
        for(int i = 0; i<obsCount; i++){
            playerStats();
            enemyStats();
        }
        return true;
    }

    public void playerStats(){
        System.out.println("Oyuncu Değerleri\n--------------------");
        System.out.println("Can : "+player.getHealthy());
        System.out.println("Hasar : "+player.getTotalDamage());
        System.out.println("Para : "+player.getMoney());
        if(player.getInv().getDamage()>0){
            System.out.println("Silah : "+player.getInv().getwName());
        }
        if(player.getInv().getArmor()>0){
            System.out.println("Zırh : "+player.getInv().getaName());
        }
        System.out.println();
    }

    public void enemyStats(){
        System.out.println(obstacle.getName() + " Değerleri\n--------------------");
        System.out.println("Can: "+obstacle.getHealth());
        System.out.println("Hasar: "+obstacle.getDamage());
        System.out.println("Ödül: "+obstacle.getAward());
    }
}
