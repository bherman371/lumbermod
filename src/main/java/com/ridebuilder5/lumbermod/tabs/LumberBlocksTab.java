package com.ridebuilder5.lumbermod.tabs;

import com.ridebuilder5.lumbermod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LumberBlocksTab extends CreativeTabs {

	public LumberBlocksTab(String label) {
		super("lumberblockstab");
		this.setBackgroundImageName("lumberblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.ARAUCARIA_LOG);
	}
}
