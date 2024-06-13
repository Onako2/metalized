package rs.onako2.metalized.Init;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rs.onako2.metalized.Metalized;

public class InventoryInit {
    public static void Init() {
        Registry.register(Registries.ITEM_GROUP, Identifier.tryParse("metalized", "main_group"), Metalized.METALIZED_ITEM_GROUP);
    }
}