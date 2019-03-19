package me.geek.tom.infstore.init;

import me.geek.tom.infstore.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class ModItems {
    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties()).setRegistryName(Reference.MODID, "circuit"),
                new Item(new Item.Properties()).setRegistryName(Reference.MODID, "cable")
        );
    }
}
