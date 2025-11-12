package net.acetheeldritchking.magic_of_color.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.acetheeldritchking.magic_of_color.items.armor.GildedHatItem;
import net.acetheeldritchking.magic_of_color.items.armor.GildedHoodItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GildedHoodModel extends DefaultedEntityGeoModel<GildedHoodItem> {
    public GildedHoodModel() {
        super(ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(GildedHoodItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "geo/gilded_hood_mask.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GildedHoodItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "textures/models/armor/gilded_hood.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GildedHoodItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
