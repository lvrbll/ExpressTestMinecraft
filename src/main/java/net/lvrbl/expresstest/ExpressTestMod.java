package net.lvrbl.expresstest;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.lvrbl.expresstest.registries.ItemRegistry;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExpressTestMod.MODID, version = ExpressTestMod.VERSION)
public class ExpressTestMod {
    public static final String MODID = "expresstest";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ItemRegistry.register();
    }
}
