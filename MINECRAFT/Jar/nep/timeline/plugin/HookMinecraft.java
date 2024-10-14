package nep.timeline.plugin;

import net.bytebuddy.asm.Advice;
import net.minecraft.client.Minecraft;

public class HookMinecraft {
    /**
     * This method will execute before runTick execute.
     * @param mc is target class's instance
     * @param isGamePaused is private field for Minecraft class (Minecraft->isGamePaused)
     */
    @Advice.OnMethodEnter
    public static void onEnter(@Advice.This Minecraft mc, @Advice.FieldValue("isGamePaused") boolean isGamePaused) {
        if (mc.player == null)
            return;

        // Do Something
    }

    /**
     * This method will execute before runTick execute, and block runTick execute.
     * @param mc is target class's instance
     * @param isGamePaused is private field for Minecraft class (Minecraft->isGamePaused)
     */
    //@Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
    //public static boolean onEnter(@Advice.This Minecraft mc, @Advice.FieldValue("isGamePaused") boolean isGamePaused) {
        // Return true if you want to block runTick execute.
    //    return true;
    //}
}
