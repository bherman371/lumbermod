package com.ridebuilder5.lumbermod;

import com.ridebuilder5.lumbermod.init.ModRecipes;
import com.ridebuilder5.lumbermod.proxy.CommonProxy;
import com.ridebuilder5.lumbermod.tabs.LumberBlocksTab;
import com.ridebuilder5.lumbermod.tabs.LumberCombatTab;
import com.ridebuilder5.lumbermod.tabs.LumberFoodTab;
import com.ridebuilder5.lumbermod.tabs.LumberMaterialsTab;
import com.ridebuilder5.lumbermod.tabs.LumberToolsTab;
import com.ridebuilder5.lumbermod.util.Reference;
import com.ridebuilder5.lumbermod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs LUMBERBLOCKSTAB = new LumberBlocksTab("lumberblockstab");
	public static final CreativeTabs LUMBERMATERIALSTAB = new LumberMaterialsTab("lumbermaterialstab");
	public static final CreativeTabs LUMBERFOODTAB = new LumberFoodTab("lumberfoodtab");
	public static final CreativeTabs LUMBERTOOLSTAB = new LumberToolsTab("lumbertoolstab");
	public static final CreativeTabs LUMBERCOMBATTAB = new LumberCombatTab("lumbercombattab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
