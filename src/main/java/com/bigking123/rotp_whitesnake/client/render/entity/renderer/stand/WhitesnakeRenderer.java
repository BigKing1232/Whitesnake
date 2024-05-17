package com.bigking123.rotp_whitesnake.client.render.entity.renderer.stand;

import com.bigking123.rotp_whitesnake.RotpWhitesnakeAddon;
import com.bigking123.rotp_whitesnake.client.render.entity.model.stand.Whitesnake;
import com.bigking123.rotp_whitesnake.entity.stand.stands.WhitesnakeEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class WhitesnakeRenderer extends StandEntityRenderer<WhitesnakeEntity, Whitesnake> {
    
    public WhitesnakeRenderer(EntityRendererManager renderManager) {
        super(renderManager, new Whitesnake(), new ResourceLocation(RotpWhitesnakeAddon.MOD_ID, "textures/entity/stand/whitesnake.png"), 0);
    }
}
