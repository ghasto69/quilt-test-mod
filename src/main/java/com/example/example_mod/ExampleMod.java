package com.example.example_mod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");
	public static ModContainer mod;
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.PEBBLE))
			.name(Text.translatable("itemGroup." + "example_mod." + "main"))
			.entries((displayParameters, itemStackCollector) -> ModItems.items.forEach(itemStackCollector::addItem))
			.build();
	@Override
	public void onInitialize(ModContainer modContainer) {
		mod = modContainer;
		ModItems.register();
		ModBlocks.register();
		Registry.register(Registries.ITEM_GROUP, new Identifier(mod.metadata().id(), "main"), ITEM_GROUP);
		LOGGER.info("{} has loaded!", mod.metadata().name());
	}

}
