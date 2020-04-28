public class Main {

    public static void main (String[]args){
        Beer beer1 = new Beer ("light", 5.2f);

        BeerHouse beerHouse= new BeerHouse();

        BeerProducter beerProducter = new BeerProducter(beer1,beerHouse);
        BeerConsumer beerConsumer=new BeerConsumer(beerHouse);



        beerProducter.start();

        beerConsumer.start();



    }

}
