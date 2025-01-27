package net.yechse.remaximized.item;

import net.minecraft.registry.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.yechse.remaximized.Remaximized;

public class ModItem {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Remaximized.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item TRASSIUM_INGOT = register(new Item(new Item.Settings()), "trassium_ingot");
    public static final Item TRASSIUM_SHARD = register(new Item(new Item.Settings()), "trassium_shard");
    public static final Item TRASSIUM_DUST = register(new Item(new Item.Settings()), "trassium_dust");

    public static void onInitializeModItem() {
        Remaximized.LOGGER.info("Registering ModItem for Remaximized");
    }
}
