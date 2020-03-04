package com.ridebuilder5.lumbermod.tabs;

import com.ridebuilder5.lumbermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LumberCombatTab extends CreativeTabs {

	public LumberCombatTab(String label) {
		super("lumbercombattab");
		this.setBackgroundImageName("lumbercombat.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ARAUCARIA_STICK);
	}
}
