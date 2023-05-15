package net.rcy.modbuilder.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

<<<<<<< HEAD
/**
 * The WeaponMaterials class defines the forge tiers for different weapon materials.
 * Each forge tier specifies various properties such as durability, mining level, attack damage, and more.
 */

=======
>>>>>>> da6e7429bbc5683c0f987f31841d1573e369afc9
public class WeaponMaterials {

    public static final ForgeTier WOOD = new ForgeTier(0, 400, 1.5f,
            2f, 22, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
    public static final ForgeTier STONE = new ForgeTier(1, 800, 1.5f,
            2f, 22, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
    public static final ForgeTier IRON = new ForgeTier(2, 1000, 1.5f,
            2f, 22, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
    public static final ForgeTier GOLD = new ForgeTier(2, 300, 1f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
    public static final ForgeTier CITRINE = new ForgeTier(3, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
    public static final ForgeTier DIAMOND = new ForgeTier(4, 2000, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

<<<<<<< HEAD
=======
    public static final ForgeTier NETHERITE = new ForgeTier(5, 2500, 1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));

>>>>>>> da6e7429bbc5683c0f987f31841d1573e369afc9

}
