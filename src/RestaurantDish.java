public class RestaurantDish {
    private String nameOfDish;
    private double costInCents;
    private boolean wouldRecommend;
    public void eat () {
        System.out.println("Nom nom nom!");
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public double getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(double costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public RestaurantDish(String nameOfDish, double costInCents, boolean wouldRecommend) {
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }
}
