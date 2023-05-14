package net.rcy.modbuilder.item;
import net.rcy.modbuilder.ModBuilder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModBuilder.MOD_ID);

	public static final RegistryObject<Item> CHAINMAIL_HELMET = ITEMS.register("chainmail_helmet",
		() -> new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> CHAINMAIL_CHESTPLATE = ITEMS.register("chainmail_chestplate",
		() -> new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> CHAINMAIL_LEGGING = ITEMS.register("chainmail_leggings",
		() -> new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> CHAINMAIL_BOOTS = ITEMS.register("chainmail_boots",
		() -> new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> GOLD_HELMET = ITEMS.register("golden_helmet",
		() -> new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> GOLD_CHESTPLATE = ITEMS.register("golden_chestplate",
		() -> new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> GOLD_LEGGING = ITEMS.register("golden_leggings",
		() -> new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> GOLD_BOOTS = ITEMS.register("golden_boots",
		() -> new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON_HELMET = ITEMS.register("iron_helmet",
		() -> new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON_CHESTPLATE = ITEMS.register("iron_chestplate",
		() -> new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON_LEGGING = ITEMS.register("iron_leggings",
		() -> new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON_BOOTS = ITEMS.register("iron_boots",
		() -> new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_HELMET = ITEMS.register("diamond_helmet",
		() -> new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate",
		() -> new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_LEGGING = ITEMS.register("diamond_leggings",
		() -> new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_BOOTS = ITEMS.register("diamond_boots",
		() -> new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> LEATHER_HELMET = ITEMS.register("leather_helmet",
		() -> new ArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.HEAD,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> LEATHER_CHESTPLATE = ITEMS.register("leather_chestplate",
		() -> new ArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.CHEST,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> LEATHER_LEGGING = ITEMS.register("leather_leggings",
		() -> new ArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.LEGS,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> LEATHER_BOOTS = ITEMS.register("leather_boots",
		() -> new ArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.FEET,
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

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

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

    public static final RegistryObject<Item> CITRINE_LEGGING = ITEMS.register("citrine_leggings",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
