package com.ridebuilder5.lumbermod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.lumbermod.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* MATERIALS (harvestLevel, maxUses, efficiency, damage, enchantability)
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	//Materials (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial MATERIAL_SOFTWOOD = EnumHelper.addToolMaterial("material_softwood", 0, 59, 2.0F, 0.0F, 15);
	
	/* ARMOR MATERIALS (name, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness)
	 * LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 */
	//Armor Materials (name, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness)
	
	//Items - Official Release
	public static final Item ARAUCARIA_STICK = new ItemBase("araucaria_stick");
	public static final Item CEDAR_STICK = new ItemBase("cedar_stick");
	public static final Item CELERY_STICK = new ItemBase("celery_stick");
	
	//Items - Softwood: Part 1
	public static final Item CYPRESS_STICK = new ItemBase("cypress_stick");
	public static final Item DOUGLAS_FIR_STICK = new ItemBase("douglas_fir_stick");
	public static final Item EUROPEAN_YEW_STICK = new ItemBase("european_yew_stick");
	public static final Item FIR_STICK = new ItemBase("fir_stick");
	public static final Item HEMLOCK_STICK = new ItemBase("hemlock_stick");
	public static final Item HUON_PINE_STICK = new ItemBase("huon_pine_stick");
	public static final Item KAURI_STICK = new ItemBase("kauri_stick");
	public static final Item QUEENSLAND_KAURI_STICK = new ItemBase("queensland_kauri_stick");
	
	//Items - Chewy's Ideas
	public static final Item CHERRY_STICK = new ItemBase("cherry_stick");
	public static final Item LAVA_STICK = new ItemBase("lava_stick");
	public static final Item SHIMMER_STICK = new ItemBase("shimmer_stick");
	public static final Item ZOMBIE_STICK = new ItemBase("zombie_stick");
	
}
