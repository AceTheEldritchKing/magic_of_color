package net.acetheeldritchking.magic_of_color.entity.render.armor;

import mod.azure.azurelib.common.render.armor.AzArmorRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererConfig;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.minecraft.resources.ResourceLocation;

public class BedrockWarlockHelmetArmorRenderer extends AzArmorRenderer {
    private static final ResourceLocation GEO = ResourceLocation.fromNamespaceAndPath(
            MagicofColor.MOD_ID,
            "geo/bedrock_wizard_helmet.geo.json"
    );

    private static final ResourceLocation TEX = ResourceLocation.fromNamespaceAndPath(
            MagicofColor.MOD_ID,
            "textures/models/armor/bedrock_wizard_helmet.png"
    );

    public BedrockWarlockHelmetArmorRenderer() {
        super(
                AzArmorRendererConfig.builder(GEO, TEX)
                        .setPipelineContext(AzArmorLowerCloakLayerPipeline::new)
                        .build()
        );
    }
}
