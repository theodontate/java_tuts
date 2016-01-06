/**
 * Created by theartiste on 1/6/16.
 */
public class Blanket {
    private double thickness;
    private String brandName;

    Blanket(double thickness, String brandName) {
        this.thickness = thickness;
        this.brandName = brandName;
    }

    public Cloth whatIsIt() {
        return new Cloth() {

            public void isUsedTo() {
                System.out.println("Thickness is " + thickness);
                System.out.println("Brand Name is" + brandName);
            }

        };
    }

}
