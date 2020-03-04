package com.ridebuilder5.lumbermod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaLog;
import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaPlanks;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarLog;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarPlanks;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryLog;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryPlanks;
import com.ridebuilder5.lumbermod.blocks.cherry.CherryLog;
import com.ridebuilder5.lumbermod.blocks.cherry.CherryPlanks;
import com.ridebuilder5.lumbermod.blocks.cypress.CypressLog;
import com.ridebuilder5.lumbermod.blocks.cypress.CypressPlanks;
import com.ridebuilder5.lumbermod.blocks.douglasfir.DouglasFirLog;
import com.ridebuilder5.lumbermod.blocks.douglasfir.DouglasFirPlanks;
import com.ridebuilder5.lumbermod.blocks.europeanyew.EuropeanYewLog;
import com.ridebuilder5.lumbermod.blocks.europeanyew.EuropeanYewPlanks;
import com.ridebuilder5.lumbermod.blocks.fir.FirLog;
import com.ridebuilder5.lumbermod.blocks.fir.FirPlanks;
import com.ridebuilder5.lumbermod.blocks.hemlock.HemlockLog;
import com.ridebuilder5.lumbermod.blocks.hemlock.HemlockPlanks;
import com.ridebuilder5.lumbermod.blocks.huonpine.HuonPineLog;
import com.ridebuilder5.lumbermod.blocks.huonpine.HuonPinePlanks;
import com.ridebuilder5.lumbermod.blocks.kauri.KauriLog;
import com.ridebuilder5.lumbermod.blocks.kauri.KauriPlanks;
import com.ridebuilder5.lumbermod.blocks.lava.LavaLog;
import com.ridebuilder5.lumbermod.blocks.lava.LavaPlanks;
import com.ridebuilder5.lumbermod.blocks.queenslandkauri.QueenslandKauriLog;
import com.ridebuilder5.lumbermod.blocks.queenslandkauri.QueenslandKauriPlanks;
import com.ridebuilder5.lumbermod.blocks.shimmer.ShimmerLog;
import com.ridebuilder5.lumbermod.blocks.shimmer.ShimmerPlanks;
import com.ridebuilder5.lumbermod.blocks.zombie.ZombieLog;
import com.ridebuilder5.lumbermod.blocks.zombie.ZombiePlanks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks - Official Release
	public static final Block ARAUCARIA_LOG = new AraucariaLog("araucaria_log", Material.WOOD);
	public static final Block ARAUCARIA_PLANK = new AraucariaPlanks("araucaria_planks", Material.WOOD);
	
	public static final Block CEDAR_LOG = new CedarLog("cedar_log", Material.WOOD);
	public static final Block CEDAR_PLANKS = new CedarPlanks("cedar_planks", Material.WOOD);
	
	public static final Block CELERY_LOG = new CeleryLog("celery_log", Material.WOOD);
	public static final Block CELERY_PLANKS = new CeleryPlanks("celery_planks", Material.WOOD);
	
	//Blocks - Softwood: Part 1
	public static final Block CYPRESS_LOG = new CypressLog("cypress_log", Material.WOOD);
	public static final Block CYPRESS_PLANKS = new CypressPlanks("cypress_planks", Material.WOOD);
	
	public static final Block DOUGLAS_FIR_LOG = new DouglasFirLog("douglas_fir_log", Material.WOOD);
	public static final Block DOUGLAS_FIR_PLANKS = new DouglasFirPlanks("douglas_fir_planks", Material.WOOD);
	
	public static final Block EUROPEAN_YEW_LOG = new EuropeanYewLog("european_yew_log", Material.WOOD);
	public static final Block EUROPEAN_YEW_PLANKS = new EuropeanYewPlanks("european_yew_planks", Material.WOOD);
	
	public static final Block FIR_LOG = new FirLog("fir_log", Material.WOOD);
	public static final Block FIR_PLANKS = new FirPlanks("fir_planks", Material.WOOD);
	
	public static final Block HEMLOCK_LOG = new HemlockLog("hemlock_log", Material.WOOD);
	public static final Block HEMLOCK_PLANKS = new HemlockPlanks("hemlock_planks", Material.WOOD);
	
	public static final Block HUON_PINE_LOG = new HuonPineLog("huon_pine_log", Material.WOOD);
	public static final Block HUON_PINE_PLANKS = new HuonPinePlanks("huon_pine_planks", Material.WOOD);
	
	public static final Block KAURI_LOG = new KauriLog("kauri_log", Material.WOOD);
	public static final Block KAURI_PLANKS = new KauriPlanks("kauri_planks", Material.WOOD);
	
	public static final Block QUEENSLAND_KAURI_LOG = new QueenslandKauriLog("queensland_kauri_log", Material.WOOD);
	public static final Block QUEENSLAND_KAURI_PLANKS = new QueenslandKauriPlanks("queensland_kauri_planks", Material.WOOD);
	
	//Blocks - Chewy's Ideas
	public static final Block CHERRY_LOG = new CherryLog("cherry_log", Material.WOOD);
	public static final Block CHERRY_PLANKS = new CherryPlanks("cherry_planks", Material.WOOD);
	
	public static final Block LAVA_LOG = new LavaLog("lava_log", Material.WOOD);
	public static final Block LAVA_PLANKS = new LavaPlanks("lava_planks", Material.WOOD);
	
	public static final Block SHIMMER_LOG = new ShimmerLog("shimmer_log", Material.WOOD);
	public static final Block SHIMMER_PLANKS = new ShimmerPlanks("shimmer_planks", Material.WOOD);
	
	public static final Block ZOMBIE_LOG = new ZombieLog("zombie_log", Material.WOOD);
	public static final Block ZOMBIE_PLANKS = new ZombiePlanks("zombie_planks", Material.WOOD);
}
