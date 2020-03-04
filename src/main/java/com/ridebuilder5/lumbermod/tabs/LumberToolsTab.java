package com.ridebuilder5.lumbermod.tabs;

import com.ridebuilder5.lumbermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LumberToolsTab extends CreativeTabs {

	public LumberToolsTab(String label) {
		super("lumbertoolstab");
		this.setBackgroundImageName("lumbertools.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ARAUCARIA_STICK);
	}
}
