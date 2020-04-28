public class BeerConsumer extends Thread {

    BeerHouse beerHouse;

    public BeerConsumer(BeerHouse beerHouse) {
        super();
        this.beerHouse = beerHouse;
    }


    public void run(){

      while (beerHouse.aux!=100){
      Beer beer= this.beerHouse.consumer();
          System.out.println(beer);
      }




        }
}
