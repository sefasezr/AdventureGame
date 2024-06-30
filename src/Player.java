import java.util.Scanner;

public class Player {
    private int damage,healthy,money,rHealty;
    private String name,cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }

    public void selectCha(){
        switch (chaMenu()){
            case 1:
                initPlayer("Samuray",5,21,15);
                break;
            case 2:
                initPlayer("Okçu",7,18,20);
                break;
            case 3:
                initPlayer("Samuray",7,21,5);
                break;
            default:
                initPlayer("Samuray",5,21,15);
                break;
        }
        System.out.println("Karakter : "+getcName()+" Hasar: "+getDamage()+" Sağlık: "+getHealthy()+" Para: "+getMoney());
    }

    public int chaMenu(){
        System.out.println("Lütfen karakter seçiniz : ");
        System.out.println("1- -Samuray \t Hasar : 5\t Sağlık : 21\t Para : 15");
        System.out.println("2- -Okçu \t Hasar : 7\t Sağlık : 18\t Para : 20");
        System.out.println("3- -Şovalye \t Hasar : 8\t Sağlık : 24\t Para : 5");
        System.out.println("Seçiminiz");
        int chaId= scan.nextInt();

        while(chaId<1 || chaId>3){
            System.out.print("Lutfen gecerli bir karakter seçiniz");
            chaId= scan.nextInt();
        }
        return chaId;
    }
    public int getTotalDamage(){
        return this.getDamage()+this.getInv().getDamage();
    }

    public void initPlayer(String cName, int dmg, int healthy, int money){
        setcName(cName);
        setDamage(dmg);
        setHealthy(healthy);
        setMoney(money);
        setrHealty(healthy);
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }
}
