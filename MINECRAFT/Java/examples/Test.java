package jp.SakuraPlugin;

import jp.timeline.EventSystem.EventListener;
import jp.timeline.EventSystem.events.UpdateEvent;
import jp.timeline.projects.Sakura.values.*;
import jp.timeline.projects.Sakura.module.ModuleCore;
import jp.timeline.projects.Sakura.module.ModuleType;
import jp.timeline.projects.Sakura.utils.entity.MovementUtils;

public class AutoJump extends ModuleCore {
    private final BooleanValue moveOnly = new BooleanValue("MovingOnly", true);

    public AutoJump() {
        super("Auto Jump", ModuleType.Movement);
    }

    @EventListener
    public void onUpdate(UpdateEvent event)
    {
        if (event.isPre() && mc.player.onGround && (MovementUtils.isMoving() || !moveOnly.get()))
            mc.player.jump();
    }
}
