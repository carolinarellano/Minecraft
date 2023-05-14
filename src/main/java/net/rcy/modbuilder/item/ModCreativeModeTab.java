package net.rcy.modbuilder.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ModCreativeModeTab {
    public static final CreativeModeTab MODBUILDER_TAB = new CreativeModeTab("modbuildertab") {
        @Override
        public ItemStack makeIcon() {
            List<ItemStack> itemStacks = new ArrayList<>();
            itemStacks.add(new ItemStack(ModItems.CITRINE.get()));
            itemStacks.add(new ItemStack(ModItems.LEATHER.get()));
            itemStacks.add(new ItemStack(ModItems.CHAINMAIL.get()));
            itemStacks.add(new ItemStack(ModItems.IRON.get()));
            itemStacks.add(new ItemStack(ModItems.GOLD.get()));
            itemStacks.add(new ItemStack(ModItems.DIAMOND.get()));
            itemStacks.add(new ItemStack(ModItems.HOLY_EMERALD.get()));
            return itemStacks.toArray(new ItemStack[0])[0];
        }

    };
}
