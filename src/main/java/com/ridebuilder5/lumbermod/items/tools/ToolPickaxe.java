package com.ridebuilder5.lumbermod.items.tools;

import com.ridebuilder5.lumbermod.Main;
import com.ridebuilder5.lumbermod.init.ModItems;
import com.ridebuilder5.lumbermod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
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
