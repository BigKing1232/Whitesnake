package com.bigking123.rotp_whitesnake.action.stand;

import com.github.standobyte.jojo.action.ActionTarget;
import com.github.standobyte.jojo.action.stand.StandAction;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Blindness extends StandAction {

    public Blindness(StandAction.Builder builder) {
        super(builder);
    }

    @Override
    protected void perform(World world, LivingEntity user, IStandPower power, ActionTarget target) {
        if (!world.isClientSide()) {
            if (!user.hasEffect(Effects.BLINDNESS)) {
                user.addEffect(new EffectInstance(Effects.BLINDNESS, 99999999, 999999, false, false, true));
            } else {
                user.removeEffect(Effects.BLINDNESS);
            }
        }
    }
}
