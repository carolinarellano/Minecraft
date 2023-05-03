package net.rcy.modbuilder.building;
import net.minecraft.world.entity.EquipmentSlot;
import java.io.*;


/*
Arma
	Arma (Resistencia, Material, Daño) -> Se llama desde la interfaz
	.
	.
	.
	Get
	Set
	Save
	Delete
	Clone
	Shuffle -> Randomize
	Edit
 */



//Constructors
public class Armor {
    private static int[] HEALTH_PER_TYPE = new int[4];
    //private final String armor_name;
    private EquipmentSlot.Type type ;
    private int xdurability;
    private int health;
    private float toughness;
    private float knockbackhealth;
    private Material material;

    public Armor() {
    }

    public Armor(EquipmentSlot.Type type, Material material) {
        setType(type);
        setMaterial(material);
    }

    public Armor(EquipmentSlot.Type type, Material material, int health) {
        this(type, material);
        setHealth(health);
    }

    public Armor(EquipmentSlot.Type type, Material material, int health, int damage) {
        this(type, material, health);

    }


    //Setters
    void setHealth(int health) {
        this.health = health;
    }

    void setMaterial(Material material) {
        this.material = material;
    }



    void setType(EquipmentSlot.Type type) {
        this.type = type;
    }

    //Getters


    public int gethealth() {
        return health;
    }

    public Material getMaterial() {
        return material;
    }

    public EquipmentSlot.Type getType() {
        return type;
    }

    //Functions
    @Override
    public Armor clone() {
        return new Armor(this.type, this.material, this.health);
    }

    @Override
    public String toString() {
        String Name = this.material + "_" + this.type;
        String id = '"' + Name.toLowerCase() + '"';
        String a = String.format("""
                %s = ITEMS.register(%s,
                \t() -> new ArmorItem(ModArmorMaterials.%s, EquipmentSlot.%s,
                          new Item.Properties().tab(ModCreativeModeTab.INITARMOR)));""" + Name, id, this.material, this.type);
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