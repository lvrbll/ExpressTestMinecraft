package net.lvrbl.expresstest.registries;

import cpw.mods.fml.common.registry.GameRegistry;
import net.lvrbl.expresstest.ExpressTestMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRegistry {
    public static Item TEST_ITEM = new Item()
            .setCreativeTab(CreativeTabs.tabBlock);

    public static void register() {
        registerItem(TEST_ITEM, "test_item");
    }

    private static void registerItem(Item item, String name) {
        item.setUnlocalizedName(name);
        item.setTextureName(ExpressTestMod.MODID + ":" + name);
        GameRegistry.registerItem(item, name);
    }
}
