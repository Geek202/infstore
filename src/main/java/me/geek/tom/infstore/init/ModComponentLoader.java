package me.geek.tom.infstore.init;

import me.geek.tom.infstore.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModComponentLoader {
    public static ModItems items = new ModItems();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        items.register(event);
    }
}
