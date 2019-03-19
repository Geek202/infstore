package me.geek.tom.infstore.init;

import me.geek.tom.infstore.components.blocks.BlockStorage;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.event.RegistryEvent;

public class ModBlocks {

    public static Block storageblock;

    public void register(RegistryEvent.Register<Block> event) {
        if (storageblock == null) {
            storageblock = new BlockStorage(Block.Properties.create(Material.IRON, MaterialColor.PURPLE)).setRegistryName("storageblock");
        }
        event.getRegistry().registerAll(
                storageblock
        );
    }

    public void registerItemBlocks(RegistryEvent.Register<Item> event) {
        if (storageblock == null) {
            storageblock = new BlockStorage(Block.Properties.create(Material.IRON, MaterialColor.PURPLE)).setRegistryName("storageblock");
        }
        event.getRegistry().registerAll(
                new ItemBlock(storageblock, new Item.Properties()).setRegistryName("storageblock")
        );
    }
}
