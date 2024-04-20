public class CacheObserver implements Areable{
    private Rectangle rectangle;
    private boolean hasChanged = true;
    private double cachedArea;

    public CacheObserver(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle getRectangle() {
        hasChanged=false;
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        hasChanged=true;
        this.rectangle = rectangle;
    }

    public void setA(int a){
        hasChanged=true;
        rectangle.setA(a);
    }

    public void setB(int b){
        hasChanged=true;
        rectangle.setB(b);
    }


    @Override
    public double getArea(){
        if (hasChanged){
            cachedArea = rectangle.getArea();
            hasChanged = false;
        }
        return cachedArea;
    }


}
