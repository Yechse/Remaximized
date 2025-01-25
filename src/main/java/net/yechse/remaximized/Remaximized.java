package net.yechse.remaximized;

import net.fabricmc.api.ModInitializer;
import net.yechse.remaximized.item.ModGroup;
import net.yechse.remaximized.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Remaximized implements ModInitializer {
	public static final String MOD_ID = "remaximized";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Remaximized");
		ModItem.onInitializeModItem();
		ModGroup.onInitializeModGroup();
	}
}