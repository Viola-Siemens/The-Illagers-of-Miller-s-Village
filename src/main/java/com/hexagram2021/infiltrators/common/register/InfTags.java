package com.hexagram2021.infiltrators.common.register;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.hexagram2021.infiltrators.Infiltrators.MODID;

public class InfTags {
	public static final TagKey<Item> SPECIAL_BOOKS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(MODID, "special_books"));
	
	public static void init() {
	}
}
