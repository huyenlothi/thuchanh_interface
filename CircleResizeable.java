public class CircleResizeable extends Circle implements Resizeable {
    private Circle circle;
    public CircleResizeable(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void getresize(double percent){
        circle.setRadius(circle.getRadius()*percent);
    }
}
