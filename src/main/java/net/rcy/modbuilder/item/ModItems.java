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
