public class Image_porxy implements IImage {
    private String fileName;
    Image realimage = null;

    Image_porxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realimage == null){
            realimage = new Image(fileName);
            realimage.display();
        }else{
            realimage.display();
        }
    }
    
}
