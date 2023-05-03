package net.rcy.modbuilder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class MaterialChido  {

    //El material posee las caracteristicas de resistencia,
    // por lo tanto deberiamos crear un nuevo "material" que contenga
    // las caracteristicas personalizadas del material

    private int[] HEALTH_PER_SLOT = new int[4];
    private  String name;
    public  int durabilityMultiplier;
    public  int[] slotProtections;
    public  int enchantmentValue;
    public final float toughness;
    public final float knockbackResistance;
    public final LazyLoadedValue<Ingredient> repairIngredient;


    private MaterialChido(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }
}
