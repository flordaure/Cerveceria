import java.util.List;

public class BeerProducter extends Thread {
    Beer beer;
    BeerHouse beerHouse;

    public BeerProducter (Beer beer, BeerHouse beerHouse){
        super();
        this.beer=beer;
        this.beerHouse=beerHouse;
    }

    public void run(){
        int i;

            for ( i=1; i <= this.beerHouse.capacity; i++) {
                this.beerHouse.producer(beer);
            }
        }

    }







