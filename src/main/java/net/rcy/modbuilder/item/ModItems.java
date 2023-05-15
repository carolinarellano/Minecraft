package net.rcy.modbuilder.item;

import net.rcy.modbuilder.ModBuilder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * A class that registers and provides access to mod items.
 */

public class ModItems {

	/**
	 * Deferred register for mod items.
	 */

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModBuilder.MOD_ID);

	// Register your mod items here using RegistryObject

	/**
	 * Wood Hoe item.
	 */

	public static final RegistryObject<Item> WOOD_HOE = ITEMS.register("wood_hoe",
		() -> new HoeItem(WeaponMaterials.WOOD, 1, 0.3f ,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Stone Shovel item.
	 */

	public static final RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
		() -> new ShovelItem(WeaponMaterials.STONE, 2, 1.3f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Diamond Axe item.
	 */

	public static final RegistryObject<Item> DIAMOND_AXE = ITEMS.register("diamond_axe",
		() -> new AxeItem(WeaponMaterials.DIAMOND, 8, 7.0f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Iron Pickaxe item.
	 */

	public static final RegistryObject<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
		() -> new PickaxeItem(WeaponMaterials.IRON, 3, 2.0f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Citrine Sword item.
	 */

	public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
		() -> new SwordItem(WeaponMaterials.CITRINE, 6, 3.2f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Citrine item.
	 */

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Citrine Helmet item.
	 */

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));
	/**
	 * Citrine Chestplate item.
	 */

    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Citrine Leggings item.
	 */

    public static final RegistryObject<Item> CITRINE_LEGGING = ITEMS.register("citrine_leggings",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * Citrine boots item
	 */
    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	/**
	 * ... // Your item registrations

	/**
	 * Registers the mod items to the event bus.
	 *
	 * @param eventBus the event bus to register the items to
	 */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
