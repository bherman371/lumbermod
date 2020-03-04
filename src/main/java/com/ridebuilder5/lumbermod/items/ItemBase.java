package com.ridebuilder5.lumbermod.items;

import com.ridebuilder5.lumbermod.Main;
import com.ridebuilder5.lumbermod.init.ModItems;
import com.ridebuilder5.lumbermod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.LUMBERMATERIALSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
