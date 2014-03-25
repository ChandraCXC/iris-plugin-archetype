package ${package};

import cfa.vo.iris.gui.NarrowOptionPane;
import cfa.vo.iris.sdk.AbstractPluginMenuItem;

public class TestMenuItem extends AbstractPluginMenuItem {

    public TestMenuItem() {
        setIconPath("/images/icon.png");
        setThumbnailPath("/images/thumb.png");
    }

    public void onClick() {
        NarrowOptionPane.showMessageDialog(null, "Hello, Iris World!", "Test Menu Item", NarrowOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String getTitle() {
        return "Test Component";
    }

    @Override
    public String getDescription() {
        return "Say Hello World";
    }
}
