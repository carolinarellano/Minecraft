package net.rcy.modbuilder.building;
import java.io.*;
import net.rcy.modbuilder.building.Material;

public class Armor {
    public Armor() {

    }

    //Getters

    //Functions
    @Override
    public Armor clone() {
        return new Armor();
    }

    @Override
    public String toString() {
        String Name = "HOLA";
        String id = '"' + Name.toLowerCase() + '"';
        String a = String.format("""
                %s = ITEMS.register(%s,
                \t() -> new ArmorItem(ModArmorMaterials.%s, EquipmentSlot.%s,
                          new Item.Properties().tab(ModCreativeModeTab.INITARMOR)));""" + Name, id, "IRON", "CHEST");
        return a;
    }

    public void saveArmor(String source, String destination) {
        try {
            // Load the source file into a string
            String sourceCode = readFile(source);

            // Find the method in the source code
            int str = sourceCode.indexOf("public static final RegistryObject<Item>" + this);
            String methodCode = sourceCode.substring(str);

            // Write the method code to the destination file
            writeToFile(destination, methodCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        reader.close();
        return stringBuilder.toString();
    }

    private void writeToFile(String destination, String methodCode) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
        writer.write(this.toString());
        writer.close();
    }

    private void toJson(String file, String info){

    }
}