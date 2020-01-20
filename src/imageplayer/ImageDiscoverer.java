package imageplayer;

import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

public class ImageDiscoverer {
    private int width;
    private int height;
    private Image sourceImage;
    private WritableImage destinationImage;
    private PixelWriter pixelWriter;

    public ImageDiscoverer(Image sourceImage) {
        this.sourceImage = sourceImage;
        width = (int) sourceImage.getWidth();
        height = (int) sourceImage.getHeight();
        destinationImage = new WritableImage(width, height);
        pixelWriter = destinationImage.getPixelWriter();
        initImage();
    }

    private void initImage() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                pixelWriter.setColor(col, row, Color.CORNFLOWERBLUE);
            }
        }
    }

    public WritableImage getDestinationImage() {
        return destinationImage;
    }
}