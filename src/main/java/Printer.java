public class Printer {

    private int numberOfPages;
    private int volOfToner;

    public Printer(int numberOfPages, int volOfToner){
        this.numberOfPages = numberOfPages;
        this.volOfToner = volOfToner;
    }

    public int getPages(){
        return this.numberOfPages;
    }

    public int getToner(){
        return this.volOfToner;
    }


    public int toPrint(int i, int i1) {
        return i * i1;
    }

    public int print(int i, int i1) {
        if(this.numberOfPages >= this.toPrint(i, i1)){
            this.numberOfPages -= this.toPrint(i, i1);
            this.volOfToner -= this.toPrint(i, i1);
        }
        return this.numberOfPages;}
}


