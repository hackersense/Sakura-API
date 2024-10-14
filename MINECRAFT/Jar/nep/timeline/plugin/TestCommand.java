package nep.timeline.plugin;

import nep.timeline.projects.Sakura.command.CMDCore;
import nep.timeline.projects.Sakura.utils.control.ChatUtils;

public class TestCommand extends CMDCore {
    public TestCommand() {
        super("test");
    }

    @Override
    public void call(String[] strings, String s) {
        ChatUtils.sendMessage("Command respond");
    }
}
