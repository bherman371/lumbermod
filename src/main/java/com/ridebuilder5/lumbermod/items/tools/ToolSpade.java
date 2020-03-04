package com.ridebuilder5.lumbermod.items.tools;

import com.ridebuilder5.lumbermod.Main;
import com.ridebuilder5.lumbermod.init.ModItems;
import com.ridebuilder5.lumbermod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.LUMBERTOOLSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
