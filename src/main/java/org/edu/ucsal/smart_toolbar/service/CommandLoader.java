package org.edu.ucsal.smart_toolbar.service;

import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.command.Command;
import org.edu.ucsal.smart_toolbar.dto.CommandMDRecord;
import org.edu.ucsal.smart_toolbar.view.WorkSpace;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommandLoader {
    public static List<CommandMDRecord> load(WorkSpace ws) {
        List<CommandMDRecord> instances = new ArrayList<>();
        Reflections reflections = new Reflections("org.edu.ucsal.smart_toolbar.command");

        Set<Class<?>> annotClass = reflections.getTypesAnnotatedWith(org.edu.ucsal.smart_toolbar.annotation.CommandInfo.class);

        for (Class<?> cls : annotClass) {
            try {
                Command cmd = (Command) cls.getConstructor(WorkSpace.class).newInstance(ws);
                CommandInfo info = cls.getAnnotation(CommandInfo.class);

                instances.add(new CommandMDRecord(cmd, info.label(), info.shortcut()));
            } catch (Exception e) {
                System.err.println("Error ao carregar comando: " + cls.getName());
                e.printStackTrace();
            }
        }
        return instances;
    }
}

