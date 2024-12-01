import java.awt.*;
import javax.swing.JComponent;

public class ImagePanel extends JComponent {
    private int width, height;
    private OFImage panelImage;

    public ImagePanel() {
        width = 360;
        height = 240;
        panelImage = null;
    }

    public void setImage(OFImage image) {
        if (image != null) {
            width = image.getWidth();
            height = image.getHeight();
            panelImage = image;
            repaint();
        }
    }

    public void clearImage() {
        if (panelImage != null) {
            Graphics imageGraphics = panelImage.getGraphics();
            imageGraphics.setColor(Color.LIGHT_GRAY);
            imageGraphics.fillRect(0, 0, width, height);
        }
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        if (panelImage != null) {
            return new Dimension(panelImage.getWidth(), panelImage.getHeight());
        }
        return new Dimension(width, height); // Default size if no image is loaded
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure base painting
        Dimension size = getSize(); // Panel size
        g.clearRect(0, 0, size.width, size.height); // Clear the panel

        if (panelImage != null) {
            // Resize image to fit the panel
            g.drawImage(panelImage, 0, 0, size.width, size.height, this);
        }
    }
}
