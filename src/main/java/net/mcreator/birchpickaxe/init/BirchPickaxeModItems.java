
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birchpickaxe.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.birchpickaxe.item.BirchPickaxeItem;
import net.mcreator.birchpickaxe.BirchPickaxeMod;

public class BirchPickaxeModItems {
	public static Item BIRCH_PICKAXE;

	public static void load() {
		BIRCH_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(BirchPickaxeMod.MODID, "birch_pickaxe"), new BirchPickaxeItem());
	}
}
