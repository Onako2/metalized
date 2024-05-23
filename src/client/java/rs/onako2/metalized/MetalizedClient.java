package rs.onako2.metalized;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MetalizedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.IRON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.REDSTONE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.COAL_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.DIAMOND_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.EMERALD_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.GOLD_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.LAPIS_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Metalized.NETHERITE_LADDER, RenderLayer.getCutout());
    }
}