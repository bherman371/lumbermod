package com.ridebuilder5.lumbermod.tabs;

import com.ridebuilder5.lumbermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LumberMaterialsTab extends CreativeTabs {

	public LumberMaterialsTab(String label) {
		super("lumbermaterialstab");
		this.setBackgroundImageName("lumbermaterials.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ARAUCARIA_STICK);
	}
}
