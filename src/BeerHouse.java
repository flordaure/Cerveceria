public class BeerHouse {

    int stock=0;
    int aux=0;
    int capacity=100;
    private Beer beer;
    private boolean available = false;



    public synchronized void producer(Beer beer) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Generando cerveza");
        this.beer = beer;
        this.stock++;
       this.aux++;
        System.out.println("cantidad de cervezas generadas: " + this.aux);
        available = true;
        notifyAll();
    }


    public synchronized Beer consumer() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("consumiendo cerveza");
        Beer beer = this.beer;
        stock--;
        available = false;
        notifyAll();
        return beer;


    }
}
