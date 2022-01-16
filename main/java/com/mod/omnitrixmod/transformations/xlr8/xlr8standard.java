package com.mod.omnitrixmod.transformations.xlr8;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class xlr8standard extends PlayerModel<LivingEntity> {
	private final ModelRenderer XLR8;
	private final ModelRenderer Torso;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r1;
	private final ModelRenderer TailSegment2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer TailSegment3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer TailSegment4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer TailSegment5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer TailSegment6;
	private final ModelRenderer cube_r6;
	private final ModelRenderer TailSegment7;
	private final ModelRenderer cube_r7;
	private final ModelRenderer TailSegment8;
	private final ModelRenderer cube_r8;
	private final ModelRenderer TailSegment9;
	private final ModelRenderer cube_r9;
	private final ModelRenderer TailSegment10;
	private final ModelRenderer cube_r10;
	private final ModelRenderer TailSegment11;
	private final ModelRenderer TailSegment12;
	private final ModelRenderer cube_r11;
	private final ModelRenderer omnitrix;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r18;
	private final ModelRenderer RightForearm;
	private final ModelRenderer cube_r19;
	private final ModelRenderer RightHand;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r23;
	private final ModelRenderer LeftForearm;
	private final ModelRenderer cube_r24;
	private final ModelRenderer LeftHand;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer Neck;
	private final ModelRenderer cube_r28;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer Mask;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r33;
	private final ModelRenderer RightLowerLeg;
	private final ModelRenderer cube_r34;
	private final ModelRenderer RightCalf;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer RightFoot;
	private final ModelRenderer cube_r37;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r38;
	private final ModelRenderer LeftLowerLeg;
	private final ModelRenderer cube_r39;
	private final ModelRenderer LeftCalf;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer LeftFoot;
	private final ModelRenderer cube_r42;

	public xlr8standard() {
		super(0.5f,true);
		texWidth = 512;
		texHeight = 512;

		XLR8 = new ModelRenderer(this);
		XLR8.setPos(0.0F, -27.0F, 0.0F);
		

		Torso = new ModelRenderer(this);
		Torso.setPos(0.0F, 0.0F, 0.0F);
		XLR8.addChild(Torso);
		setRotationAngle(Torso, 0.1309F, 0.0F, 0.0F);
		Torso.texOffs(182, 101).addBox(12.0F, -39.5F, -7.75F, 2.0F, 13.0F, 15.0F, 0.0F, false);
		Torso.texOffs(84, 0).addBox(-7.0F, -25.0F, -7.0F, 14.0F, 25.0F, 15.0F, 0.0F, false);
		Torso.texOffs(146, 40).addBox(7.0F, -25.0F, -7.0F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		Torso.texOffs(110, 40).addBox(-10.0F, -25.0F, -7.0F, 3.0F, 22.0F, 15.0F, 0.0F, false);
		Torso.texOffs(80, 281).addBox(6.0F, -25.0F, -8.0F, 3.0F, 21.0F, 1.0F, 0.0F, false);
		Torso.texOffs(110, 184).addBox(-6.0F, -25.0F, -8.0F, 12.0F, 24.0F, 1.0F, 0.0F, false);
		Torso.texOffs(88, 281).addBox(-9.0F, -25.0F, -8.0F, 3.0F, 21.0F, 1.0F, 0.0F, false);
		Torso.texOffs(0, 0).addBox(-12.0F, -41.0F, -9.25F, 24.0F, 16.0F, 18.0F, 0.0F, false);
		Torso.texOffs(142, 0).addBox(-11.0F, -43.0F, -8.25F, 22.0F, 2.0F, 16.0F, 0.0F, false);
		Torso.texOffs(50, 40).addBox(-9.0F, -44.0F, -6.25F, 18.0F, 1.0F, 12.0F, 0.0F, false);
		Torso.texOffs(34, 129).addBox(-6.0F, -47.0F, -6.25F, 12.0F, 3.0F, 11.0F, 0.0F, false);
		Torso.texOffs(86, 225).addBox(-8.0F, -46.0F, -6.25F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		Torso.texOffs(60, 225).addBox(6.0F, -46.0F, -6.25F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		Torso.texOffs(66, 330).addBox(5.0F, -46.0F, -7.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Torso.texOffs(0, 309).addBox(-5.0F, -47.0F, -7.25F, 10.0F, 4.0F, 1.0F, 0.0F, false);
		Torso.texOffs(72, 320).addBox(-6.0F, -46.0F, -7.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Torso.texOffs(0, 129).addBox(-14.0F, -39.5F, -7.75F, 2.0F, 13.0F, 15.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setPos(0.0F, 0.3374F, 10.4615F);
		Torso.addChild(Tail);
		setRotationAngle(Tail, -0.6109F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -0.8374F, -5.4615F);
		Tail.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.texOffs(116, 77).addBox(-6.0F, -6.0F, -7.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);

		TailSegment2 = new ModelRenderer(this);
		TailSegment2.setPos(0.0F, 0.0F, 1.0F);
		Tail.addChild(TailSegment2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		TailSegment2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		cube_r2.texOffs(80, 129).addBox(-5.5F, -5.2F, -3.5F, 11.0F, 11.0F, 9.0F, 0.0F, false);

		TailSegment3 = new ModelRenderer(this);
		TailSegment3.setPos(0.0F, 3.1292F, 11.371F);
		TailSegment2.addChild(TailSegment3);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -1.6388F, -4.2513F);
		TailSegment3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.texOffs(76, 157).addBox(-5.0F, -4.5F, -4.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);

		TailSegment4 = new ModelRenderer(this);
		TailSegment4.setPos(0.0F, 0.25F, 1.0F);
		TailSegment3.addChild(TailSegment4);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		TailSegment4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.texOffs(76, 184).addBox(-4.5F, -4.3F, -3.5F, 9.0F, 9.0F, 8.0F, 0.0F, false);

		TailSegment5 = new ModelRenderer(this);
		TailSegment5.setPos(0.0F, 11.4607F, 33.4195F);
		TailSegment4.addChild(TailSegment5);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -9.6675F, -28.0416F);
		TailSegment5.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.texOffs(134, 209).addBox(-4.0F, -3.7F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		TailSegment6 = new ModelRenderer(this);
		TailSegment6.setPos(0.0F, 0.5F, 1.0F);
		TailSegment5.addChild(TailSegment6);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, -7.4051F, -23.7432F);
		TailSegment6.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
		cube_r6.texOffs(0, 225).addBox(-3.5F, -3.3F, -3.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);

		TailSegment7 = new ModelRenderer(this);
		TailSegment7.setPos(0.0F, 0.55F, 1.0F);
		TailSegment6.addChild(TailSegment7);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, -7.1551F, -23.2432F);
		TailSegment7.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
		cube_r7.texOffs(0, 240).addBox(-3.0F, -2.8F, 2.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);

		TailSegment8 = new ModelRenderer(this);
		TailSegment8.setPos(0.0F, 0.5F, 1.0F);
		TailSegment7.addChild(TailSegment8);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, -2.5319F, -15.848F);
		TailSegment8.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
		cube_r8.texOffs(168, 225).addBox(-2.5F, -2.7F, -2.5F, 5.0F, 5.0F, 8.0F, 0.0F, false);

		TailSegment9 = new ModelRenderer(this);
		TailSegment9.setPos(0.0F, 0.5F, 1.0F);
		TailSegment8.addChild(TailSegment9);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, -0.6687F, -10.9998F);
		TailSegment9.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
		cube_r9.texOffs(152, 240).addBox(-2.0F, -2.3F, -2.5F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		TailSegment10 = new ModelRenderer(this);
		TailSegment10.setPos(0.0F, 0.25F, 1.0F);
		TailSegment9.addChild(TailSegment10);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, 0.1878F, -6.006F);
		TailSegment10.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.texOffs(60, 281).addBox(-1.5F, -1.7F, -2.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		TailSegment11 = new ModelRenderer(this);
		TailSegment11.setPos(0.0F, 0.2F, 1.0F);
		TailSegment10.addChild(TailSegment11);
		TailSegment11.texOffs(40, 291).addBox(-1.0F, -0.75F, -4.5F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		TailSegment12 = new ModelRenderer(this);
		TailSegment12.setPos(0.0F, 0.0F, 1.0F);
		TailSegment11.addChild(TailSegment12);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, 0.0F, 0.0F);
		TailSegment12.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
		cube_r11.texOffs(62, 303).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		omnitrix = new ModelRenderer(this);
		omnitrix.setPos(1.3536F, -33.5607F, -9.75F);
		Torso.addChild(omnitrix);
		omnitrix.texOffs(12, 335).addBox(-2.3536F, -3.7678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		omnitrix.texOffs(6, 335).addBox(-2.3536F, 0.0607F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		omnitrix.texOffs(66, 326).addBox(-1.8536F, -2.9393F, -0.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, 0.0F, 0.25F);
		omnitrix.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.texOffs(72, 335).addBox(0.25F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r12.texOffs(80, 335).addBox(-0.75F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r12.texOffs(0, 335).addBox(-1.0F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-2.8284F, 0.1213F, 0.25F);
		omnitrix.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.texOffs(76, 335).addBox(0.25F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.texOffs(92, 335).addBox(-0.75F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.texOffs(18, 335).addBox(-1.0F, -4.5F, -0.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.8284F, 0.8284F, 0.25F);
		omnitrix.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.texOffs(64, 335).addBox(-1.25F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r14.texOffs(88, 335).addBox(-0.25F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r14.texOffs(24, 335).addBox(-1.0F, -5.5F, -0.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-1.4393F, 0.6464F, 0.0F);
		omnitrix.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
		cube_r15.texOffs(30, 335).addBox(1.0F, 1.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(-0.2678F, -1.3536F, 0.0F);
		omnitrix.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.5708F);
		cube_r16.texOffs(42, 335).addBox(-1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(-2.7071F, 0.0F, 0.25F);
		omnitrix.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.texOffs(68, 335).addBox(-1.25F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(84, 335).addBox(-0.25F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(36, 335).addBox(-1.0F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(22.4078F, -8.75F, -10.7971F);
		Torso.addChild(RightArm);
		setRotationAngle(RightArm, -0.1309F, 0.0F, 0.1309F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(-7.5794F, -19.0073F, 7.5471F);
		RightArm.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 1.0472F);
		cube_r18.texOffs(58, 77).addBox(-10.0F, -0.5F, -3.5F, 22.0F, 7.0F, 7.0F, 0.0F, false);

		RightForearm = new ModelRenderer(this);
		RightForearm.setPos(5.6049F, 8.4499F, -9.5285F);
		RightArm.addChild(RightForearm);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(-8.0324F, -12.5338F, 17.0756F);
		RightForearm.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.829F, 1.0472F);
		cube_r19.texOffs(128, 240).addBox(-3.75F, -2.5F, -12.5F, 5.0F, 5.0F, 7.0F, 0.0F, false);
		cube_r19.texOffs(22, 263).addBox(-3.25F, -2.0F, -19.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		cube_r19.texOffs(140, 101).addBox(-4.75F, -3.5F, -5.5F, 7.0F, 7.0F, 14.0F, 0.0F, false);
		cube_r19.texOffs(44, 303).addBox(-2.75F, -1.5F, 8.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		RightHand = new ModelRenderer(this);
		RightHand.setPos(0.0F, 0.0F, 0.0F);
		RightForearm.addChild(RightHand);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(0.0F, 0.0F, 0.0F);
		RightHand.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.7895F, -0.286F, -0.2507F);
		cube_r20.texOffs(20, 291).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(1.6931F, 0.8112F, 1.6905F);
		RightHand.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.6572F, -0.5484F, 2.0238F);
		cube_r21.texOffs(20, 281).addBox(-1.0F, -1.0F, -3.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(-8.0324F, -12.5338F, 17.0756F);
		RightHand.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.829F, 1.0472F);
		cube_r22.texOffs(40, 281).addBox(-2.75F, -0.25F, -26.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(-22.4078F, -8.75F, -10.7971F);
		Torso.addChild(LeftArm);
		setRotationAngle(LeftArm, -0.1309F, 0.0F, -0.1309F);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(7.5794F, -19.0073F, 7.5471F);
		LeftArm.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -1.0472F);
		cube_r23.texOffs(0, 77).addBox(-12.0F, -0.5F, -3.5F, 22.0F, 7.0F, 7.0F, 0.0F, false);

		LeftForearm = new ModelRenderer(this);
		LeftForearm.setPos(-5.6049F, 8.4499F, -9.5285F);
		LeftArm.addChild(LeftForearm);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(8.0324F, -12.5338F, 17.0756F);
		LeftForearm.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.829F, -1.0472F);
		cube_r24.texOffs(104, 240).addBox(-1.25F, -2.5F, -12.5F, 5.0F, 5.0F, 7.0F, 0.0F, false);
		cube_r24.texOffs(0, 263).addBox(-0.75F, -2.0F, -19.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		cube_r24.texOffs(98, 101).addBox(-2.25F, -3.5F, -5.5F, 7.0F, 7.0F, 14.0F, 0.0F, false);
		cube_r24.texOffs(26, 303).addBox(-0.25F, -1.5F, 8.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		LeftHand = new ModelRenderer(this);
		LeftHand.setPos(0.0F, 0.0F, 0.0F);
		LeftForearm.addChild(LeftHand);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(0.0F, 0.0F, 0.0F);
		LeftHand.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7895F, 0.286F, 0.2507F);
		cube_r25.texOffs(136, 263).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(-1.6931F, 0.8112F, 1.6905F);
		LeftHand.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.6572F, 0.5484F, -2.0238F);
		cube_r26.texOffs(0, 281).addBox(-2.0F, -1.0F, -3.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(8.0324F, -12.5338F, 17.0756F);
		LeftHand.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.829F, -1.0472F);
		cube_r27.texOffs(0, 291).addBox(-0.25F, -0.25F, -26.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setPos(0.0F, -47.6271F, -1.2497F);
		Torso.addChild(Neck);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(0.0F, 0.0F, 0.0F);
		Neck.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.7418F, 0.0F, 0.0F);
		cube_r28.texOffs(120, 129).addBox(-4.0F, -7.0F, -6.125F, 8.0F, 17.0F, 8.0F, 0.0F, false);
		cube_r28.texOffs(76, 240).addBox(-5.0F, -7.0F, -5.125F, 1.0F, 17.0F, 6.0F, 0.0F, false);
		cube_r28.texOffs(90, 240).addBox(4.0F, -7.0F, -5.125F, 1.0F, 17.0F, 6.0F, 0.0F, false);
		cube_r28.texOffs(96, 263).addBox(-3.0F, -7.0F, 1.875F, 6.0F, 17.0F, 1.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Neck.addChild(Head);
		setRotationAngle(Head, -0.1309F, 0.0F, 0.0F);
		Head.texOffs(30, 225).addBox(-5.0F, -1.0F, -13.125F, 10.0F, 4.0F, 5.0F, 0.0F, false);
		Head.texOffs(66, 274).addBox(-7.0F, -2.0F, -14.125F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(0, 306).addBox(-6.0F, -4.0F, -15.125F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(6, 320).addBox(-4.0F, -5.0F, -15.125F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.texOffs(88, 303).addBox(-9.0F, -18.0F, -14.125F, 3.0F, 16.0F, 1.0F, 0.0F, false);
		Head.texOffs(0, 320).addBox(-8.0F, -17.0F, -15.125F, 2.0F, 14.0F, 1.0F, 0.0F, false);
		Head.texOffs(112, 303).addBox(6.0F, -17.0F, -15.125F, 2.0F, 14.0F, 1.0F, 0.0F, false);
		Head.texOffs(0, 303).addBox(-6.0F, -17.0F, -15.125F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(52, 320).addBox(-6.0F, -10.0F, -15.125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(48, 335).addBox(-3.0F, -9.0F, -15.125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(52, 335).addBox(2.0F, -9.0F, -15.125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(44, 331).addBox(3.0F, -10.0F, -15.125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(80, 303).addBox(6.0F, -18.0F, -14.125F, 3.0F, 16.0F, 1.0F, 0.0F, false);
		Head.texOffs(110, 263).addBox(-6.0F, -18.0F, -14.125F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(44, 327).addBox(-1.5F, -15.0F, -15.125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(60, 335).addBox(1.5F, -15.0F, -15.125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(56, 335).addBox(-2.5F, -15.0F, -15.125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(112, 157).addBox(7.0F, -18.0F, -13.125F, 2.0F, 16.0F, 11.0F, 0.0F, false);
		Head.texOffs(166, 209).addBox(-7.0F, -18.0F, -2.125F, 14.0F, 15.0F, 1.0F, 0.0F, false);
		Head.texOffs(138, 157).addBox(-9.0F, -18.0F, -13.125F, 2.0F, 16.0F, 11.0F, 0.0F, false);
		Head.texOffs(0, 40).addBox(-7.0F, -18.0F, -14.125F, 14.0F, 17.0F, 12.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(0.0F, -31.8768F, 0.6195F);
		Head.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.8727F, 0.0F, 0.0F);
		cube_r29.texOffs(26, 240).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setPos(0.0F, -27.5603F, -4.2683F);
		Head.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.6545F, 0.0F, 0.0F);
		cube_r30.texOffs(38, 157).addBox(-5.0F, -2.4F, -3.25F, 10.0F, 8.0F, 9.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setPos(0.0F, -18.5F, -7.125F);
		Head.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.3054F, 0.0F, 0.0F);
		cube_r31.texOffs(50, 101).addBox(-7.0F, -5.5F, -5.0F, 14.0F, 8.0F, 10.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setPos(0.0F, 4.0F, -10.625F);
		Head.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
		cube_r32.texOffs(110, 267).addBox(-4.0F, -1.75F, -1.75F, 8.0F, 2.0F, 4.0F, 0.0F, false);

		Mask = new ModelRenderer(this);
		Mask.setPos(0.0F, 0.0F, 0.0F);
		Head.addChild(Mask);
		Mask.texOffs(50, 240).addBox(-6.75F, -15.0F, -14.875F, 13.0F, 11.0F, 0.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(13.0233F, 33.572F, 3.4849F);
		XLR8.addChild(RightLeg);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setPos(-4.5233F, -36.072F, -3.2349F);
		RightLeg.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.1309F, 1.3963F);
		cube_r33.texOffs(0, 157).addBox(7.5F, -1.8F, -5.25F, 9.0F, 8.0F, 10.0F, 0.0F, false);
		cube_r33.texOffs(0, 101).addBox(-5.5F, -2.3F, -6.25F, 13.0F, 9.0F, 12.0F, 0.0F, false);

		RightLowerLeg = new ModelRenderer(this);
		RightLowerLeg.setPos(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(RightLowerLeg);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setPos(-3.0801F, -17.468F, -2.7238F);
		RightLowerLeg.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, -0.2182F, 1.3963F);
		cube_r34.texOffs(96, 209).addBox(5.25F, -2.0F, -5.5F, 13.0F, 4.0F, 6.0F, 0.0F, false);
		cube_r34.texOffs(38, 184).addBox(-5.75F, -3.0F, -6.5F, 11.0F, 6.0F, 8.0F, 0.0F, false);

		RightCalf = new ModelRenderer(this);
		RightCalf.setPos(0.0F, 0.0F, 0.0F);
		RightLowerLeg.addChild(RightCalf);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setPos(0.0F, 0.0F, 0.0F);
		RightCalf.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.1362F, -0.8638F, 1.5968F);
		cube_r35.texOffs(32, 209).addBox(-3.8F, -2.7F, -16.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);
		cube_r35.texOffs(64, 209).addBox(-3.3F, -2.2F, -6.0F, 5.0F, 5.0F, 11.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setPos(-1.0971F, -5.7921F, 3.8701F);
		RightCalf.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.1073F, -0.6039F, 1.5541F);
		cube_r36.texOffs(96, 311).addBox(-1.4F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		RightFoot = new ModelRenderer(this);
		RightFoot.setPos(0.0F, 0.0F, 0.0F);
		RightCalf.addChild(RightFoot);
		RightFoot.texOffs(140, 225).addBox(-1.9624F, 10.1348F, -14.5055F, 7.0F, 4.0F, 7.0F, 0.0F, false);
		RightFoot.texOffs(34, 320).addBox(-1.9624F, 10.1348F, -17.5055F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		RightFoot.texOffs(52, 328).addBox(-1.9624F, 14.1348F, -16.5055F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		RightFoot.texOffs(52, 324).addBox(4.0376F, 14.1348F, -16.5055F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		RightFoot.texOffs(66, 263).addBox(-1.4624F, 11.1348F, -16.5055F, 6.0F, 6.0F, 5.0F, 0.0F, false);
		RightFoot.texOffs(66, 323).addBox(-1.9624F, 14.1348F, -17.5055F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		RightFoot.texOffs(66, 320).addBox(3.0376F, 14.1348F, -17.5055F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		RightFoot.texOffs(24, 327).addBox(3.0376F, 10.1348F, -17.5055F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setPos(0.0F, 0.0F, 0.0F);
		RightFoot.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.1362F, -0.8638F, 1.5968F);
		cube_r37.texOffs(44, 320).addBox(-3.8F, -2.7F, -17.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(-13.0233F, 33.572F, 3.4849F);
		XLR8.addChild(LeftLeg);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setPos(4.5233F, -36.072F, -3.2349F);
		LeftLeg.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -0.1309F, -1.3963F);
		cube_r38.texOffs(152, 129).addBox(-16.5F, -1.8F, -5.25F, 9.0F, 8.0F, 10.0F, 0.0F, false);
		cube_r38.texOffs(164, 77).addBox(-7.5F, -2.3F, -6.25F, 13.0F, 9.0F, 12.0F, 0.0F, false);

		LeftLowerLeg = new ModelRenderer(this);
		LeftLowerLeg.setPos(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(LeftLowerLeg);
		

		cube_r39 = new ModelRenderer(this);
		cube_r39.setPos(3.0801F, -17.468F, -2.7238F);
		LeftLowerLeg.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.2182F, -1.3963F);
		cube_r39.texOffs(0, 184).addBox(-5.25F, -3.0F, -6.5F, 11.0F, 6.0F, 8.0F, 0.0F, false);
		cube_r39.texOffs(168, 184).addBox(-18.25F, -2.0F, -5.5F, 13.0F, 4.0F, 6.0F, 0.0F, false);

		LeftCalf = new ModelRenderer(this);
		LeftCalf.setPos(0.0F, 0.0F, 0.0F);
		LeftLowerLeg.addChild(LeftCalf);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setPos(1.0971F, -5.7921F, 3.8701F);
		LeftCalf.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.1073F, 0.6039F, -1.5541F);
		cube_r40.texOffs(96, 303).addBox(-2.6F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setPos(0.0F, 0.0F, 0.0F);
		LeftCalf.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.1362F, 0.8638F, -1.5968F);
		cube_r41.texOffs(0, 209).addBox(-1.7F, -2.2F, -6.0F, 5.0F, 5.0F, 11.0F, 0.0F, false);
		cube_r41.texOffs(136, 184).addBox(-2.2F, -2.7F, -16.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);

		LeftFoot = new ModelRenderer(this);
		LeftFoot.setPos(0.0F, 0.0F, 0.0F);
		LeftCalf.addChild(LeftFoot);
		LeftFoot.texOffs(112, 225).addBox(-5.0376F, 10.1348F, -14.5055F, 7.0F, 4.0F, 7.0F, 0.0F, false);
		LeftFoot.texOffs(24, 320).addBox(-0.0376F, 10.1348F, -17.5055F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		LeftFoot.texOffs(44, 263).addBox(-4.5376F, 11.1348F, -16.5055F, 6.0F, 6.0F, 5.0F, 0.0F, false);
		LeftFoot.texOffs(60, 331).addBox(-0.0376F, 14.1348F, -17.5055F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		LeftFoot.texOffs(60, 328).addBox(-5.0376F, 14.1348F, -17.5055F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		LeftFoot.texOffs(6, 322).addBox(-5.0376F, 10.1348F, -17.5055F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		LeftFoot.texOffs(60, 324).addBox(-5.0376F, 14.1348F, -16.5055F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		LeftFoot.texOffs(60, 320).addBox(0.9624F, 14.1348F, -16.5055F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r42 = new ModelRenderer(this);
		cube_r42.setPos(0.0F, 0.0F, 0.0F);
		LeftFoot.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.1362F, 0.8638F, -1.5968F);
		cube_r42.texOffs(34, 327).addBox(1.8F, -2.7F, -17.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		XLR8.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}