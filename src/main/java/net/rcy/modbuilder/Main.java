package net.rcy.modbuilder;

import net.rcy.modbuilder.management.Formatter;
import java.io.FileWriter;
import java.io.IOException;

import static net.minecraft.world.entity.EquipmentSlot.*;
import static net.minecraft.world.item.ArmorMaterials.*;
import static net.rcy.modbuilder.management.Formatter.*;

public class Main {
    //Here we create the new armors and weapons using the materials created
    //Saving all the classes and characteristics in java nd json files
    public static void main(String[] args) throws IOException {
        //Here we create the new materials with the formatters
        formatArmorItem("goldie", LEATHER, LEGS, 17);


    }

}
