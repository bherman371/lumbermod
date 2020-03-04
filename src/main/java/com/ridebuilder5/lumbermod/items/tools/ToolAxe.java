package com.ridebuilder5.lumbermod.items.tools;

import com.ridebuilder5.lumbermod.Main;
import com.ridebuilder5.lumbermod.init.ModItems;
import com.ridebuilder5.lumbermod.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0F, -3.2F);
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
