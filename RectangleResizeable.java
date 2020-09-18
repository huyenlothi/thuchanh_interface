public class RectangleResizeable extends Rectangle implements Resizeable {
    private Rectangle rectangle;

    public RectangleResizeable(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    @Override
    public void getresize(double percent){
        rectangle.setWidth(rectangle.getWidth()*percent);
        rectangle.setLength(rectangle.getLength()*percent);
    }
}
