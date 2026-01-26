package net.lvrbl.expresstest.registries;

import cpw.mods.fml.common.registry.GameRegistry;
import net.lvrbl.expresstest.ExpressTestMod;
import net.lvrbl.expresstest.block.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry {
    public static Block TEST_BLOCK = new ModBlock(Material.rock);

    public static void register() {
        registerBlock(TEST_BLOCK, "test_block");
    }

    private static void registerBlock(Block block, String name) {
        block.setBlockName(name);
        block.setBlockTextureName(ExpressTestMod.MODID + ":" + name);
        GameRegistry.registerBlock(block, name);
    }
}
