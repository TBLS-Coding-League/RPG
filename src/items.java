public enum ItemType
{
  IRON_SWORD(1, "Iron Sword"),
  DAWN_BRINGER(2, "Dawn Bringer"),
  HEALTH_POTION(3, "Health Potion"),
  IRON_HELMET(4, "Iron Helmet"),
  MANA_POTION(5, "Mana Potion"),
  FROST_FIRE_BOW,(6, "Frost Fire Bow"),
  LAST_HOPE,(7, "Last hope"),
  ECLIPSE,(8, "Eclipse"),
  DAY_BRINGER,(9, "day Bringer"),
  ARROWS,9(10, "Arrows")
  IRON_CHESTPLATE,(11, "Iron Chestplate"),
  IRON_BOOTS,(12, "Iron Boots"),
  IRON_GAUNTLET,(13, "Iron Gauntlet"),
  IRON_SHEILD,(14, "Iron sheild"),
  SHINY_CAPE,(15, "Shiny cape"),
  SOLAR_FLARE_HELMET,(16, "Solar Flare Helmet"),
  SOLAR_FLARE_CHESTPLATE,(17, "Solar Flare Chestplate"),
  SOLAR_FLARE_GREAVES,(18, "Solar Flare Greaves"),
  SOLAR_FLARE_BOOTS,(19, "Solar Flare Boots"),
  SOLAR_FLARE_SHEILD,(20, "Solar Flare Sheild"),
  SOLAR_FLARE_CAPE,(21, "Solar Flare Cape"),
  SOLAR_FLARE_GAUNTLET,(22, "Solar Flare Gauntlet"),
  IRON_GREAVES;(23, "Iron Greaves"),
  
  private int _id;
  private String _name;
  
  private ItemType(int id, String name)
  {
    
  }
  
  public int getId()
  {
    return _id;
  }
  
  public String getName()
  {
    return _name;
  }
}
