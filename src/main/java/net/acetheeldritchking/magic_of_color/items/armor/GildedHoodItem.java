package net.acetheeldritchking.magic_of_color.items.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import net.acetheeldritchking.aces_spell_utils.items.example.ImbuableExtendedGeoArmorItem;
import net.acetheeldritchking.magic_of_color.entity.armor.GildedHatModel;
import net.acetheeldritchking.magic_of_color.entity.armor.GildedHoodModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GildedHoodItem extends ImbuableExtendedGeoArmorItem {
    public GildedHoodItem(Type slot, Properties settings) {
        super(MOCArmorMaterialRegistry.GILDED_HATS, slot, settings, schoolAttributes(AttributeRegistry.COOLDOWN_REDUCTION, 150, 0.5F, 0.05F));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new GildedHoodModel());
    }
}
