package nep.timeline.plugin;

import nep.timeline.EventSystem.EventList;
import nep.timeline.EventSystem.EventListener;
import nep.timeline.EventSystem.events.UpdateEvent;
import nep.timeline.projects.Sakura.module.ModuleCore;
import nep.timeline.projects.Sakura.module.ModuleRegister;
import nep.timeline.projects.Sakura.module.ModuleType;
import nep.timeline.projects.Sakura.utils.control.ChatUtils;

@ModuleRegister(
        name = "Test Module",
        type = ModuleType.Misc
)
public class TestModule extends ModuleCore {
    @Override
    public void onToggle() {
        boolean enabled = getState();
        if (enabled)
            ChatUtils.sendMessage("onEnable");
        else
            ChatUtils.sendMessage("onDisable");
    }

    @EventListener(event = EventList.TICK)
    public void onTick() {

    }

    @EventListener
    public void onUpdate(UpdateEvent event) {

    }
}
