public class WaterBottle {
    public int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int drink() {
        this.volume -= 10;
        return this.volume;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fillUp() {
        this.volume = 100;
    }
}
