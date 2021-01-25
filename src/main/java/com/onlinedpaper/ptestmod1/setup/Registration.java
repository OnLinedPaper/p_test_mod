package com.onlinedpaper.ptestmod1.setup;

import com.onlinedpaper.ptestmod1.PTestMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	  public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PTestMod.MOD_ID);
	  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PTestMod.MOD_ID);
  
	  public static void register() {
		  IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		  BLOCKS.register(modEventBus);
		  ITEMS.register(modEventBus);
		  
		  TestItem.register();
	  }
}
