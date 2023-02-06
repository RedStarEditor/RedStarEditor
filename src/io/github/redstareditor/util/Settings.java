package io.github.redstareditor.util;

import io.github.redstareditor.RedStar;

import java.io.File;
import java.util.prefs.Preferences;

public class Settings {
    static String dP = System.getProperty("user.dir");
    public static void init() {
        try {dP = new File(RedStar.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath(); } catch (Exception e) { e.printStackTrace(); }
    }
    public static final Preferences settings = Preferences.userRoot();

    public static int getTheme() { return settings.getInt("RedStar_Theme", 0); }
    public static void setTheme(int val) { settings.putInt("RedStar_Theme",val); }

    public static boolean getShowFilenames() { return settings.getBoolean("RedStar_ShowFileNames", false); }
    public static void setShowFileNames(boolean val) { settings.putBoolean("RedStar_ShowFileNames",val); }

    public static String getLastFileLocation() { return settings.get("RedStar_FileLoc", dP); }
    public static void setLastFileLocation(String val) { settings.put("RedStar_FileLoc",val); }
    public static void setLastFileLocation() { settings.put("RedStar_FileLoc",dP); } //resets it
}
