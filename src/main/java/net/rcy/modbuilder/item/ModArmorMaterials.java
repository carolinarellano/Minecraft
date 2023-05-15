package net.rcy.modbuilder.item;

import net.minecraft.world.item.Items;
import net.rcy.modbuilder.ModBuilder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.io.FileNotFoundException;
import java.util.function.Supplier;

/**
 * Enum class representing different armor materials used in the mod.
 */

public enum ModArmorMaterials implements ArmorMaterial {

    // Add other armor materials here...

    // Constructor and other enum values...

    CITRINE("citrine", 28, new int[]{2, 5, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.CITRINE.get())),
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),
    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    PURE_GOLD("pure_gold", 30, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_GOLD, 0.1F, 0.1F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    REINFORCED_DIAMOND("reinforced_diamond", 40, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    HOLY_EMERALD("holy_emerald", 50, new int[]{3, 6, 8, 3}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.5F, () -> {
        return Ingredient.of(Items.EMERALD);
    });


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);

        // Initialize the armor material properties
    }

    /**
     * Returns the durability of the armor material for the given equipment slot.
     *
     * @param pSlot The equipment slot.
     * @return The durability for the equipment slot.
     */

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
        // Implement the logic to calculate the durability for the given slot
    }

    /**
     * Returns the defense value of the armor material for the given equipment slot.
     *
     * @param pSlot The equipment slot.
     * @return The defense value for the equipment slot.
     */

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
        // Implement the logic to calculate the defense value for the given slot
    }

    /**
     * Returns the enchantment value of the armor material.
     *
     * @return The enchantment value.
     */

    public int getEnchantmentValue() {
        return this.enchantmentValue;
        // Return the enchantment value
    }

    /**
     * Returns the sound event played when equipping the armor material.
     *
     * @return The equip sound event.
     */

    public SoundEvent getEquipSound() {
        return this.sound;
        // Return the equip sound event
    }

    /**
     * Returns the repair ingredient for the armor material.
     *
     * @return The repair ingredient.
     */

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
        // Return the repair ingredient
    }

    /**
     * Returns the name of the armor material.
     *
     * @return The name of the armor material.
     */

    public String getName() {
        return ModBuilder.MOD_ID + ":" + this.name;
        // Return the name of the armor material
    }

    /**
     * Returns the toughness value of the armor material.
     *
     * @return The toughness value.
     */

    public float getToughness() {
        return this.toughness;
        // Return the toughness value
    }

    /**
     * Returns the knockback resistance value of the armor material.
     *
     * @return The knockback resistance value.
     */

    public float getKnockbackResistance() {
        return this.knockbackResistance;
        // Return the knockback resistance value
    }

}
