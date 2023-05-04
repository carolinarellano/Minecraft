package net.rcy.modbuilder;

import net.minecraft.world.entity.EquipmentSlot;
import net.rcy.modbuilder.building.Diamond;
import net.rcy.modbuilder.building.Gold;
import net.rcy.modbuilder.building.Iron;
import net.rcy.modbuilder.building.Material;

public class Main {
    //Here we create the new armors and weapons using the materials created
    //Saving all the classes and characteristics in java nd json files
    public static void main(String[] args){
        //Here we create the new materials
        Material myGold = new Gold("custom gold", 100, 0.1F, 0.0F, EquipmentSlot.CHEST);
        Diamond myDiamond = new Diamond("custom diamond", 30, 0.0F, 0.0F, EquipmentSlot.FEET);
        Iron i = new Iron("custom iron", 41, 0.0F, 0.1F, EquipmentSlot.CHEST);
        System.out.println(myGold);
        System.out.println(myDiamond);
        System.out.println(i);
    }

}