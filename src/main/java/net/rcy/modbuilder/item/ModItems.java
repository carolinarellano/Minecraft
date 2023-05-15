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

	public static final RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
		() -> new ShovelItem(WeaponMaterials.STONE, 2, 1.3f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> DIAMOND_AXE = ITEMS.register("diamond_axe",
		() -> new AxeItem(WeaponMaterials.DIAMOND, 8, 7.0f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
		() -> new PickaxeItem(WeaponMaterials.IRON, 3, 2.0f , 
				new Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));

	public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
		() -> new SwordItem(WeaponMaterials.CITRINE, 6, 3.2f , 
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



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
