package rs.onako2.metalized;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class MetalizedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(Metalized.IRON_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.REDSTONE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.COAL_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.DIAMOND_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.EMERALD_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.GOLD_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.LAPIS_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Metalized.NETHERITE_LADDER, BlockRenderLayer.CUTOUT);
    }
}
