package net.rcy.modbuilder.building;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import static net.rcy.modbuilder.building.Materials.DIAMOND;

public class Diamond extends Material {
    private static final Materials material = DIAMOND;
    private final EquipmentSlot type;
    public Diamond(String name, int durabilityM, float toughness, float knockbackResistance, EquipmentSlot type) {
        super(name, material, durabilityM, toughness, knockbackResistance, type);
        this.type = type;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot type) {
        return ArmorMaterials.DIAMOND.getDurabilityForSlot(type);
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot type) {
        return ArmorMaterials.DIAMOND.getDefenseForSlot(type);
    }

    @Override
    public int getEnchantmentValue() {
        return ArmorMaterials.DIAMOND.getEnchantmentValue();
    }

    @Override
    public SoundEvent getEquipSound() {
        return ArmorMaterials.DIAMOND.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ArmorMaterials.DIAMOND.getRepairIngredient();
    }
}
