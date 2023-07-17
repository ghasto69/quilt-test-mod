package com.example.example_mod;


import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.ArrayList;
import java.util.Collection;
@SuppressWarnings("unused")
public class ModItems {
public static Collection<Item> items = new ArrayList<>();

public static final Item PEBBLE = registerItem("pebble", new Item(new QuiltItemSettings()));

public static Item registerItem(String id, Item item) {
	items.add(item);
	return Registry.register(Registries.ITEM, new Identifier(ExampleMod.mod.metadata().id(), id), item);
}

public static void register() {}

}
