package sobiohazardous.minestrappolation.extradecor.gui;

import org.lwjgl.opengl.GL11;

import sobiohazardous.minestrappolation.extradecor.container.ContainerCrate;
import sobiohazardous.minestrappolation.extradecor.tileentity.TileEntityCrate;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.ResourceLocation;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.src.*;
import net.minecraft.util.StatCollector;

public class GuiCrate extends GuiContainer
{

	public GuiCrate(InventoryPlayer player_inventory, TileEntityCrate tile_entity)
	{
		
		super(new ContainerCrate(tile_entity, player_inventory));
	}

	@Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) 
	{
		fontRenderer.drawString("Crate", 6, 6, 0xffffff);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 6, ySize - 96 + 2, 0xffffff);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		ResourceLocation gui = new ResourceLocation("gui/crate.png");
		this.mc.renderEngine.func_110577_a(gui);		
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
}