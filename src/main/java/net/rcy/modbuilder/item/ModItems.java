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


	/**
	 * Citrine Helmet item.
	 */

	public static final RegistryObject<Item> IRON1_HELMET = ITEMS.register("iron_helmet",
		() -> new ArmorItem(ModArmorMaterials.IRON1, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON1_CHESTPLATE = ITEMS.register("iron_chestplate",
		() -> new ArmorItem(ModArmorMaterials.IRON1, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON1_LEGGING = ITEMS.register("iron_leggings",
		() -> new ArmorItem(ModArmorMaterials.IRON1, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON1_BOOTS = ITEMS.register("iron_boots",
		() -> new ArmorItem(ModArmorMaterials.IRON1, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_SWORD = ITEMS.register("diamond_sword",
		() -> new SwordItem(WeaponMaterials.DIAMOND, 6, 1.9f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_AXE = ITEMS.register("diamond_axe",
		() -> new AxeItem(WeaponMaterials.DIAMOND, 10, 2.9f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

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

	public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> LEATHER = ITEMS.register("leather",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> CHAINMAIL = ITEMS.register("chain",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON = ITEMS.register("iron_ingot",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> GOLD = ITEMS.register("gold_ingot",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> HOLY_EMERALD = ITEMS.register("emerald",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));


	/**
	 * Registers the mod items to the event bus.
	 *
	 * @param eventBus the event bus to register the items to
	 */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
