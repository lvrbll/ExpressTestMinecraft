package net.lvrbl.expresstest.tabs;

import cpw.mods.fml.common.Mod;
import net.lvrbl.expresstest.registries.ItemRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRedstone;

import javax.swing.*;

public class ModTabs extends CreativeTabs {
    private Item icon;

    public static ModTabs MOD_BLOCKS = new ModTabs("tab_block");
    public static ModTabs MOD_ITEMS = new ModTabs("tab_item");

    public ModTabs(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return icon;
    }

    public void setTabIcon(Item icon) {
        this.icon = icon;
    }

    public static void register() {
        MOD_BLOCKS.setTabIcon(ItemRegistry.TEST_ITEM);
        MOD_ITEMS.setTabIcon(Items.arrow);
    }
}
