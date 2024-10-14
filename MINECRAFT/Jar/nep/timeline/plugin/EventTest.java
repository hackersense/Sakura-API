package nep.timeline.plugin;

import nep.timeline.projects.Sakura.api.plugin.Jar.API;
import nep.timeline.projects.Sakura.api.plugin.Jar.Inject;
import nep.timeline.projects.Sakura.command.CMDCore;
import nep.timeline.projects.Sakura.module.ModuleCore;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.matcher.ElementMatchers;
import net.minecraft.client.Minecraft;

import java.util.List;

@Inject(
        name = "Event Test",
        developer = "Timeline",
        apiVersion = 1
)
public class EventTest implements API {
    @Override
    public void onLoad() {
        System.out.println("Hello Sakura!");
        // Hook Minecraft->runTick() Method
        Class<?> targetClass = Minecraft.class;
        new ByteBuddy().redefine(targetClass)
                .visit(Advice.to(HookMinecraft.class).on(ElementMatchers.named("runTick"))).make()
                .load(targetClass.getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());
    }

    @Override
    public List<ModuleCore> modules() {
        return List.of(new TestModule());
    }

    @Override
    public List<CMDCore> commands() {
        return List.of(new TestCommand());
    }
}
