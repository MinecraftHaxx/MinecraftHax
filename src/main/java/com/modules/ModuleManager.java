package com.solarisclient.modules;

import com.solarisclient.modules.impl.*;
import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public static final List<Module> modules = new ArrayList<>();

    public static void init() {
        modules.add(new PlayerESP());
        modules.add(new FullBright());
        modules.add(new FreeCam());
        // Add more modules here
    }

    public static List<Module> getModules() { return modules; }

    public static Module getModuleByName(String name) {
        return modules.stream().filter(m -> m.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
