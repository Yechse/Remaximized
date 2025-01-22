package net.yechse.remaximized.item;

import net.minecraft.registry.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.yechse.remaximized.Remaximized;

public class ModItem {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Remaximized.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item TRASSIUM_DUST = register(new Item(new Item.Settings()), "trassium_gem");
    public static final Item TRASSIUM_SHARD = register(new Item(new Item.Settings()), "trassium_shard");
    public static final Item TRASSIUM_GEM = register(new Item(new Item.Settings()), "trassium_dust");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
        .register((itemGroup) -> itemGroup.add(ModItem.TRASSIUM_SHARD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
        .register((itemGroup) -> itemGroup.add(ModItem.TRASSIUM_DUST));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
        .register((itemGroup) -> itemGroup.add(ModItem.TRASSIUM_GEM));
    }
}
