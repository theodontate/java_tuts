/**
 * Created by theartiste on 1/5/16.
 */
public class StarMenDemo {

    private StarMen show(int a) {
        if (a == 1) {
            class SuperMan implements StarMen {
                String name;

                SuperMan(String name) {
                    this.name = name;
                }

                public void beDetermined() {
                    System.out.println("I am determined bro.");
                }
            }
            return new SuperMan("Clark Kent");
        }

        else {
            class Batman implements StarMen {
                String name;

                Batman(String name) {
                    this.name = name;
                }

                public void beDetermined() {
                    System.out.println("I ain't such a coward.");
                }
            }
            return new Batman("Bruce Wayne");
        }

    }

    public StarMen init(int a) {
        return show(a);
    }

    public void showMe(StarMen a) {
        a.beDetermined();
    }

    public static void main(String[] args) {

        StarMenDemo obj = new StarMenDemo();
        StarMen a = obj.init(1);
        obj.showMe(a);
        StarMen b = obj.init(2);
        obj.showMe(b);
    }
}
