package com.ridebuilder5.lumbermod.tabs;

import com.ridebuilder5.lumbermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LumberFoodTab extends CreativeTabs {

	public LumberFoodTab(String label) {
		super("lumberfoodtab");
		this.setBackgroundImageName("lumberfood.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ARAUCARIA_STICK);
	}
}
