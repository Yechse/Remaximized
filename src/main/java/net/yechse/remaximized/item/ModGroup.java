package net.yechse.remaximized.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yechse.remaximized.Remaximized;
import net.yechse.remaximized.block.ModBlock;

public class ModGroup {
    public static final ItemGroup REMAXIMIZED_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(Remaximized.MOD_ID, "remaximized_items"), 
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItem.TRASSIUM_DUST))
            .displayName(Text.translatable("itemGroup.remaximized"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlock.TRASSIUM_BLOCK);
                entries.add(ModItem.TRASSIUM_INGOT);
                entries.add(ModItem.TRASSIUM_SHARD);
                entries.add(ModItem.TRASSIUM_DUST);
            })
        .build());
    
    public static void onInitializeModGroup() {
        Remaximized.LOGGER.info("Registering ModGroup for Remaximized");
    }
}


