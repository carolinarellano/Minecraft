package net.rcy.modbuilder.util;

import net.rcy.modbuilder.ModBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> CITRINE_GEMS = forgeTag("gems/citrine");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(ModBuilder.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}