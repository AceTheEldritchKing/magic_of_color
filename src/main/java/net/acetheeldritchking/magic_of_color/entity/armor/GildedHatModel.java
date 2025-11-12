package net.acetheeldritchking.magic_of_color.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.acetheeldritchking.magic_of_color.items.armor.GildedHatItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GildedHatModel extends DefaultedEntityGeoModel<GildedHatItem> {
    public GildedHatModel() {
        super(ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(GildedHatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "geo/gilded_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GildedHatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "textures/models/armor/gilded_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GildedHatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
