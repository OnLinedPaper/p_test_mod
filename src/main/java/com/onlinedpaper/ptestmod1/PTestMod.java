package com.onlinedpaper.ptestmod1;

import com.onlinedpaper.ptestmod1.setup.Registration;

import net.minecraftforge.fml.common.Mod;

@Mod(PTestMod.MOD_ID)
public class PTestMod {
	public static final String MOD_ID = "ptestmod1";
	
	public PTestMod() {
		Registration.register();
	}

}
