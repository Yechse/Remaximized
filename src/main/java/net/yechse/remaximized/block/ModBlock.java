package net.yechse.remaximized.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.yechse.remaximized.Remaximized;

public class ModBlock {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Remaximized.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block TRASSIUM_BLOCK = register(
        new Block(AbstractBlock.Settings.create()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .mapColor(MapColor.LIGHT_BLUE)
            .strength(1.5f)
            .requiresTool()
            ), "trassium_block", true);

    public static void onInitializeModBlock () {
        Remaximized.LOGGER.info("Registering ModBlock for Remaximized");
    }
}
