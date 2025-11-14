package net.acetheeldritchking.magic_of_color.items.staffs;

import earth.terrarium.pastel.api.item.Preenchanted;
import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.acetheeldritchking.aces_spell_utils.items.staves.ImbueableStaffItem;
import net.acetheeldritchking.aces_spell_utils.utils.ASRarities;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.List;
import java.util.Map;

public class PraetorsGauntletStaff extends ImbueableStaffItem implements Preenchanted {
    public static final int COOLDOWN = 5 * 20;

    public PraetorsGauntletStaff() {
        super(ItemPropertiesHelper.equipment(1).fireResistant().rarity(ASRarities.VERDANT_RARITY_PROXY.getValue()).attributes(ExtendedSwordItem.createAttributes(MOCStaffTier.PRAETORS_GAUNTLET)));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown())
        {
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
            tooltipComponents.add(
                    Component.translatable(
                            "tooltip.irons_spellbooks.passive_ability",
                            Component.literal(Utils.timeFromTicks(COOLDOWN, 1)).withStyle(ChatFormatting.LIGHT_PURPLE)
                    ).withStyle(ChatFormatting.DARK_PURPLE)
            );
            tooltipComponents.add(Component.literal(" ").append(Component.translatable(this.getDescriptionId() + ".desc")).withStyle(ChatFormatting.YELLOW));
        } else
        {
            tooltipComponents.add(Component.translatable("item.magic_of_color.more_details").withStyle(ChatFormatting.GRAY));
        }
    }

    @Override
    public Map<ResourceKey<Enchantment>, Integer> getDefaultEnchantments() {
        return Map.of();
    }
}
