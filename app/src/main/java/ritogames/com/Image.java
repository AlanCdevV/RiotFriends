package ritogames.com;

public class Image {
    private int ImageId;
    private String ImageName;

    public Image(int imageId, String imageName) {
        ImageId = imageId;
        ImageName = imageName;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getImageName() {
        return ImageName;
    }
}
