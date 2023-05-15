
package net.mcreator.birchpickaxe.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BirchPickaxeItem extends PickaxeItem {
	public BirchPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 59;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BIRCH_PLANKS), new ItemStack(Blocks.BIRCH_LOG), new ItemStack(Blocks.STRIPPED_BIRCH_LOG), new ItemStack(Blocks.BIRCH_WOOD), new ItemStack(Blocks.STRIPPED_BIRCH_WOOD));
			}
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
