package org.edu.ucsal.smart_toolbar.dto;

import org.edu.ucsal.smart_toolbar.command.Command;

public record CommandMDRecord(Command command, String label, int shortcut) {
}
