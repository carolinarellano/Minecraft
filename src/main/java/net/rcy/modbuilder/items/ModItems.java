package net.rcy.modbuilder.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rcy.modbuilder.ModBuilder;



public class ModItems {

    public static final CreativeModeTab MY_TAB = new CreativeModeTab("mod_builder_tab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HOLY_EMERALD.get());
        }
    };
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModBuilder.MODID);

    public static final RegistryObject<Item> HOLY_EMERALD = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_BUILDER_TAB)));

    public static final RegistryObject<Item> HOLY_EMERALD_HELMET = ITEMS.register("holy_emerald_helmet",
            () -> new ArmorItem(ModArmorMaterial.HOLY_EMERALD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_BUILDER_TAB)));
    public static final RegistryObject<Item> HOLY_EMERALD_CHESTPLATE = ITEMS.register("holy_emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterial.HOLY_EMERALD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_BUILDER_TAB)));
    public static final RegistryObject<Item> HOLY_EMERALD_LEGGING = ITEMS.register("holy_emerald_leggings",
            () -> new ArmorItem(ModArmorMaterial.HOLY_EMERALD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_BUILDER_TAB)));
    public static final RegistryObject<Item> HOLY_EMERALD_BOOTS = ITEMS.register("holy_emerald_boots",
            () -> new ArmorItem(ModArmorMaterial.HOLY_EMERALD, EquipmentSlot.FEET,
                    new Item.Properties().group(ModCreativeModeTab.MOD_BUILDER_TAB)));


}

