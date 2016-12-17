package com.legacy.aether.client.models.entities;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import com.legacy.aether.server.entities.passive.EntitySheepuff;

public class SheepuffWoolModel extends ModelQuadruped
{
    private float headRotationAngleX;

    public SheepuffWoolModel()
    {
        super(12, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
        this.head.setRotationPoint(0.0F, 6.0F, -8.0F);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
        this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float prevLimbSwing, float partialTickTime)
    {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, prevLimbSwing, partialTickTime);

        this.head.rotationPointY = 6.0F + ((EntitySheepuff)entitylivingbaseIn).getHeadRotationPointY(partialTickTime) * 9.0F;
        this.headRotationAngleX = ((EntitySheepuff)entitylivingbaseIn).getHeadRotationAngleX(partialTickTime);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);

        this.head.rotateAngleX = this.headRotationAngleX;
    }

}