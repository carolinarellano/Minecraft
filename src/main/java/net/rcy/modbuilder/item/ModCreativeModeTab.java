package net.rcy.modbuilder.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * The ModCreativeModeTab class defines a custom creative mode tab for the mod.
 * This tab groups the mod's items together in the creative inventory.
 */

public class ModCreativeModeTab {

    /**
     * The custom creative mode tab for the mod.
     * It is used to group the mod's items together in the creative inventory.
     */

    public static final CreativeModeTab MODBUILDER_TAB = new CreativeModeTab("modbuildertab") {
        /**
         * Retrieves the ItemStack that represents the icon of the creative mode tab.
         *
         * @return The ItemStack representing the icon of the creative mode tab.
         */
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
