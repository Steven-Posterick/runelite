/*
 * Copyright (c) 2020, Arman S <https://github.com/Rman887>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.worldmap;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
enum DungeonLocation
{
	ABANDONED_MINE("Abandoned Mine", new WorldPoint(3439, 3232, 0)),
	ABANDONED_MINE_SECRET("Abandoned Mine (secret entrance)", new WorldPoint(3452, 3244, 0)),
	ANCIENT_CAVERN("Ancient Cavern", new WorldPoint(2511, 3508, 0)),
	APE_ATOLL("Ape Atoll Dungeon", new WorldPoint(2762, 2703, 0)),
	ARDOUGNE_CASTLE("Ardougne Castle basement", new WorldPoint(2569, 3296, 0)),
	ARDOUGNE_RAT_PITS("Ardougne Rat Pits", new WorldPoint(2560, 3320, 0)),
	ARDOUGNE_SEWERS_N("Ardougne Sewers", new WorldPoint(2631, 3294, 0)),
	ARDOUGNE_SEWERS_S("Ardougne Sewers", new WorldPoint(2586, 3235, 0)),
	ARDOUGNE_SEWERS_W("Ardougne Sewers", new WorldPoint(2528, 3303, 0)),
	ASGARNIAN_ICE("Asgarnian Ice Dungeon", new WorldPoint(3007, 3150, 0)),
	BRIMHAVEN_AGILITY("Brimhaven Agility Arena", new WorldPoint(2808, 3194, 0)),
	BRIMHAVEN_N("Brimhaven Dungeon", new WorldPoint(2743, 3154, 0)),
	BRIMHAVEN_S("Brimhaven Dungeon", new WorldPoint(2759, 3062, 0)),
	BRIMSTAILS_CAVE("Brimstail's Cave", new WorldPoint(2402, 3419, 0)),
	CATACOMBS_OF_KOUREND("Catacombs of Kourend", new WorldPoint(1636, 3673, 0)),
	CHAMBERS_OF_XERIC("Chambers of Xeric", new WorldPoint(1232, 3573, 0)),
	CHAMPIONS_CHALLENGE("Champions' Challenge", new WorldPoint(3188, 3355, 0)),
	CHAOS_DRUID_TOWER("Chaos Druid Tower dungeon", new WorldPoint(2561, 3356, 0)),
	CHASM_OF_FIRE("Chasm of Fire", new WorldPoint(1432, 3670, 0)),
	CLOCK_TOWER("Clock Tower Dungeon", new WorldPoint(2568, 3229, 0)),
	CORPOREAL_BEAST("Corporeal Beast cave", new WorldPoint(3202, 3681, 0)),
	CORSAIR_COVE_E("Corsair Cove Dungeon", new WorldPoint(2522, 2861, 0)),
	CORSAIR_COVE_N("Corsair Cove Dungeon", new WorldPoint(2482, 2891, 0)),
	CRABCLAW_CAVES("Crabclaw Caves", new WorldPoint(1643, 3449, 0)),
	CRABCLAW_CAVES_TUNNEL("Crabclaw Caves Tunnel (quest)", new WorldPoint(1671, 9800, 0)),
	CRANDOR("Crandor Dungeon", new WorldPoint(2833, 3256, 0)),
	CRASH_ISLAND("Crash Island Dungeon", new WorldPoint(2920, 2721, 0)),
	CRUMBLING_TOWER("Crumbling Tower basement", new WorldPoint(2130, 2994, 0)),
	DEEP_WILDERNESS("Deep Wilderness Dungeon", new WorldPoint(3044, 3924, 0)),
	DRAYNOR_MANOR_E("Draynor Manor basement", new WorldPoint(3114, 3357, 0)),
	DRAYNOR_MANOR_W("Draynor Manor basement", new WorldPoint(3091, 3362, 0)),
	DRAYNOR_SEWERS_NW("Draynor Sewers", new WorldPoint(3083, 3272, 0)),
	DRAYNOR_SEWERS_SE("Draynor Sewers", new WorldPoint(3117, 3244, 0)),
	DWARVEN_MINE("Dwarven Mine", new WorldPoint(3017, 3450, 0)),
	DWARVEN_MINE_STAIRS("Dwarven Mine", new WorldPoint(3058, 3377, 0)),
	ECTOFUNTUS("Ectofuntus dungeon", new WorldPoint(3651, 3519, 0)),
	EDGEVILLE("Edgeville Dungeon", new WorldPoint(3096, 3469, 0)),
	EDGEVILLE_SHED("Edgeville Dungeon", new WorldPoint(3115, 3452, 0)),
	EDGEVILLE_WILDERNESS("Edgeville Dungeon", new WorldPoint(3087, 3571, 0)),
	ENTRANA("Entrana Dungeon", new WorldPoint(2819, 3374, 0)),
	ETCETERIA("Miscellania and Etceteria Dungeon", new WorldPoint(2619, 3865, 0)),
	FALADOR_MOLE_NW("Mole Hole", new WorldPoint(2985, 3387, 0)),
	FALADOR_MOLE_SE("Mole Hole", new WorldPoint(2997, 3376, 0)),
	FORSAKEN_TOWER("Forsaken Tower basement", new WorldPoint(1381, 3825, 0)),
	FORTHOS_E("Forthos Dungeon", new WorldPoint(1701, 3574, 0)),
	FORTHOS_W("Forthos Dungeon", new WorldPoint(1669, 3567, 0)),
	FREMENNIK_SLAYER("Fremennik Slayer Dungeon", new WorldPoint(2796, 3615, 0)),
	GOBLIN_CAVE("Goblin Cave", new WorldPoint(2622, 3393, 0)),
	GOD_WARS("God Wars Dungeon", new WorldPoint(2917, 3747, 0)),
	GRAND_TREE("Grand Tree Tunnels", new WorldPoint(2462, 3496, 0)),
	GAUNTLET("The Gauntlet", new WorldPoint(3227, 6116, 0)),
	HAM_HIDEOUT("H.A.M. Hideout", new WorldPoint(3164, 3252, 0)),
	HEROES_GUILD("Heroes' Guild mine", new WorldPoint(2891, 3507, 0)),
	HESPORI("Hespori Patch", new WorldPoint(1231, 3729, 0)),
	ICE_QUEEN("Ice Queen's Lair", new WorldPoint(2846, 3516, 0)),
	ICE_QUEEN_E("Ice Queen's Lair", new WorldPoint(2856, 3519, 0)),
	ICE_QUEEN_W("Ice Queen's Lair", new WorldPoint(2822, 3510, 0)),
	ICE_TROLL_E("Ice Troll Caves", new WorldPoint(2400, 3889, 0)),
	ICE_TROLL_W("Ice Troll Caves", new WorldPoint(2315, 3894, 0)),
	ISLE_OF_SOULS_DUNGEON("Isle of Souls Dungeon", new WorldPoint(2308, 2919, 0)),
	IORWERTH("Iorwerth Dungeon", new WorldPoint(3224, 6044, 0)),
	IORWERTH_CAMP_CAVE("Iorwerth Camp cave", new WorldPoint(2200, 3262, 0)),
	IORWERTH_CAMP_CAVE_PRIF("Iorwerth Camp cave", new WorldPoint(3224, 6014, 0)),
	JOGRE("Jogre Dungeon", new WorldPoint(2824, 3118, 0)),
	JORMUNGANDS_PRISON("Jormungand's Prison", new WorldPoint(2464, 4012, 0)),
	KALPHITE_CAVE("Kalphite Cave", new WorldPoint(3319, 3122, 0)),
	KALPHITE_LAIR("Kalphite Lair", new WorldPoint(3226, 3108, 0)),
	KARAMJA_VOLCANO("Karamja Dungeon", new WorldPoint(2855, 3168, 0)),
	KARUULM_SLAYER("Karuulm Slayer Dungeon", new WorldPoint(1308, 3807, 0)),
	KING_BLACK_DRAGON("King Black Dragon Lair", new WorldPoint(3016, 3849, 0)),
	KELDAGRIM("Keldagrim Entrance", new WorldPoint(2730, 3713, 0)),
	KELDAGRIM_ENTRANCE_MOUNTAIN("Keldagrim Entrance", new WorldPoint(2795, 3718, 0)),
	KRAKEN_BOSS("Kraken (boss)", new WorldPoint(2279, 10017, 0)),
	KRAKEN_COVE("Kraken Cove", new WorldPoint(2277, 3611, 0)),
	LAVA_MAZE("Lava Maze Dungeon", new WorldPoint(3068, 3856, 0)),
	LEGENDS_GUILD("Legends' Guild dungeon", new WorldPoint(2723, 3375, 0)),
	LIGHTHOUSE("Lighthouse basement", new WorldPoint(2508, 3644, 0)),
	LIZARDMAN_CAVES("Lizardman Caves", new WorldPoint(1306, 3574, 0)),
	LIZARDMAN_TEMPLE_E("Lizardman Temple", new WorldPoint(1329, 3669, 0)),
	LIZARDMAN_TEMPLE_N("Lizardman Temple", new WorldPoint(1311, 3686, 0)),
	LIZARDMAN_TEMPLE_S("Lizardman Temple", new WorldPoint(1313, 3663, 0)),
	LIZARDMAN_TEMPLE_W("Lizardman Temple", new WorldPoint(1291, 3657, 0)),
	LUMBRIDGE_CASTLE("Lumbridge Castle cellar", new WorldPoint(3208, 3218, 0)),
	LUMBRIDGE_SWAMP("Lumbridge Swamp Caves", new WorldPoint(3168, 3172, 0)),
	LUNAR_ISLE("Lunar Isle Mine", new WorldPoint(2141, 3944, 0)),
	MAGE_ARENA("Mage Arena Bank", new WorldPoint(3089, 3956, 0)),
	MELZARS_MAZE("Melzar's Maze basement", new WorldPoint(2923, 3250, 0)),
	MINING_GUILD("Mining Guild basement", new WorldPoint(3018, 3339, 0)),
	MISCELLANIA("Miscellania and Etceteria Dungeon", new WorldPoint(2508, 3846, 0)),
	MOS_LE_HARMLESS("Mos Le'Harmless Cave", new WorldPoint(3747, 2973, 0)),
	MOS_LE_HARMLESS_ISLAND_E("Mos Le'Harmless Cave", new WorldPoint(3829, 3062, 0)),
	MOS_LE_HARMLESS_ISLAND_W("Mos Le'Harmless Cave", new WorldPoint(3814, 3062, 0)),
	MOTHERLODE_MINE("Motherlode Mine", new WorldPoint(3059, 9764, 0)),
	MOTHERLODE_MINE_GUILD("Motherlode Mine", new WorldPoint(3055, 9744, 0)),
	MYREQUE_HIDEOUT_CANAFIS("Myreque Hideout", new WorldPoint(3494, 3464, 0)),
	MYREQUE_HIDEOUT_SWAMP("Myreque Hideout", new WorldPoint(3508, 3448, 0)),
	MYTH_GUILD("Myths' Guild dungeon", new WorldPoint(2456, 2847, 0)),
	MYTH_GUILD_WRATH("Myths' Guild dungeon", new WorldPoint(2444, 2819, 0)),
	OBSERVATORY_NE("Observatory Dungeon", new WorldPoint(2458, 3186, 0)),
	OBSERVATORY_SW("Observatory Dungeon", new WorldPoint(2436, 3163, 0)),
	OGRE_ENCLAVE("Ogre Enclave", new WorldPoint(2505, 3039, 0)),
	OURANIA_CAVE("Ourania Cave", new WorldPoint(2451, 3231, 0)),
	PATERDOMUS("Paterdomus basement", new WorldPoint(3404, 3506, 0)),
	PORT_PHASMATYS_BREWERY("Port Phasmatys Brewery", new WorldPoint(3679, 3498, 0)),
	PORT_SARIM_RAT_PITS("Port Sarim Rat Pits", new WorldPoint(3017, 3232, 0)),
	QUIDAMORTEM_CAVE("Quidamortem Cave", new WorldPoint(1213, 3559, 0)),
	RED_CHIN_HUNTING("Red chinchompa hunting ground", new WorldPoint(2525, 2894, 0)),
	REVENANT_CAVES_N("Revenant Caves", new WorldPoint(3124, 3832, 0)),
	REVENANT_CAVES_S("Revenant Caves", new WorldPoint(3074, 3655, 0)),
	REVENANT_CAVES_W("Revenant Caves", new WorldPoint(3065, 3740, 0)),
	RIVER_ELID("River Elid Dungeon", new WorldPoint(3370, 3132, 0)),
	RIVER_KELDA("River Kelda", new WorldPoint(2835, 10112, 0)),
	SALT_MINE("Salt Mine", new WorldPoint(2866, 3941, 0)),
	SKAVID_CAVES_N("Skavid Caves", new WorldPoint(2521, 3070, 0)),
	SKAVID_CAVES_NE("Skavid Caves", new WorldPoint(2540, 3054, 0)),
	SKAVID_CAVES_NEE("Skavid Caves", new WorldPoint(2552, 3054, 0)),
	SKAVID_CAVES_E("Skavid Caves", new WorldPoint(2551, 3035, 0)),
	SKAVID_CAVES_ISLAND_E("Skavid Caves (island)", new WorldPoint(2574, 3028, 0)),
	SKAVID_CAVES_ISLAND_W("Skavid Caves (island)", new WorldPoint(2500, 2991, 0)),
	SKAVID_CAVES_S("Skavid Caves", new WorldPoint(2528, 3014, 0)),
	SKAVID_CAVES_SEE("Skavid Caves", new WorldPoint(2561, 3025, 0)),
	SCORPIA_E("Scorpia cave", new WorldPoint(3243, 3949, 0)),
	SCORPIA_N("Scorpia cave", new WorldPoint(3230, 3952, 0)),
	SCORPIA_S("Scorpia cave", new WorldPoint(3231, 3936, 0)),
	SHADE_CATACOMBS("Shade Catacombs", new WorldPoint(3484, 3321, 0)),
	SHAYZIEN_CRYPTS("Shayzien Crypts", new WorldPoint(1482, 3549, 0)),
	SHILO_VILLAGE_MINE("Shilo Village mine", new WorldPoint(2823, 3001, 0)),
	SISTERHOOD_SANCTUARY("Sisterhood Sanctuary", new WorldPoint(3727, 3300, 0)),
	SISTERHOOD_SANCTUARY_LAB("Sisterhood Sanctuary", new WorldPoint(3724, 3356, 0)),
	SLAYER_TOWER("Slayer Tower basement", new WorldPoint(3416, 3535, 0)),
	SLEPE_BASEMENT("Slepe basement", new WorldPoint(3718, 3307, 0)),
	SMOKE_DEVIL("Smoke Devil Dungeon", new WorldPoint(2411, 3061, 0)),
	SMOKE_DEVIL_BOSS("Thermonuclear Smoke Devil (boss)", new WorldPoint(2377, 9452, 0)),
	SMOKE_DUNGEON("Smoke Dungeon", new WorldPoint(3309, 2962, 0)),
	SOPHANEM("Sophanem Dungeon", new WorldPoint(3314, 2797, 0)),
	SOURHOG_CAVE("Sourhog Cave", new WorldPoint(3149, 3347, 0)),
	STRONGHOLD_OF_SECURITY("Stronghold of Security", new WorldPoint(3080, 3420, 0)),
	STRONGHOLD_SLAYER("Stronghold Slayer Dungeon", new WorldPoint(2427, 3424, 0)),
	TAVERLEY("Taverley Dungeon", new WorldPoint(2883, 3397, 0)),
	TAVERLEY_ISLAND("Taverley Dungeon", new WorldPoint(2841, 3424, 0)),
	TEMPLE_OF_IKOV("Temple of Ikov", new WorldPoint(2676, 3404, 0)),
	THEATRE_OF_BLOOD("Theatre of Blood", new WorldPoint(3676, 3219, 0)),
	TOLNAS_RIFT("Tolna's rift", new WorldPoint(3308, 3450, 0)),
	TOMBS_OF_AMASCUT("Tombs of Amascut", new WorldPoint(3358, 9240, 0)),
	TOWER_OF_LIFE("Tower of Life dungeon", new WorldPoint(2649, 3213, 0)),
	TRAHAEARN_MINE("Trahaearn Mine", new WorldPoint(3270, 6049, 0)),
	TREE_GNOME_VILLAGE("Tree Gnome Village Dungeon", new WorldPoint(2532, 3155, 0)),
	TROLL_STRONGHOLD("Troll Stronghold", new WorldPoint(2838, 3690, 0)),
	TROLL_STRONGHOLD_ROOF("Troll Stronghold", new WorldPoint(2830, 3677, 0)),
	TROLL_STRONGHOLD_MOUNTAIN("Troll Stronghold", new WorldPoint(2826, 3647, 0)),
	TUTORIAL_ISLAND_E("Tutorial Island mine", new WorldPoint(3110, 3126, 0)),
	TUTORIAL_ISLAND_W("Tutorial Island mine", new WorldPoint(3087, 3119, 0)),
	TZHAAR_CITY("TzHaar City (Mor Ul Rek)", new WorldPoint(2862, 9572, 0)),
	UNDERGROUND_PASS_KANDARIN("Underground Pass", new WorldPoint(2312, 3215, 0)),
	UNDERGROUND_PASS_TIRANNWN("Underground Pass", new WorldPoint(2433, 3315, 0)),
	UNDERGROUND_PASS_TIRANNWN_PRIF("Underground Pass", new WorldPoint(3336, 5967, 0)),
	UNDERWATER("Underwater", new WorldPoint(3765, 3898, 0)),
	UZER("Ruins of Uzer basement", new WorldPoint(3492, 3090, 0)),
	VARROCK_SEWERS("Varrock Sewers", new WorldPoint(3236, 3458, 0)),
	VARROCK_SEWERS_ZOO("Varrock Sewers", new WorldPoint(3229, 3504, 0)),
	VOLCANIC_MINE("Volcanic Mine", new WorldPoint(3815, 3808, 0)),
	VTAM_CORP("VTAM Corporation", new WorldPoint(3243, 3383, 0)),
	WARRENS("The Warrens", new WorldPoint(1812, 3745, 0)),
	WARRIORS_GUILD("Warriors' Guild basement", new WorldPoint(2832, 3542, 0)),
	WATERBIRTH("Waterbirth Dungeon", new WorldPoint(2520, 3740, 0)),
	WATERBIRTH_MOUNTAIN("Waterbirth Dungeon", new WorldPoint(2542, 3741, 0)),
	WATERBIRTH_SUBLEVELS("Waterbirth Dungeon (sub-levels)", new WorldPoint(2545, 10143, 0)),
	WEISS_HOLE("Hole (shortcut to boat)", new WorldPoint(2853, 3944, 0)),
	WEREWOLF_AGILITY("Werewolf Agility Course", new WorldPoint(3542, 3461, 0)),
	WHITE_WOLF_TUNNEL_E("White Wolf Tunnel", new WorldPoint(2876, 3480, 0)),
	WHITE_WOLF_TUNNEL_W("White Wolf Tunnel", new WorldPoint(2819, 3484, 0)),
	WILDERNESS_AGILITY("Wilderness Agility Course Dungeon", new WorldPoint(3004, 3963, 0)),
	WILDERNESS_GOD_WARS("Wilderness God Wars Dungeon", new WorldPoint(3016, 3739, 0)),
	WILDERNESS_SLAYER_CAVE_NORTH("Wilderness Slayer Cave", new WorldPoint(3292, 3746, 0)),
	WILDERNESS_SLAYER_CAVE_SOUTH("Wilderness Slayer Cave", new WorldPoint(3259, 3666, 0)),
	WITCHAVEN("Witchaven Dungeon", new WorldPoint(2695, 3283, 0)),
	WIZARDS_GUILD("Wizards' Guild basement", new WorldPoint(2593, 3085, 0)),
	WIZARDS_TOWER("Wizards' Tower basement", new WorldPoint(3103, 3162, 0)),
	WOODCUTTING_GUILD("Woodcutting Guild dungeon", new WorldPoint(1603, 3508, 0)),
	WYVERN_CAVE("Wyvern Cave", new WorldPoint(3745, 3779, 0)),
	WYVERN_CAVE_TASK("Wyvern Cave (task only)", new WorldPoint(3677, 3854, 0)),
	YANILLE_AGILITY("Yanille Agility Dungeon", new WorldPoint(2568, 3122, 0)),
	YANILLE_AGILITY_CITY("Yanille Agility Dungeon", new WorldPoint(2603, 3078, 0)),
	ZALCANO("Zalcano's Prison", new WorldPoint(3280, 6059, 0)),
	ZOGRE_CAVE("Zogre cave", new WorldPoint(2484, 3043, 0));

	private final String tooltip;
	private final WorldPoint location;

	DungeonLocation(String tooltip, WorldPoint location)
	{
		this.tooltip = tooltip;
		this.location = location;
	}
}
