package jp.SakuraPlugin;

import jp.timeline.projects.Sakura.command.CMDCore;
import jp.timeline.projects.Sakura.utils.control.ChatUtils;

public class TestCmd extends CMDCore
{
    public TestCmd()
    {
        super("testcmd", "test");
    }

    @Override
    public void call(String[] message)
    {
        ChatUtils.sendMessage("TEST");
    }
}
