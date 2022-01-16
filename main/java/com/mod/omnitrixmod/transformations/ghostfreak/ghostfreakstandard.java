package com.mod.omnitrixmod.transformations.ghostfreak;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class ghostfreakstandard extends PlayerModel<LivingEntity> {
	private final ModelRenderer GhostFreak;
	private final ModelRenderer Torso;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Omnitrix;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer Head;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer TailJoint1;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer TailJoint2;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer TailJoint3;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer TailJoint4;
	private final ModelRenderer cube_r28;
	private final ModelRenderer TailJoint5;
	private final ModelRenderer cube_r29;
	private final ModelRenderer TailJoint6;
	private final ModelRenderer cube_r30;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;

	public ghostfreakstandard() {
		super(.05f,true);
		texWidth = 256;
		texHeight = 256;

		GhostFreak = new ModelRenderer(this);
		GhostFreak.setPos(0.0F, -40.0F, -7.0F);
		setRotationAngle(GhostFreak, -3.1416F, 0.0F, 3.1416F);


		Torso = new ModelRenderer(this);
		Torso.setPos(0.0F, -10.699F, -0.1339F);
		GhostFreak.addChild(Torso);
		Torso.texOffs(48, 103).addBox(15.9617F, -15.001F, -15.9645F, 2.0F, 15.0F, 16.0F, 0.0F, false);
		Torso.texOffs(0, 0).addBox(-16.0383F, -16.001F, -16.9645F, 32.0F, 17.0F, 18.0F, 0.0F, false);
		Torso.texOffs(84, 103).addBox(-18.0383F, -15.001F, -15.9645F, 2.0F, 15.0F, 16.0F, 0.0F, false);
		Torso.texOffs(0, 35).addBox(-9.0383F, -21.001F, -15.9645F, 18.0F, 5.0F, 16.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-0.0383F, 5.0F, -16.0984F);
		Torso.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.texOffs(124, 85).addBox(-12.0F, -7.5F, -0.5F, 24.0F, 15.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(9.6737F, -18.2283F, -7.9645F);
		Torso.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5672F);
		cube_r2.texOffs(0, 134).addBox(-2.5F, -1.5F, -7.0F, 9.0F, 6.0F, 14.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-8.1384F, -15.6982F, -7.9645F);
		Torso.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5672F);
		cube_r3.texOffs(120, 103).addBox(-6.5F, -4.5F, -7.0F, 9.0F, 6.0F, 14.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(13.9617F, 6.7948F, -8.7992F);
		Torso.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1687F, 0.045F, 0.258F);
		cube_r4.texOffs(46, 134).addBox(-3.5F, -9.0F, -6.0F, 5.0F, 17.0F, 12.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-0.0383F, 8.0971F, -1.4131F);
		Torso.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
		cube_r5.texOffs(72, 85).addBox(-12.0F, -8.0F, -2.0F, 24.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-0.0383F, 10.699F, -7.9645F);
		Torso.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
		cube_r6.texOffs(100, 0).addBox(-13.0F, -11.7F, -8.5F, 26.0F, 17.0F, 14.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-14.0383F, 6.7948F, -8.7992F);
		Torso.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1687F, -0.045F, -0.258F);
		cube_r7.texOffs(80, 134).addBox(-1.5F, -9.0F, -6.0F, 5.0F, 17.0F, 12.0F, 0.0F, false);

		Omnitrix = new ModelRenderer(this);
		Omnitrix.setPos(-0.0956F, -6.6864F, 8.6484F);
		Torso.addChild(Omnitrix);
		Omnitrix.texOffs(64, 213).addBox(-4.4427F, -1.5146F, -8.3629F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(0, 238).addBox(-1.4427F, 1.4854F, -8.3629F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(98, 228).addBox(-1.4427F, -4.5146F, -8.3629F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(24, 245).addBox(1.5573F, -3.2646F, -8.3629F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(18, 245).addBox(-3.4427F, -3.2646F, -8.3629F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(12, 245).addBox(-3.4427F, 1.4854F, -8.3629F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(6, 245).addBox(1.5573F, 1.0854F, -8.3629F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(58, 245).addBox(3.3573F, 1.1854F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(54, 245).addBox(-4.2427F, 1.1854F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(50, 245).addBox(-4.2427F, -2.2146F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(46, 245).addBox(3.3573F, -2.2146F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(42, 245).addBox(1.5573F, -4.1146F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(38, 245).addBox(-2.4427F, -4.1146F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(34, 245).addBox(-2.4427F, 2.9854F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Omnitrix.texOffs(30, 245).addBox(1.5573F, 3.0854F, -8.3629F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-0.0383F, 0.0F, -8.0984F);
		Omnitrix.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
		cube_r8.texOffs(66, 220).addBox(0.8105F, -3.9665F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(96, 220).addBox(-2.5609F, 0.9894F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(0, 245).addBox(-3.3206F, 2.1323F, -1.0145F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r8.texOffs(90, 228).addBox(-4.2787F, -0.7735F, -1.0145F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r8.texOffs(90, 233).addBox(2.0088F, -2.9349F, -1.0145F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r8.texOffs(0, 228).addBox(-2.5516F, 0.2279F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(20, 228).addBox(0.8171F, -3.428F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(28, 220).addBox(-1.9068F, -4.8453F, -1.2645F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(50, 228).addBox(-4.7433F, -2.0651F, -1.2645F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(42, 220).addBox(-1.9277F, 3.7452F, -1.2645F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r8.texOffs(66, 228).addBox(3.9088F, -2.0349F, -1.2645F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-0.0383F, 0.0F, -8.0984F);
		Omnitrix.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
		cube_r9.texOffs(76, 220).addBox(-2.5497F, -4.0164F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(86, 220).addBox(0.8217F, 0.8396F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(106, 220).addBox(-2.5405F, -3.2548F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(10, 228).addBox(0.8282F, 0.3011F, -2.0145F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(42, 228).addBox(3.9199F, -1.992F, -1.2645F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(28, 224).addBox(-1.9166F, -4.7722F, -1.2645F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(58, 228).addBox(-4.7322F, -1.9618F, -1.2645F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r9.texOffs(42, 224).addBox(-1.8957F, 3.8184F, -1.2645F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -32.0F, 0.0F);
		GhostFreak.addChild(Head);
		Head.texOffs(64, 56).addBox(-7.0383F, -13.65F, -15.0984F, 14.0F, 15.0F, 14.0F, 0.0F, false);
		Head.texOffs(24, 180).addBox(-9.0383F, -12.65F, -13.0984F, 2.0F, 14.0F, 10.0F, 0.0F, false);
		Head.texOffs(0, 180).addBox(6.9617F, -12.65F, -13.0984F, 2.0F, 14.0F, 10.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setPos(0.0F, 2.6087F, -2.2029F);
		GhostFreak.addChild(Tail);


		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(11.4617F, 7.0F, -10.0984F);
		Tail.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3442F, 0.0594F, 0.1642F);
		cube_r10.texOffs(48, 180).addBox(-1.7F, -6.0F, -4.0F, 2.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(-11.5383F, 7.0F, -10.0984F);
		Tail.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3442F, -0.0594F, -0.1642F);
		cube_r11.texOffs(68, 180).addBox(-0.3F, -6.0F, -4.0F, 2.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(-0.0383F, 8.8811F, -4.9301F);
		Tail.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.48F, 0.0F, 0.0F);
		cube_r12.texOffs(114, 134).addBox(-10.0F, -7.1F, -2.7F, 20.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-0.0383F, 5.1189F, -15.2667F);
		Tail.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
		cube_r13.texOffs(0, 163).addBox(-10.0F, -6.0F, -0.25F, 20.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-0.0383F, 8.7516F, -9.6718F);
		Tail.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
		cube_r14.texOffs(0, 56).addBox(-11.0F, -7.5F, -6.0F, 22.0F, 13.0F, 10.0F, 0.0F, false);

		TailJoint1 = new ModelRenderer(this);
		TailJoint1.setPos(8.0F, 12.5316F, -3.8731F);
		Tail.addChild(TailJoint1);


		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-8.0383F, 2.8135F, -14.6883F);
		TailJoint1.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.4363F, 0.0F, 0.0F);
		cube_r15.texOffs(118, 163).addBox(-8.0F, -6.0F, -0.15F, 16.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(-8.0383F, 6.8286F, -8.9542F);
		TailJoint1.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.texOffs(82, 163).addBox(-8.0F, -7.0F, -1.75F, 16.0F, 13.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(-8.0383F, -3.78F, -5.7987F);
		TailJoint1.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.6109F, 0.0F, 0.0F);
		cube_r17.texOffs(0, 103).addBox(-9.0F, 4.5F, -3.0F, 18.0F, 13.0F, 6.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(-17.5383F, 4.8211F, -11.8213F);
		TailJoint1.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.6037F, -0.0998F, -0.1434F);
		cube_r18.texOffs(40, 204).addBox(-0.3F, -6.0F, -2.0F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(1.4617F, 4.8211F, -11.8213F);
		TailJoint1.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.6037F, 0.0998F, 0.1434F);
		cube_r19.texOffs(52, 204).addBox(-1.7F, -6.0F, -2.0F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		TailJoint2 = new ModelRenderer(this);
		TailJoint2.setPos(0.0F, 10.0F, -7.0F);
		TailJoint1.addChild(TailJoint2);


		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(-0.0383F, 4.0F, -12.5984F);
		TailJoint2.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.8708F, 0.0668F, 0.0562F);
		cube_r20.texOffs(84, 204).addBox(-2.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(-16.0383F, 4.0F, -12.5984F);
		TailJoint2.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.8684F, -0.1002F, -0.0844F);
		cube_r21.texOffs(92, 204).addBox(0.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(-8.0383F, -13.78F, 1.2013F);
		TailJoint2.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.8727F, 0.0F, 0.0F);
		cube_r22.texOffs(44, 163).addBox(-7.5F, 16.0F, 2.75F, 15.0F, 13.0F, 4.0F, 0.0F, false);

		TailJoint3 = new ModelRenderer(this);
		TailJoint3.setPos(-14.0F, 7.0707F, -8.9265F);
		TailJoint2.addChild(TailJoint3);


		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(-0.0383F, 4.0F, -12.0984F);
		TailJoint3.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.8608F, -0.1666F, -0.1415F);
		cube_r23.texOffs(30, 228).addBox(-0.4F, -5.0F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(11.9617F, 4.0F, -12.0984F);
		TailJoint3.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.8608F, 0.1666F, 0.1415F);
		cube_r24.texOffs(36, 228).addBox(-1.6F, -5.0F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(5.9617F, 4.766F, -11.4557F);
		TailJoint3.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.9599F, 0.0F, 0.0F);
		cube_r25.texOffs(0, 204).addBox(-4.5F, -4.0F, -0.5F, 9.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(5.9617F, 3.234F, -12.7412F);
		TailJoint3.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
		cube_r26.texOffs(20, 204).addBox(-4.5F, -4.0F, -0.5F, 9.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(5.9617F, -20.8507F, 10.1278F);
		TailJoint3.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.8727F, 0.0F, 0.0F);
		cube_r27.texOffs(88, 180).addBox(-5.5F, 29.0F, 3.75F, 11.0F, 9.0F, 2.0F, 0.0F, false);

		TailJoint4 = new ModelRenderer(this);
		TailJoint4.setPos(6.0F, 6.5808F, -6.8803F);
		TailJoint3.addChild(TailJoint4);


		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(-0.0383F, 5.5F, -14.8484F);
		TailJoint4.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.9599F, 0.0F, 0.0F);
		cube_r28.texOffs(48, 238).addBox(-4.5F, -8.5714F, -1.15F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r28.texOffs(52, 238).addBox(3.5F, -8.5714F, -1.15F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r28.texOffs(64, 204).addBox(-3.5F, -8.5714F, -1.65F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		TailJoint5 = new ModelRenderer(this);
		TailJoint5.setPos(0.0F, 3.5888F, -5.4098F);
		TailJoint4.addChild(TailJoint5);


		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(-0.0383F, 2.5F, -11.5984F);
		TailJoint5.addChild(cube_r29);
		setRotationAngle(cube_r29, -1.0472F, 0.0F, 0.0F);
		cube_r29.texOffs(72, 238).addBox(-2.5F, -3.875F, -0.7F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r29.texOffs(76, 238).addBox(1.5F, -3.875F, -0.7F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r29.texOffs(56, 220).addBox(-1.5F, -3.875F, -1.2F, 3.0F, 6.0F, 2.0F, 0.0F, false);

		TailJoint6 = new ModelRenderer(this);
		TailJoint6.setPos(0.0F, 3.3893F, -5.2393F);
		TailJoint5.addChild(TailJoint6);


		cube_r30 = new ModelRenderer(this);
		cube_r30.setPos(-0.0383F, 0.75F, -9.5984F);
		TailJoint6.addChild(cube_r30);
		setRotationAngle(cube_r30, -1.1345F, 0.0F, 0.0F);
		cube_r30.texOffs(78, 230).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(-18.3632F, -18.1036F, 0.1249F);
		GhostFreak.addChild(LeftArm);


		cube_r31 = new ModelRenderer(this);
		cube_r31.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r31);
		setRotationAngle(cube_r31, 1.7764F, -1.1301F, 0.0319F);
		cube_r31.texOffs(28, 238).addBox(1.1215F, 0.7654F, 3.2691F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r32);
		setRotationAngle(cube_r32, -2.5988F, 1.2962F, 2.2331F);
		cube_r32.texOffs(28, 240).addBox(2.8834F, -0.1791F, -2.9106F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.3295F, 0.7268F, -1.8716F);
		cube_r33.texOffs(38, 238).addBox(-5.518F, -1.5673F, 0.2887F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.1298F, 0.7769F, -1.2122F);
		cube_r34.texOffs(64, 238).addBox(-2.0818F, -0.6278F, 0.2887F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r35);
		setRotationAngle(cube_r35, -3.1416F, 1.4835F, 1.7453F);
		cube_r35.texOffs(64, 240).addBox(-1.7971F, -0.9661F, 3.293F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.2921F, 0.7401F, -1.8157F);
		cube_r36.texOffs(78, 228).addBox(-6.571F, -1.4749F, -1.9613F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.1298F, 0.7769F, -1.2122F);
		cube_r37.texOffs(64, 242).addBox(-2.0818F, -0.6778F, -1.9613F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r38);
		setRotationAngle(cube_r38, -2.9478F, 1.2962F, 2.2331F);
		cube_r38.texOffs(38, 240).addBox(2.8834F, -0.2287F, 0.0233F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setPos(-20.0383F, 40.0F, 12.9016F);
		LeftArm.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.7854F, -1.3963F);
		cube_r39.texOffs(14, 220).addBox(0.9138F, -1.0044F, -2.2113F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setPos(-2.1751F, -0.0964F, -8.2234F);
		LeftArm.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.7854F, -1.0908F);
		cube_r40.texOffs(0, 85).addBox(-42.25F, 0.0F, -19.0F, 31.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setPos(-2.1751F, -0.0964F, -8.2234F);
		LeftArm.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -1.0908F);
		cube_r41.texOffs(144, 35).addBox(-23.25F, -1.0F, -3.5F, 31.0F, 6.0F, 7.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(18.5F, -19.2F, 0.0F);
		GhostFreak.addChild(RightArm);


		cube_r42 = new ModelRenderer(this);
		cube_r42.setPos(1.9617F, 1.0F, -8.0984F);
		RightArm.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 1.0908F);
		cube_r42.texOffs(68, 35).addBox(-7.75F, -1.0F, -3.5F, 31.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r43 = new ModelRenderer(this);
		cube_r43.setPos(1.9617F, 1.0F, -8.0984F);
		RightArm.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -0.7854F, 1.0908F);
		cube_r43.texOffs(120, 56).addBox(11.25F, 0.0F, -19.0F, 31.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, -0.7854F, 1.3963F);
		cube_r44.texOffs(0, 220).addBox(-3.9138F, -1.0044F, -2.2113F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r45 = new ModelRenderer(this);
		cube_r45.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r45);
		setRotationAngle(cube_r45, -2.9478F, -1.2962F, -2.2331F);
		cube_r45.texOffs(8, 238).addBox(-3.8834F, -0.2287F, 0.0233F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.1298F, -0.7769F, 1.2122F);
		cube_r46.texOffs(56, 238).addBox(-0.9182F, -0.6778F, -1.9613F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r47 = new ModelRenderer(this);
		cube_r47.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.2921F, -0.7401F, 1.8157F);
		cube_r47.texOffs(66, 235).addBox(1.571F, -1.4749F, -1.9613F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r48 = new ModelRenderer(this);
		cube_r48.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r48);
		setRotationAngle(cube_r48, -3.1416F, -1.4835F, -1.7453F);
		cube_r48.texOffs(56, 240).addBox(-1.2029F, -0.9661F, 3.293F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r49 = new ModelRenderer(this);
		cube_r49.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.1298F, -0.7769F, 1.2122F);
		cube_r49.texOffs(56, 242).addBox(-0.9182F, -0.6278F, 0.2887F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r50 = new ModelRenderer(this);
		cube_r50.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.3295F, -0.7268F, 1.8716F);
		cube_r50.texOffs(8, 242).addBox(1.518F, -1.5673F, 0.2887F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r51 = new ModelRenderer(this);
		cube_r51.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r51);
		setRotationAngle(cube_r51, -2.5988F, -1.2962F, -2.2331F);
		cube_r51.texOffs(18, 238).addBox(-3.8834F, -0.1791F, -2.9106F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r52 = new ModelRenderer(this);
		cube_r52.setPos(19.8249F, 41.0964F, 13.0265F);
		RightArm.addChild(cube_r52);
		setRotationAngle(cube_r52, 1.7764F, 1.1301F, -0.0319F);
		cube_r52.texOffs(18, 242).addBox(-5.1215F, 0.7654F, 3.2691F, 4.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		GhostFreak.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}