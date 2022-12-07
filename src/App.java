import oop.BetuMember;
import oop.Car;
import oop.Task;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    App duy = new App();
    
    // duy.practiceConstructor();
    duy.practiceOOP();
  }

  public void practiceConstructor() {
    // day la cach gan' truc tiep property cua 1 doi tuong
    Car vn = new Car();
    vn.color = "yellow";
    System.out.println("mau xe cua doi tuong vn la: " + vn.color);

    // day la cach dung constructor
    Car toyota = new Car("red");
    System.out.println("mau xe cua doi tuong toyota la: " + toyota.color);

  }

  public void practiceOOP() {
    BetuMember ha = new BetuMember();
    // day la cach gan property thong thuong
    ha.name = "Nguyen Thi Ha";

    //day la cach dung constructor
    BetuMember thube = new BetuMember("thu be");

    //day la cach dung constructor
    Task bonusBet = new Task("Bonus Bet");
    Task nextjs = new Task("Nextjs");
    Task clearSpecs = new Task("Clear Specs"); 

    thube.review = bonusBet;

    ha.refinement = bonusBet;

    // co the gan truc tiep property hay co the dung function de gan nhu duoi day.
    ha.develop.add(clearSpecs);
    ha.assignTaskDevelop(nextjs);

    System.out.println("task refinement cua ha la: " + ha.refinement.nametask);

  }
}
