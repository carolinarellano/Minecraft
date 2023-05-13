package net.rcy.modbuilder.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_BUILDER_TAB = new CreativeModeTab("modbuildertab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HOLY_EMERALD.get());
        }
    };



}