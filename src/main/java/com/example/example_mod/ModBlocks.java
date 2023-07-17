package com.example.example_mod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
@SuppressWarnings("unused")
public class ModBlocks {
	public static final Block BASIC_BLOCK = registerBlock("basic_block", new Block(QuiltBlockSettings.create().breakInstantly()));

	public static Block registerBlock(String id, Block block) {
		Item item = new BlockItem(block, new QuiltItemSettings());
		ModItems.items.add(item);
		Registry.register(Registries.ITEM, new Identifier(ExampleMod.mod.metadata().id(), id), item);
		return Registry.register(Registries.BLOCK, new Identifier(ExampleMod.mod.metadata().id(), id), block);
	}
	public static Block registerBlockWithCustomItem(String id, Block block, Item item) {
		ModItems.items.add(item);
		Registry.register(Registries.ITEM, new Identifier(ExampleMod.mod.metadata().id(), id), item);
		return Registry.register(Registries.BLOCK, new Identifier(ExampleMod.mod.metadata().id(), id), block);
	}

	public static void register() {}
}
