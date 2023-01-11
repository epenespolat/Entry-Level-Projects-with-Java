public class BoxingRing {
    Boxers f1;
    Boxers f2;
    int minWeight;
    int maxWeight;

    public BoxingRing(Boxers f1, Boxers f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    void run(){
        if (isCheck()) {
            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("========YENİ ROUND ========");
                int chance = Math.round((float)Math.random());

                if (chance == 0) {
                    this.f2.health=this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                if (chance == 1) {
                    this.f1.health=this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }



                System.out.println("A Sağlık :"+this.f1.health);
                System.out.println("B Sağlık :"+this.f2.health);

            }
        }
        else {
            System.out.println("Sikletler uygun değil !");
        }

    }

    boolean isCheck(){
        return (this.f1.weight>= minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= minWeight && this.f2.weight<maxWeight );
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }
}
