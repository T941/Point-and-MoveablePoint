public class Main {
    public static void main(String[] args) {
        Point point=new Point();
        point.setXY(1,2);
        System.out.println(point);
        MovoablePoint movoablePoint=new MovoablePoint();
        movoablePoint.setSpeed(2,3);
        movoablePoint.setXY(1,2);
        System.out.println(movoablePoint);
    }
}
