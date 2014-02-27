package ${package};

import cfa.vo.iris.IrisComponent;
import cfa.vo.iris.sdk.IrisPlugin;
import java.util.ArrayList;
import java.util.List;

public class TestPlugin implements IrisPlugin {
    private List<IrisComponent> components;
    
    public TestPlugin() {
        components = new ArrayList();
        components.add(new TestComponent());
    }

    public String getName() {
        return "Test Plugin";
    }

    public String getDescription() {
        return "An example Plugin";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getAuthor() {
        return "Omar Laurino olaurino@cfa.harvard.edu";
    }

    public List<IrisComponent> getComponents() {
        return components;
    }

    public String getAcknowledgments() {
        return "";
    }

    
}
