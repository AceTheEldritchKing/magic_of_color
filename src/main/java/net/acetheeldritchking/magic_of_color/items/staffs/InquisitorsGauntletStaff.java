package net.acetheeldritchking.magic_of_color.items.staffs;

import earth.terrarium.pastel.api.item.Preenchanted;
import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.acetheeldritchking.aces_spell_utils.items.staves.ImbueableStaffItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.List;
import java.util.Map;

public class InquisitorsGauntletStaff extends ImbueableStaffItem implements Preenchanted {
    public static final int COOLDOWN = 5 * 20;

    public InquisitorsGauntletStaff() {
        super(ItemPropertiesHelper.equipment(1).fireResistant().rarity(Rarity.EPIC).attributes(ExtendedSwordItem.createAttributes(MOCStaffTier.INQUISITORS_GAUNTLET)));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        tooltipComponents.add(
                Component.translatable(
                        "tooltip.irons_spellbooks.passive_ability",
                        Component.literal(Utils.timeFromTicks(COOLDOWN, 1)).withStyle(ChatFormatting.LIGHT_PURPLE)
                ).withStyle(ChatFormatting.DARK_PURPLE)
        );
        tooltipComponents.add(Component.literal(" ").append(Component.translatable(this.getDescriptionId() + ".desc")).withStyle(ChatFormatting.YELLOW));
    }

    @Override
    public Map<ResourceKey<Enchantment>, Integer> getDefaultEnchantments() {
        return Map.of();
    }
}
