package rs.onako2.metalized.Init;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Items;
import rs.onako2.metalized.Metalized;

public class ModItems {
    public static void Init() {
        Items.register(Metalized.IRON_STAIRS);
        Items.register(Metalized.GOLD_STAIRS);
        Items.register(Metalized.LAPIS_STAIRS);
        Items.register(Metalized.DIAMOND_STAIRS);
        Items.register(Metalized.EMERALD_STAIRS);
        Items.register(Metalized.COAL_STAIRS);
        Items.register(Metalized.REDSTONE_STAIRS);
        Items.register(Metalized.NETHERITE_STAIRS);
        
        Items.register(Metalized.IRON_LADDER);
        Items.register(Metalized.GOLD_LADDER);
        Items.register(Metalized.LAPIS_LADDER);
        Items.register(Metalized.DIAMOND_LADDER);
        Items.register(Metalized.EMERALD_LADDER);
        Items.register(Metalized.COAL_LADDER);
        Items.register(Metalized.REDSTONE_LADDER);
        Items.register(Metalized.NETHERITE_LADDER);
        
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(Metalized.COAL_LADDER, 300);
            builder.add(Metalized.COAL_STAIRS, 300);
        });
    }
}
