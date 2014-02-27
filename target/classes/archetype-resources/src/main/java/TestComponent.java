package ${package};

import cfa.vo.iris.IMenuItem;
import cfa.vo.iris.sdk.AbstractIrisComponent;
import java.util.ArrayList;
import java.util.List;

public class TestComponent extends AbstractIrisComponent {

    public List<IMenuItem> menus = new MenuItems();
    
    public String getName() {
        return "Test Component";
    }

    public String getDescription() {
        return "Example Component in Test Plugin";
    }

    public List<IMenuItem> getMenus() {
        return menus;
    }
    
    private class MenuItems extends ArrayList<IMenuItem> {
        public MenuItems() {
            super();
            add(new TestMenuItem());
        }
    }


}
