package net.rcy.modbuilder.building;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public abstract class MaterialChido  {

    public int[] HEALTH_PER_SLOT;
    public String name;
    public int durabilityMultiplier;
    public int[] slotProtections;
    public int enchantmentValue;
    public float toughness;
    public float knockbackResistance;
    public LazyLoadedValue<Ingredient> repairIngredient;
    private Materials material;
    public SoundEvent soundEvent;

    public MaterialChido(){

    }

    public MaterialChido(Materials material, int durabilityM, int[] slotProtections, int enchantment, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIng) {
    }

    public int[] getHEALTH_PER_SLOT() {
        return HEALTH_PER_SLOT;
    }

    public void setHEALTH_PER_SLOT(int[] HEALTH_PER_SLOT) {
        this.HEALTH_PER_SLOT = HEALTH_PER_SLOT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurabilityMultiplier() {
        return durabilityMultiplier;
    }

    public void setDurabilityMultiplier(int durabilityMultiplier) {
        this.durabilityMultiplier = durabilityMultiplier;
    }

    public int[] getSlotProtections() {
        return slotProtections;
    }

    public void setSlotProtections(int[] slotProtections) {
        this.slotProtections = slotProtections;
    }

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public void setEnchantmentValue(int enchantmentValue) {
        this.enchantmentValue = enchantmentValue;
    }

    public float getToughness() {
        return toughness;
    }

    public void setToughness(float toughness) {
        this.toughness = toughness;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    public void setKnockbackResistance(float knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
    }

    public LazyLoadedValue<Ingredient> getRepairIngredient() {
        return repairIngredient;
    }

    public void setRepairIngredient(LazyLoadedValue<Ingredient> repairIngredient) {
        this.repairIngredient = repairIngredient;
    }


}
